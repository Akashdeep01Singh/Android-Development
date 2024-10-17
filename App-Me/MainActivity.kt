package com.example.appme



import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android .content.Intent
import android.net.Uri
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val implicitbutton = findViewById<Button>(R.id.btn1)
//        val explicitbutton =  findViewById<Button>(R.id.btn2)
        val impcallbutton = findViewById<Button>(R.id.btndail)
        val impmsgbutton = findViewById<Button>(R.id.btnmsg)

        implicitbutton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

//        val intent = Intent(Intent.ACTION_VIEW)
//        val url= "https://www.google.co.in/"
//        intent.data= Uri.parse(url)
//        startActivity(intent)


        impcallbutton.setOnClickListener {
            val number = "8529634765"
            val intent1 = Intent(Intent.ACTION_DIAL)
            intent1.data = Uri.parse(number)
            startActivity(intent1)
        }




        impmsgbutton.setOnClickListener {
            val smsnumber = "8529634765"
            val smsText = "Hello, this is me"
            val intent2 = Intent(Intent.ACTION_SENDTO)
            intent2.data = Uri.parse("smsto:$smsnumber")
            intent2.putExtra("sms_body", smsText)
            startActivity(intent2)
        }

        val ToastT = findViewById<Button>(R.id.toastt)
        ToastT.setOnClickListener {

            val Toast_time = Toast.makeText(this, "This is Toast", Toast.LENGTH_LONG).show()

        }
    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu,menu)
            return true
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId)
        {
            R.id.Search->{
                Toast.makeText(this, "This is search-bar Toast", Toast.LENGTH_LONG).show()
                true
            }

            R.id.Dashboard->{
                Toast.makeText(this, "This is Dashboard Toast", Toast.LENGTH_LONG).show()
                true
            }

            R.id.About_us->{
                Toast.makeText(this, "This is About-Us Toast", Toast.LENGTH_LONG).show()
                true
            }

            R.id.Contact->{
                Toast.makeText(this, "This is Contact Us Toast", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}

