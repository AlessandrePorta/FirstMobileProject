package com.example.extensivaoDoPookis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class LoggedActivity : AppCompatActivity(), LoggedContract.View {

    private val presenter = LoggedPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)

        val btn = findViewById<Button>(R.id.button5)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextTextPassword)


    }

    override fun showFeedback(text: String) {
        Snackbar.make(findViewById(R.id.main_root), text, Snackbar.LENGTH_SHORT).show()
    }

    override fun navigateLoggedActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }

}