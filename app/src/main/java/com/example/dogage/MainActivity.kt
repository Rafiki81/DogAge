package com.example.dogage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.dogage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //Usando dataBinding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val ageEdit: EditText = findViewById(R.id.age_edit)
        //val resultText: TextView = findViewById(R.id.result_text)
        //val button = findViewById<Button>(R.id.button)

        //Usando dataBinding
        val ageEdit: EditText = binding.ageEdit
        val resultText: TextView = binding.resultText
        val button = binding.button

        Log.d("MainActivity","Se inicia la aplicacion")

        button.setOnClickListener {

            val ageString = ageEdit.text.toString()

            if(ageString.isNotEmpty()){
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = getString(R.string.result_text,result)
            } else {
                Log.d("MainActivity","Age string is empty")
                Toast.makeText(this,"Debes insertar una Edad",Toast.LENGTH_SHORT).show()
            }

        }

    }
}