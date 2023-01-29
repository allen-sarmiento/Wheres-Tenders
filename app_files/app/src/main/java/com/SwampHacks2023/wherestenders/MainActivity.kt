package com.SwampHacks2023.wherestenders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goto_posts = findViewById<Button>(R.id.submit_button)
        goto_posts.setOnClickListener{

            val db = Firebase.firestore
            val data = hashMapOf("username" to "johndoe123")
            db.collection("users")
                .add(data)
                .addOnSuccessListener { documentReference ->
                    Log.d("ADD", "DocumentSnapshot written with ID: ${documentReference.id}")
                }
                .addOnFailureListener { e ->
                    Log.w("ADD", "Error adding document", e)
                }

            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)
        }
    }
}