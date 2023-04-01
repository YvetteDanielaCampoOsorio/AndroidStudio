package com.example.notasestudiantes1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var campoNombre: EditText?=null
    private var campoMateria: EditText?=null
    private var campoN1:EditText?=null
    private var campoN2:EditText?=null
    private var campoN3:EditText?=null
    private var colorEstado : Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campoNombre=findViewById(R.id.txtName)
        campoMateria=findViewById(R.id.txtMateria)
        campoN1=findViewById(R.id.txtNota1)
        campoN2=findViewById(R.id.txtNota2)
        campoN3=findViewById(R.id.txtNota3)

        val Btn: Button = findViewById(R.id.BtnIngresar)
        Btn.setOnClickListener{ onClick() }
    }
    private fun onClick () {
        var nombre:String = campoNombre!!.text.toString()
        var materia:String = campoMateria!!.text.toString()
        var nota1: Double = campoN1!!.text.toString().toDouble()
        var nota2:Double = campoN2!!.text.toString().toDouble()
        var nota3:Double = campoN3!!.text.toString().toDouble()

        var estado:String=""

        var Promedio:Double=(nota1 + nota2 + nota3) / 3


        if (Promedio >= 3.5){
            estado += "APROBO"
            colorEstado = true
        }else{
            estado += "REPROBO"
            colorEstado = false
        }

        val intent = Intent(this, ActivityResult::class.java)
        val miBundle: Bundle = Bundle()
        miBundle.putString("Nombre", nombre!!)
        miBundle.putString("Materia", materia!!)
        miBundle.putDouble("nota1", nota1!!)
        miBundle.putDouble("nota2", nota2!!)
        miBundle.putDouble("nota3", nota3!!)
        miBundle.putDouble("Promedio", Promedio!!)
        miBundle.putString("estado", estado!!)

        intent.putExtras(miBundle)
        startActivity(intent)
            }
        }