package com.example.saludoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Boton:Button= findViewById(R.id.BtnIngresar)
        Boton.setOnClickListener{onClick()}
    }

    private fun onClick() {

        val campoTexto:EditText=findViewById(R.id.name)
        var nombre:String=campoTexto.text.toString()
        Toast.makeText( this, "Bienvenido $nombre",Toast.LENGTH_LONG).show()
    }
}