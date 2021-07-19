package com.example.exp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText Height, Weight;
     Button calc;
     TextView bmi, op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Height = findViewById(R.id.height);
        Weight = findViewById(R.id.weight);
        bmi = findViewById(R.id.bmi);
        op = findViewById(R.id.output);
        calc = findViewById(R.id.calc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int H = Integer.parseInt(Height.getText().toString());
                int W = Integer.parseInt(Weight.getText().toString());
                String  res = String.valueOf(((W/H)/H)*10000);
                Toast.makeText(MainActivity.this, "res :"+res, Toast.LENGTH_SHORT).show();
            }
        });


    }
}