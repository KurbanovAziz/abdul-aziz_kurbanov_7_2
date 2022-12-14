package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView =findViewById(R.id.text_view);
        String textEqual = getIntent().getStringExtra("key1");
        textView.setText(textEqual);
        findViewById(R.id.btn_destroy).setOnClickListener(view -> {
            onDestroy();
            finish();
        });
    }
}