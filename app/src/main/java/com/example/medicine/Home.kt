package com.example.medicine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.fexo
import kotlinx.android.synthetic.main.activity_home_sec.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        finix.setOnClickListener {
            var n = Intent(this, finix20::class.java)

            startActivity(n)
        }



        desl.setOnClickListener {
            var n = Intent(this, deslona::class.java)
            startActivity(n)

        }
        fexo.setOnClickListener {
            var n = Intent(this, com.example.medicine.fexo::class.java)
            startActivity(n)
        }
        napax.setOnClickListener {
            var n = Intent(this, com.example.medicine.napa::class.java)
            startActivity(n)
        }
        cefn.setOnClickListener {
            var n = Intent(this, com.example.medicine.cef::class.java)
            startActivity(n)
        }
        lcal.setOnClickListener {
            var n = Intent(this, com.example.medicine.labcalD::class.java)
            startActivity(n)
        }
        disop.setOnClickListener {
            var n = Intent(this, com.example.medicine.disopan::class.java)
            startActivity(n)
        }
        etox.setOnClickListener {
            var n = Intent(this, com.example.medicine.eto::class.java)
            startActivity(n)
        }
        entcd.setOnClickListener {
            var n = Intent(this, com.example.medicine.entac::class.java)
            startActivity(n)
        }
        amox.setOnClickListener {
            var n = Intent(this, com.example.medicine.amodis::class.java)
            startActivity(n)
        }
        tufn.setOnClickListener {
            var n = Intent(this, com.example.medicine.tufnil::class.java)
            startActivity(n)
        }
        sec20.setOnClickListener {
            var n = Intent(this, com.example.medicine.seclo::class.java)
            startActivity(n)
        }
        bac_bar.setOnClickListener {
            var n = Intent(this, MainActivity::class.java)
            startActivity(n)
        }

    }


    }







