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
     TextView bmi, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Height = findViewById(R.id.height);
        Weight = findViewById(R.id.weight);
        bmi = findViewById(R.id.bmi);
        res = findViewById(R.id.output);
        calc = findViewById(R.id.calc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float H = Float.parseFloat((Height.getText().toString()));
                float W = Float.parseFloat((Weight.getText().toString()));
                float result = (W/(H*H))*10000;
                String BMI = String.valueOf(result);
                if (BMI == ""){
                    Toast.makeText(MainActivity.this, "Please Enter Height and Weight", Toast.LENGTH_SHORT).show();
                }else {
                    bmi.setText(BMI);
                    if(result<16){
                        res.setText("Severe Thinness");
                    }
                    else if(result >=16 && result <=17){
                        res.setText("Moderate Thickness");
                    }else if(result>17 && result <19){
                        res.setText("Mild Thickness");
                    }else if(result>18 && result<=25){
                        res.setText("Normal Thickness");
                    }else if (result>25 && result<=30){
                        res.setText("Over Weight");
                    }else if (result>30 && result<=35){
                        res.setText("Obese Class 1");
                    }else if (result>35 && result<=40){
                        res.setText("Obese Class 2");
                    }else if (result > 40){
                        res.setText("Obese Class 3");
                    }
                }

            }
        });


    }
}