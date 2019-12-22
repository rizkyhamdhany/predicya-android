package com.predicya.presentation.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.predicya.android.R
import com.predicya.presentation.main.HomeActivity
import kotlinx.android.synthetic.main.activity_login.login_btn

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login_btn.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}