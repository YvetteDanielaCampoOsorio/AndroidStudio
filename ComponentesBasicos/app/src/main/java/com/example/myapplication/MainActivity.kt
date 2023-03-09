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

    var switch1:Switch?=null

     var Toggle1:ToggleButton?=null

    var imageBtn:ImageButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Radio1=findViewById(R.id.radio1)
        Radio2=findViewById(R.id.radio2)

        Check1=findViewById(R.id.checkbox1)
        Check2=findViewById(R.id.checkbox2)
        Check3=findViewById(R.id.checkbox3)

        switch1= findViewById(R.id.Switch)

        Toggle1=findViewById(R.id.ToggleBtn)

        imageBtn=findViewById(R.id.imageBtn)

        val buttonValidar:Button=findViewById(R.id.Btn)
        buttonValidar.setOnClickListener{ capturarDatos() }

    }

    private fun  capturarDatos(){

        val campoTexto:EditText=findViewById(R.id.name)
        var nombre:String=campoTexto.text.toString()

        var radio0:String="Seleccionaste: \n"
        if (Radio1?.isChecked()==true){
            radio0+="Femenino \n";
        } else if (Radio2?.isChecked()==true){
            radio0+="Masculino \n";
        } else {
            radio0+="seleciona un valor \n";
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

        var switch0:String="Switch: \n "
            if (switch1?.isChecked() == true){
                switch0+="activado \n";
            }else{
                switch0+="Inactivado \n";
            }

        var ToggleButton0:String="Toggle Button: \n"
            if (Toggle1?.isChecked() == true){
                ToggleButton0 += "Activo"
            }else {
                ToggleButton0 += "Inactivo"
            }

        var ImageBtn0:String="Image Button"

        Toast.makeText( this,"Bienvenido $nombre \n  $radio0 \n $check0 \n $switch0 \n $ToggleButton0 \n $ImageBtn0",Toast.LENGTH_LONG).show()
    }
}


