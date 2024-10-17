package com.example.myappz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import android.widget.TextView
import android.widget.Spinner
import android.widget.ListView
import android.widget.Toast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val spinner_city = findViewById<Spinner>(R.id.spinner)

        val cities = arrayOf("ahmedabad", "pune", "delhi", "punjab")
        val items = arrayOf("Main office", "Sub-office", "Study-Center")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cities)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner_city.setAdapter(adapter)

        spinner_city.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {

            override fun  onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position:Int,
                id: Long
            ){
                val selectedCity=parent.getItemAtPosition(position).toString()
                val textView:TextView=findViewById(R.id.textView)
                textView.text=selectedCity

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        })







val list_city=findViewById<ListView>(R.id.listView)
val adapter1=ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
list_city.adapter=adapter1
list_city.setOnItemClickListener{
    parent,view,position,id ->

    val selectedItem=items[position]

    val text1:TextView.text=selectedItem



//    class MainActivity : AppCompatActivity(){
//        override fun onCreate(savedInstanceState: Bundle?) {
//            val listView: ListView= findViewById(R.id.listView)
//
//            val adapter1 = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
//
//            listView.adapter= adapter1
//
//            adapter1.
//
//        }
//
//
//
//    }    }