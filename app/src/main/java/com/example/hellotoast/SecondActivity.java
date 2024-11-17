package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView messageTextView = findViewById(R.id.toast_message);
        TextView countTextView = findViewById(R.id.textView_count);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int count = intent.getIntExtra(MainActivity.EXTRA_COUNT, 0);

        // Mise à jour des TextViews
        if (message != null) {
            messageTextView.setText(message);
        }
        countTextView.setText(String.valueOf(count));
    }
}

