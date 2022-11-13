package com.erkan.ilkuygulamam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var girisyap =  findViewById<Button>(R.id.girisyap)
        var username = findViewById<EditText>(R.id.username)
        var sifre = findViewById<EditText>(R.id.sifre)
        var loginyazisi = findViewById<TextView>(R.id.textView)

        var ikincidenalinan = intent.getStringExtra("ikincidenbirinciyegecis")
        username.setText(ikincidenalinan)
        girisyap.setOnLongClickListener {
            Toast.makeText(applicationContext, "Uzun Tıkladınız", Toast.LENGTH_SHORT).show()
            true
        }


        girisyap.setOnClickListener {
            var isim = username.text.toString()
            var numara = sifre.text.toString()
            if (isim == "Ibrahim ERKAN" && numara == "02195076044"){
                loginyazisi.text = "Bilgiler Doğru"
                Handler().postDelayed({
                    var anasayfayagecis = Intent(applicationContext, ikincisayfa::class.java)
                    anasayfayagecis.putExtra("aktarilacaksey", isim)
                    startActivity(anasayfayagecis)
                },2000)
            }
            else {
                loginyazisi.text = "Bilgiler Yanlış"
            }
        }



    }
}