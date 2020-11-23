package com.pns.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hi(View view) {

        Toast.makeText(this, "hiiii", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity2.class));
    }
}