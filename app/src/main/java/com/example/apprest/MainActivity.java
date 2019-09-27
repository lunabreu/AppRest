package com.example.apprest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edConta= findViewById(R.id.edConta);


    }


    public void calcular (View view){

        double conta= Double.parseDouble(edConta.getText().toString());
        double gorjeta= (conta * 0.10  ) + conta ;

        Intent intent = new Intent(this, Total.class);
        intent.putExtra("gorjeta"  , "O valor total da conta é "+ gorjeta);


        startActivity(intent);

    }
}
