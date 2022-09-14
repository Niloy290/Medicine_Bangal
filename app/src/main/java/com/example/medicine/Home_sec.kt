package com.example.medicine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_sec.*

class Home_sec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_sec)

        napSp.setOnClickListener {
            var n = Intent(this, napa_syrp::class.java)
            startActivity(n)
        }
        omiSp.setOnClickListener {
            var n = Intent(this, omidon_srp::class.java)
            startActivity(n)
        }
        adoSp.setOnClickListener {
            var n = Intent(this, adovas_srp::class.java)
            startActivity(n)
        }
        bac_barSe.setOnClickListener {
            var n = Intent(this, MainActivity::class.java)
            startActivity(n)
            }

        }
    }
