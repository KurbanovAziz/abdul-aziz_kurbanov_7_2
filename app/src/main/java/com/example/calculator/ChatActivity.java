package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        TextView textView = findViewById(R.id.text_view);
        EditText editText = findViewById(R.id.edit_text);

        findViewById(R.id.btn_send).setOnClickListener(view -> {
            textView.setText(editText.getText().toString());
        });
    }
}