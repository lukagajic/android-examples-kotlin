package com.lgajic.primerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {
    private lateinit var inputLoginParameters: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        initComponents()
    }

    private fun initComponents() {
        inputLoginParameters = findViewById(R.id.input_login_parameters)

        val i: Intent = intent

        val username: String? = intent.getStringExtra("username")
        val password: String? = intent.getStringExtra("password")

        inputLoginParameters.text = "Username: $username, Password: $password"
    }
}