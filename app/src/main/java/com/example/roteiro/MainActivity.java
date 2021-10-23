
package com.example.roteiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button bt =  findViewById(R.id.bt);
       bt.setOnClickListener( (l) ->{
           Intent in  =new Intent();
           in.putExtra("message","olá bem-vindo");

       });
    }
}