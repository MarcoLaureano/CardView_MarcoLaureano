package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button loadbtn;
    EditText nom1, nom2;
    ImageView img ;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom1 = findViewById(R.id.editTextTextPersonName);
        nom2 = findViewById(R.id.editTextTextPersonName6);


        loadbtn = findViewById(R.id.buttonLoad);
        loadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Card_Activity.class);
                intent.putExtra("Emisor", nom1.getText().toString());
                intent.putExtra("Receptor", nom2.getText().toString());
                startActivity(intent);
            }
        });
    }
}