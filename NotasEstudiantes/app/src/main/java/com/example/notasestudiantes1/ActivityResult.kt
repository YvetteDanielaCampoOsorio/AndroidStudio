package com.example.notasestudiantes1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val rCampoNombre=findViewById<TextView>(R.id.Rnombre)
        val rCampoMateria=findViewById<TextView>(R.id.RMateria)
        val rCampoN1=findViewById<TextView>(R.id.RNota1)
        val rCampoN2=findViewById<TextView>(R.id.RNota2)
        val rCampoN3=findViewById<TextView>(R.id.RNota3)
        val rCampoPromedio=findViewById<TextView>(R.id.RPromedio)
        val rCampoEstado=findViewById<TextView>(R.id.REstado)

        var miBundle: Bundle? =this.intent.extras

        if(miBundle != null){
            rCampoNombre.text="Nombre: ${miBundle.getString( "Nombre")}"
            rCampoMateria.text="Materia: ${miBundle.getString( "Materia")}"
            rCampoN1.text="Nota1: ${miBundle.getDouble( "nota1")}"
            rCampoN2.text="Nota2: ${miBundle.getDouble( "nota2")}"
            rCampoN3.text="Nota3: ${miBundle.getDouble( "nota3")}"
            rCampoPromedio.text="Promedio: ${miBundle.getDouble( "Promedio")}"
            rCampoEstado.text="Estado: ${miBundle.getString( "estado")}"
        }

        val  botonSalir: Button =findViewById(R.id.BtnRsalir)
        botonSalir.setOnClickListener{ onClick()}
    }

    private fun onClick() {
        finish()
    }
}