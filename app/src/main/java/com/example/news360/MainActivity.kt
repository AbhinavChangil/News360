package com.example.news360

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

//    override fun onBackPressed() {
//        val exitIntent = Intent(Intent.ACTION_MAIN)
//        exitIntent.addCategory(Intent.CATEGORY_HOME)
//        exitIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
//        startActivity(exitIntent)
//        finishAffinity()
//        finish()
//    }


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.title2)
        textView.visibility = View.VISIBLE
        val animation1 = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        textView.startAnimation(animation1)




        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            // do something after 2100ms


            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }, 2000)




    }





}


