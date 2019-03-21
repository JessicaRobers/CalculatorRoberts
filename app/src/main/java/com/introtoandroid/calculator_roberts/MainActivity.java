package com.introtoandroid.calculator_roberts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button add;
    Button subtract;
    Button divide;
    Button multiply;
    Button clear;
    Button clearev;
    Button equals;
    Boolean isClicked = false;
    TextView results;
    int checkNum;
    int checkNumTotal;
    int checkNum1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        clearev = findViewById(R.id.cleareverything);
        equals = findViewById(R.id.equals);
        results = findViewById(R.id.results);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched zero", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(zero.getText().toString());
                isClicked = true;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched one", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(one.getText().toString());
                isClicked = true;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched two", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(two.getText().toString());
                isClicked = true;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched three", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(three.getText().toString());
                isClicked = true;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched four", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(four.getText().toString());
                isClicked = true;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched five", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(five.getText().toString());
                isClicked = true;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched six", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(six.getText().toString());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched seven", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(seven.getText().toString());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched eight", Toast.LENGTH_SHORT).show();
                checkNum = Integer.parseInt(eight.getText().toString());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNum = Integer.parseInt(eight.getText().toString());
                Toast.makeText(getApplicationContext(), "Touched nine", Toast.LENGTH_SHORT).show();
                isClicked = true;
            }

        });

        //Calculation Methods


        add.setOnClickListener(new View.OnClickListener() {
          //  int numPeople = Integer.parseInt(number.getText().toString());
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched add", Toast.LENGTH_SHORT).show();
                System.out.println("checkNum is: " + checkNum);
                checkNumTotal = checkNumTotal + checkNum;
                System.out.println("checkNumTotal is: " + checkNumTotal);

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String number = String.valueOf(checkNumTotal);
                results.setText(number);
                System.out.println(checkNumTotal);
                Toast.makeText(getApplicationContext(), "Touched equals", Toast.LENGTH_SHORT).show();
            }
        });

        subtract.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Touched subtract", Toast.LENGTH_SHORT).show();
                System.out.println("checkNum is: " + checkNum);
                System.out.println("checkNumTotal is: " + checkNumTotal);
                checkNumTotal = checkNum - checkNumTotal;
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int val= 1;
                Toast.makeText(getApplicationContext(), "Touched subtract", Toast.LENGTH_SHORT).show();
                System.out.println("checkNum is: " + checkNum);
                System.out.println("checkNumTotal is: " + checkNumTotal);
                val = checkNum / val;
                checkNumTotal = val;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int val = 1;
                Toast.makeText(getApplicationContext(), "Touched subtract", Toast.LENGTH_SHORT).show();
                System.out.println("checkNum is: " + checkNum);
                System.out.println("val is: " + val);
                val = checkNum * val;
                checkNumTotal = val;
            }
        });

        clearev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkNumTotal = 0;
                checkNum = 0;
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                checkNum = 0;
            }
        });
    }


}
