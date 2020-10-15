package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnReset.setOnClickListener {
            editEmail.text.clear()
            editPassword.text.clear()
        }

        btnLogin.setOnClickListener {
            if (editPassword.text.toString() == "pass"){
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            }
            else{
                Toast.makeText(applicationContext, "Mot de passe invalide", Toast.LENGTH_SHORT).show()
            }
        }

    }
}