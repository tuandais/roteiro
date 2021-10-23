package com.example.roteiro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OlaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola);
        TextView t = findViewById(R.id.msg);
        t.setText(getIntent().getStringExtra("message"));
    }
}