package com.example.apprest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Total2 extends AppCompatActivity {


    TextView edFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total2);



        edFinal= findViewById(R.id.edFinal);

        Bundle x = getIntent().getExtras();
        String xx = x.getString("gorjeta");
        edFinal.setText(xx);
    }
}
