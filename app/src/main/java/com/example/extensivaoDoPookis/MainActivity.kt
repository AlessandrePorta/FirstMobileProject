package com.example.extensivaoDoPookis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextTextPassword)

        btn.setOnClickListener { presenter.validateEmail(email.text.toString(), password.text.toString()) }

    }

    override fun showFeedback(text: String) {
        Snackbar.make(findViewById(R.id.main_root), text, Snackbar.LENGTH_SHORT).show()
    }

    override fun navigateLoggedActivity() {
        startActivity(Intent(this, LoggedActivity::class.java))
    }

}