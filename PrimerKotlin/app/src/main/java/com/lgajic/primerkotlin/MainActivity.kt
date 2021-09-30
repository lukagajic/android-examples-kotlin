package com.lgajic.primerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var inputUsername: EditText
    private lateinit var inputPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
    }

    private fun initComponents() {
        inputUsername = findViewById(R.id.input_username)
        inputPassword = findViewById(R.id.input_password)
        buttonLogin = findViewById(R.id.button_login)

        buttonLogin.setOnClickListener {

            println(inputUsername.text)
            println(inputPassword.text)

            val intent: Intent = Intent(this,  SuccessActivity::class.java).apply {
                putExtra("username", inputUsername.text.toString())
                putExtra("password", inputPassword.text.toString())
            }

            startActivity(intent)
        }
    }
}