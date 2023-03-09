package com.example.saludoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var campoTexto:EditText?=null
    var txtResultado:TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoTexto=findViewById(R.id.name)
        txtResultado=findViewById(R.id.txtResultado)

        val Boton:Button= findViewById(R.id.BtnIngresar)
        Boton.setOnClickListener{onClick(boton:1)}

        val Boton2:Button= findViewById(R.id.BtnIngresar2)
        Boton2.setOnClickListener{onClick(boton:2)}
    }

    private fun onClick() {
        when (boton){
            1 -> {
                val campoTexto: EditText = findViewById(R.id.name)
                var nombre: String = campoTexto!!.text.toString()
                txtResultado!!.text="Bienvenido $nombre"
                Toast.makeText(this, "Bienvenido $nombre", Toast.LENGTH_LONG).show()
            }
            2-> {
                val intent = Intent( this, ActivityMesaje::class.java)
                val miBundle:Bundle= Bundle()
                miBundle.putString("Nombre",campoTexto!!.text.toString())
                intent.putExtras(miBundle)
                startActivity(intent)
            }
        }
    }
}