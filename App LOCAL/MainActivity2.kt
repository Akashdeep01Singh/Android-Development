package com.example.applocalize

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android .content.Intent
import android.net.Uri
import androidx.activity.enableEdgeToEdge
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val implicit_button = findViewById<Button>(R.id.btn1)
        val explicit_button =  findViewById<Button>(R.id.btn2)
        val impcall_button = findViewById<Button>(R.id.btndail)
        val impmsg_button = findViewById<Button>(R.id.btnmsg)

    implicit_button.setOnClickListener{
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

        val intent = Intent(Intent.ACTION_VIEW)
        val url= "https://www.google.co.in/"
        intent.data= Uri.parse(url)
        startActivity(intent)


        impcall_button.setOnClickListener{
            val number ="8529634765"
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse(number)
            startActivity(intent)
        }




        impmsg_button.setOnClickListener{
            val smsnumber ="8529634765"
            val smsText = "Hello, this is me"
            val intent= Intent(Intent.ACTION_SENDTO)
            intent.data=Uri.parse("smsto:$smsnumber")
            intent.putExtra("sms_body",smsText)
            startActivity(intent)
        }


    }
}

