package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.hellotoast.MESSAGE";
    public static final String EXTRA_COUNT = "com.example.hellotoast.COUNT";
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Hello!");
        intent.putExtra(EXTRA_COUNT, mCount);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        TextView countTextView = findViewById(R.id.show_count);
        countTextView.setText(String.valueOf(mCount));
    }
}
