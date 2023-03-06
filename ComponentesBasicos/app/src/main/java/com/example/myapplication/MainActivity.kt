package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    CheckBox c1,c2,c3;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.Btn)
        button.setOnClickListener{ capturarDatos() }

        c1= (CheckBox) findViewById(R.id.checkbox1);
        c2 = (CheckBox) findViewById(R.id.checkbox2);
        c3 = (CheckBox) findViewById(R.id.checkbox3);
    }

    private fun  capturarDatos(){
        val campoTexto:EditText=findViewById(R.id.PrintName)
        var nombre:String=campoTexto.text.toString()
        String cad = "Seleccionado: \n";

        if (c1.isChecked()==true){
            cad+="opcion1";
        }
        if (c2.isChecked()==true){
            cad+="opcion2";
        }
        Toast.makeText(getapplicationContext(),cad,Toast.LENGTH_LONG).show()
    }
}