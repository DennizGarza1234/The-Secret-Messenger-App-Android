package com.example.secretmessageapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MessageDisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_display)

        val textView = findViewById<TextView>(R.id.textViewMessage)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        val message = intent.getStringExtra("SECRET_MESSAGE")

        textView.text = message ?: "No message received"

        buttonBack.setOnClickListener {
            finish()
        }
    }
}