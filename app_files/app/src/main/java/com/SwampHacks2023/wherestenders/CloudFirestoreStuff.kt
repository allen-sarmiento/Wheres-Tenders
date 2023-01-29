package com.SwampHacks2023.wherestenders

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class CloudFirestoreStuff constructor() {

    val db = Firebase.firestore

    fun addUser(username: String) {
        db.collection("users")
            .add(username)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
            }
    }
}