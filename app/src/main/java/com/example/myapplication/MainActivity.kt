package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tCiudad)
        tvGrados = findViewById(R.id.tGrados)
        tvEstatus = findViewById(R.id.tEstatus)

        val ciudad = intent.getStringExtra("com.example.myapplication.ciudades.CIUDAD")
        Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()

        //Objetos de la clase Ciudad.kt
        val ciudadLP = Ciudad("Ciudad de La Paz", 15,"Soleado")
        val ciudadCbb = Ciudad("Ciudad de Cochabamba",10, "Lluvioso")

        if(ciudad == "Ciudad de La Paz"){
            //Mostrar informacion de la ciudad de La Paz
            tvCiudad?.text = ciudadLP.nombre
            tvGrados?.text = ciudadLP.grados.toString() + "°"
            tvEstatus?.text = ciudadLP.estatus

        }else if (ciudad == "Ciudad de Cochabamba"){
            // Mostrar informacion de la ciudad de Cocahbamba

            tvCiudad?.text = ciudadCbb.nombre
            tvGrados?.text = ciudadCbb.grados.toString() + "°"
            tvEstatus?.text = ciudadCbb.estatus
        }else{
            Toast.makeText(this, "No se encontro la informacion", Toast.LENGTH_SHORT).show()
        }

    }
}
