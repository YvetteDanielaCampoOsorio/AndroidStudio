package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var Radio1:RadioButton?=null
    var Radio2:RadioButton?=null

    var Check1:CheckBox?=null
    var Check2:CheckBox?=null
    var Check3:CheckBox?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Radio1=findViewById(R.id.radio1)
        Radio2=findViewById(R.id.radio2)

        Check1=findViewById(R.id.checkbox1)
        Check2=findViewById(R.id.checkbox2)
        Check3=findViewById(R.id.checkbox3)


        val buttonValidar:Button=findViewById(R.id.Btn)
        buttonValidar.setOnClickListener{ capturarDatos() }

    }

    private fun  capturarDatos(){

        val campoTexto:EditText=findViewById(R.id.name)
        var nombre:String=campoTexto.text.toString()

        var radio0:String="Seleccionaste: \n"

        if (Radio1?.isChecked()==true){
            radio0+="Femenino \n";
        }
        if (Check2?.isChecked()==true){
            radio0+="Masculino \n";
        }

        var check0:String="Seleccionaste: \n"

        if (Check1?.isChecked()==true){
            check0+="Cine \n";
        }
        if (Check2?.isChecked()==true){
            check0+="Musica \n";
        }
        if (Check3?.isChecked()==true){
            check0+="Video juegos \n";
        }

        Toast.makeText( this,"Bienvenido $nombre \n  $radio0 \n $check0",Toast.LENGTH_LONG).show()
    }
}