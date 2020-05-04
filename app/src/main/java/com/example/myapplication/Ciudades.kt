package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.myapplication.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val btLaPaz = findViewById<Button>(R.id.btLaPaz)
        val btCbba = findViewById<Button>(R.id.btCbb)

        btLaPaz.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "Ciudad de La Paz")
            startActivity(intent)
        })
        btCbba.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"Ciudad de Cochabamba")
            startActivity(intent)
        })

    }
}
