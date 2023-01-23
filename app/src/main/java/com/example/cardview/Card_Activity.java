
package com.example.cardview;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Card_Activity extends AppCompatActivity {

    TextView receptor, emisor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_card);


        Bundle resultIntent = getIntent().getExtras();

        receptor = findViewById(R.id.Receptor);
        emisor = findViewById(R.id.Emisor);

        receptor.setTextColor(Color.parseColor("#FF0000"));
        emisor.setTextColor(Color.parseColor("#FF0000"));


        emisor.setText(resultIntent.getString("Emisor"));
        receptor.setText(resultIntent.getString("Receptor"));


    }
}
