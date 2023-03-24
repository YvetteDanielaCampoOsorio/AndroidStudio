package com.example.notasestudiantes1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var campoNombre: EditText?=null
    var campoMateria: EditText?=null
    var campoN1: EditText?=null
    var campoN2: EditText?=null
    var campoN3: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campoNombre=findViewById(R.id.txtName)
        campoMateria=findViewById(R.id.txtMateria)
        campoN1=findViewById(R.id.txtNota1)
        campoN2=findViewById(R.id.txtNota2)
        campoN3=findViewById(R.id.txtNota3)

        val Boton: Button = findViewById(R.id.BtnIngresar)
        Boton.setOnClickListener{ onClick() }
    }
    private fun onClick () {
        
                val intent = Intent(this, activityResultRegistry::class.java)
                val miBundle: Bundle = Bundle()
                miBundle.putString("Nombre", campoTexto!!.text.toString())
                intent.putExtras(miBundle)
                startActivity(intent)
            }
        }