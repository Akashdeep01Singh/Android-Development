package com.example.certificate_maker

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        lateinit var button : Button
        lateinit var user : EditText
        lateinit var pass : EditText
        lateinit var show : TextView
        pass = findViewById(R.id.password)
        user = findViewById(R.id.username)
        button = findViewById(R.id.button)
        show = findViewById(R.id.well)

        button.setOnClickListener {
            var aa = user.text.toString()
            var bb = pass.text.toString()
            if (aa == "Aakash" && bb == "password") {  // Use == for comparison
                show.text = "Welcome back"
            }
            else {
                show.text="Wrong password or username"
            }
        }

    }
}