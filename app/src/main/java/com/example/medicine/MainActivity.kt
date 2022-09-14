package com.example.medicine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            Intent(this, Home::class.java).also {
                startActivity(it)
            }
            btnSrp.setOnClickListener {
                Intent(this, Home_sec::class.java).also {
                    startActivity(it)
                }
            }

        }
    }
}

