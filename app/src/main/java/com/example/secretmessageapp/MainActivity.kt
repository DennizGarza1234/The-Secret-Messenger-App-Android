package com.example.secretmessageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextMessage)
        val buttonSend = findViewById<Button>(R.id.buttonSend)

        buttonSend.setOnClickListener {

            val message = editText.text.toString()

            val intent = Intent(this, MessageDisplayActivity::class.java)
            intent.putExtra("SECRET_MESSAGE", message)

            startActivity(intent)
        }
    }
}