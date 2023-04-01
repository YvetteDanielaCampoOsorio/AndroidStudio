package com.example.cargardatos

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Usuario: EditText?=null
    var Contraseña: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCargar: Button =findViewById(R.id.btnCargar)
        btnCargar.setOnClickListener{cargarDatos()}

    }

    private fun cargarDatos() {
        val Usuario: EditText?=findViewById(R.id.idUser)
        val  Contraseña: EditText?=findViewById(R.id.idContra)

        var preferences: SharedPreferences =getSharedPreferences("credenciales", Context.MODE_PRIVATE)

        var editor: SharedPreferences.Editor=preferences.edit()
        var usuario= Usuario?.text.toString()
        var contraseña= Contraseña?.text.toString()

        editor.putString("user", usuario)
        editor.putString("pass", contraseña)

        editor.commit()

        var intent: Intent = Intent(this, ActivityMensaje::class.java)
        startActivity(intent)

        Toast.makeText(this,"Se han registrado los datos", Toast.LENGTH_SHORT).show()

    }

}