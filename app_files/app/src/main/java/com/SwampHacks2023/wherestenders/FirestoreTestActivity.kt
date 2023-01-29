package com.SwampHacks2023.wherestenders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.SwampHacks2023.wherestenders.databinding.ActivityFirestoreTestBinding
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirestoreTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirestoreTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirestoreTestBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_firestore_test)

        val actionBtn: Button = binding.button
        actionBtn.setOnClickListener{
            Firebase.firestore.collection("users").add("johndoe123")
        }
    }
}