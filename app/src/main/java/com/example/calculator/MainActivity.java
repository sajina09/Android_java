package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1 , num2 ;
    Button add , sub, mul ;
    TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        result = findViewById(R.id.textView);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = convertString(num1.getText().toString());
                int secondNum =  convertString(num2.getText().toString());
                int c = addNumber(firstNum,secondNum);
                result.setText(Integer.toString(c));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = convertString(num1.getText().toString());
                int secondNum =  convertString(num2.getText().toString());
                int c = subNumber(firstNum,secondNum);
                result.setText(Integer.toString(c));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = convertString(num1.getText().toString());
                int secondNum =  convertString(num2.getText().toString());
                int c = mulNumber(firstNum,secondNum);
                result.setText(Integer.toString(c));
            }
        });
    }


    int addNumber(int a ,int b) {

        return a+b ;
    }

    int subNumber (int a , int b){
        return a-b;
    }

    int mulNumber (int a , int b){
        return a*b;
    }

    int convertString (String value){
        return Integer.parseInt(value);
    }

}