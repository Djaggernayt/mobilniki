package com.example.test

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        //Handler().postDelayed({
        //    startActivity(Intent(this,MainActivity::class.java))
        //    finish()

        //},2000)


        val screen = findViewById<ImageView>(R.id.imageView)
        screen.alpha = 0f
        screen.animate().setDuration(1000).alpha(1f).withEndAction {
            startActivity(Intent(this, MainActivity::class.java))
            //overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
        //onTick()
    }
//    fun onTick(){
//        object : CountDownTimer(2000,1000){
//            override fun onTick(millisUntilFinished: Long) {
//
//            }
//
//            override fun onFinish() {
//                startActivity(Intent(this@StartActivity,MainActivity::class.java))
//                finish()
//            }
//        }.start()
//    }
}
