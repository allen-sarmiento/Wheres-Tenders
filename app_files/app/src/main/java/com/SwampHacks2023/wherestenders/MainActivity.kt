package com.SwampHacks2023.wherestenders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goto_posts = findViewById<Button>(R.id.submit_button)
        goto_posts.setOnClickListener{
            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)
        }
    }

}