package com.iuglab.tohfa.ui_elements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.iuglab.tohfa.R
import kotlinx.android.synthetic.main.activity_forget_password.*

class ForgetPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        tvSignup.setOnClickListener {
            startActivity(Intent(this,SignUp::class.java))
        }

    }
}
