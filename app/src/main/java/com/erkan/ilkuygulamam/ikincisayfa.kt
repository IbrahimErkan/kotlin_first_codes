package com.erkan.ilkuygulamam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ikincisayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikincisayfa)

        var ikincisayfadakiyazi = findViewById<TextView>(R.id.textView2)
        var geridon = findViewById<Button>(R.id.geridon)

        var alinansey = intent.getStringExtra("aktarilacaksey")
        ikincisayfadakiyazi.text = "Hoşgeldiniz $alinansey"

        geridon.setOnLongClickListener {
            var gerigecis = Intent(applicationContext, MainActivity::class.java)
            gerigecis.putExtra("ikincidenbirinciyegecis", alinansey)
            startActivity(gerigecis)
            true
        }


    }
}