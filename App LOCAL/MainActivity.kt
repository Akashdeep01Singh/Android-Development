package com.example.applocalize

import android.annotation.SuppressLint
import android.util.Log
import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.RadioGroup
import java.util.Locale
import com.google.android.material.snackbar.Snackbar

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textviewMsg = findViewById<TextView>(R.id.textview_msg)
        textviewMsg.text = "welcome_to_my_language_app"


        val radioGroup: RadioGroup = findViewById(R.id.radio_grp)
        val changeLanguageButton: Button = findViewById(R.id.btnchangelang)

        changeLanguageButton.setOnClickListener {
            val selectedRadioButtonId: Int = radioGroup.checkedRadioButtonId

            when (selectedRadioButtonId) {
                R.id.radiohindi -> {
                    setLocale("hi")
                    Log.e("MainActivity_btnclick_hindi", "This is the hindi button selection")
                }

                R.id.radiogujrati -> {
                    setLocale("gu")
                    Log.e("MainActivity_btnclick_gujrat", "This is the gujrati button selection")

                }
                R.id.radiopunjabi -> {

                    setLocale("pb")
                    Log.e("MainActivity_btnclick_punjabi", "This is the punjabi button selection")

                }
                else -> setLocale("en")

            }
        }
    }


    fun Snackbar11(view: View)
    {
        val snackbar_layout:View=findViewById(R.id.main)
        val Snakebar = Snackbar.make(snackbar_layout,"this is my new Snackbar",Snackbar.LENGTH_INDEFINITE)
        Snakebar.setAction("close") {
            Log.e("MainActivity_Snackbar", "YOu have successfully closed the app")
        }
        Snakebar.setBackgroundTint(Color.GRAY)
        Snakebar.setActionTextColor(Color.MAGENTA)
        Snakebar.setTextColor(Color.CYAN)
        Snakebar.show()
    }

    fun Snackbar22(view: View)
    {
        val snackbar_layout:View=findViewById(R.id.main)
        val snakebar2 = Snackbar.make(snackbar_layout,"Do you Sure to Exit app",Snackbar.LENGTH_INDEFINITE)
        snakebar2.setAction("close"){
            Log.e("MainActivity_Snakebar2","App Exited Successfully")
        }
        snakebar2.show()
    }
    fun setLocale(languageCode: String){
        val locale= Locale(languageCode)
        Locale.setDefault(locale)

        val config = Configuration()
        config.setLocale(locale)


        resources.updateConfiguration(config, resources.displayMetrics)

        recreate()
    }
    fun resetlanguage(view: View)
    {
        val radioGroup: RadioGroup = findViewById(R.id.radio_grp)
        setLocale("en")
        radioGroup.clearCheck()
    }
}