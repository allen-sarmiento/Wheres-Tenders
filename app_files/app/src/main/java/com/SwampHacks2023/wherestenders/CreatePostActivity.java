package com.SwampHacks2023.wherestenders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CreatePostActivity extends AppCompatActivity {

    private ImageButton exit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);


        exit_btn = findViewById(R.id.exitButton);
        exit_btn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(CreatePostActivity.this, PostActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_out_top, R.anim.nothing);
        }
        });
    }

}