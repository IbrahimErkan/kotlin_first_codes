package com.erkan.ilkuygulamam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.TextView
import android.widget.Toast

class baslangic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)

        var sayac = findViewById<TextView>(R.id.sayac)

        object : CountDownTimer(5000, 1000){
            override fun onTick(p0 : Long) {
                sayac.text = (p0 / 1000).toString()
                if (p0 < 2000){
                    Toast.makeText(applicationContext, "Ana Sayfaya Yönlendiriliyorsunuz..", Toast.LENGTH_SHORT).show()
                }

            }

            override fun onFinish() {
                var gecis = Intent(applicationContext, MainActivity::class.java)
                startActivity(gecis)
                finish()
            }
        }.start()

        /*Handler().postDelayed({
            var gecis = Intent(this, MainActivity::class.java)
            startActivity(gecis)
            finish()
        }, 5000)*/
    }
}