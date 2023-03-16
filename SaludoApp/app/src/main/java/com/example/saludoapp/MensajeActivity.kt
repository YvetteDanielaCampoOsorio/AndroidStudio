package com.example.saludoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MensajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)
        val campoMensaje=findViewById<TextView>(R.id.txtMesage)

        var miBundle: Bundle? =this.intent.extras

        if(miBundle != null){
            campoMensaje.text="hola ${miBundle.getString( "Nombre")} Bienvenido"
        }

        val  botonSalir: Button =findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{ onClick()}
    }

    private fun onClick() {
        finish()
    }
}