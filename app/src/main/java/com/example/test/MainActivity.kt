package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //val buttonLogin = findViewById<Button>(R.id.button)
        //buttonLogin.setOnClickListener{
        //    val toast = Toast.makeText(applicationContext, "Hello world", Toast.LENGTH_LONG)
        //    toast.show() }
    }


    fun ClickListener(view: View){

//        var build = AlertDialog.Builder(this)
//        build.setTitle("Вход")
//            .setMessage("Верный логин и пароль?")
//            .setCancelable(true)
//            .setPositiveButton("Да"){
//                _,_ -> Toast.makeText(this,"Успешно",Toast.LENGTH_LONG).show()
//            }
//            .setNegativeButton("Нет"){
//                _,_ -> Toast.makeText(this,"Неверный логин или пароль",Toast.LENGTH_LONG).show()
//            }
//        val dialog = build.create()
//        dialog.show()

        val layout = LayoutInflater.from(this).inflate(R.layout.login_and_password,null)
        val builder = AlertDialog.Builder(this).setView(layout)
        val show = builder.show()
        val login = layout.findViewById<EditText>(R.id.editLogin)
        val password = layout.findViewById<EditText>(R.id.editPassword)
        val enter = layout.findViewById<Button>(R.id.Entry)
        val exit = layout.findViewById<Button>(R.id.exit)
        enter.setOnClickListener{
            if(login.text.toString()=="1"&&password.text.toString()=="1")
            {

                show.dismiss()
                startActivity(Intent(this,Menu::class.java))
            }
            else
            {
                Toast.makeText(this,"Неверный логин или пароль",Toast.LENGTH_LONG).show()
            }
        }
        exit.setOnClickListener{
            show.dismiss()
        }


    }
    fun ClickRegistrate(view: View)
    {
        startActivity(Intent(this, Registration::class.java))
    }

}




class Testing {
    companion object {
        fun Trust(isTrue:Boolean):Boolean
        {
            return isTrue
        }
    }
}

@VisibleForTesting
internal fun sum(a:Int,b:Int):Int{
    return a+b
}