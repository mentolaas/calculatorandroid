package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnPlus;
    Button btnMin;
    Button btnDivide;
    Button btnMulti;
    Button btnEnter;
    Button btnClear;
    Button btnSt;

    public TextView Calc;

    String number1 = "";
    String number2 = "";
    String operation = "";
    public String calc = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.buttonone);
        btn2 = (Button) findViewById(R.id.buttontwo);
        btn3 = (Button) findViewById(R.id.buttonthird);
        btn4 = (Button) findViewById(R.id.buttonfor);
        btn5 = (Button) findViewById(R.id.buttonfive);
        btn6 = (Button) findViewById(R.id.buttonsix);
        btn7 = (Button) findViewById(R.id.buttonseven);
        btn8 = (Button) findViewById(R.id.buttoneight);
        btn9 = (Button) findViewById(R.id.buttonnine);
        btn0 = (Button) findViewById(R.id.buttonzero);
        btnPlus = (Button) findViewById(R.id.buttonplus);
        btnMin = (Button) findViewById(R.id.buttonminus);
        btnDivide = (Button) findViewById(R.id.buttondivide);
        btnMulti = (Button) findViewById(R.id.buttonmulti);
        btnEnter = (Button) findViewById(R.id.buttonenter);
        btnClear = (Button) findViewById(R.id.buttonclear);
        btnSt = (Button) findViewById(R.id.buttonstepenb);

        Calc = (TextView)  findViewById(R.id.Calculating);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.length() == 0) {
                    number1 = "";
                } else if (number2.length() == 0) {
                    number2 = "";
                } else {
                    Calculate calculate = new Calculate();
                    Calc.setText(String.valueOf(calculate.Calculating(Integer.valueOf(number1), Integer.valueOf(number2), operation)));
                    calc = String.valueOf(calculate.Calculating(Integer.valueOf(number1), Integer.valueOf(number2), operation));
                    number1 = String.valueOf(calculate.Calculating(Integer.valueOf(number1), Integer.valueOf(number2), operation));
                    number2 = "";
                    operation = "";
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "1";
                }else {
                    number2 = number2 + "1";
                }

                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "¹";
                    Calc.setText(calc);
                } else {
                    calc = calc + "1";
                    Calc.setText(calc);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "2";
                }else {
                    number2 = number2 + "2";
                }

                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "²";
                    Calc.setText(calc);
                } else {
                    calc = calc + "2";
                    Calc.setText(calc);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "3";
                }else {
                    number2 = number2 + "3";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "³";
                    Calc.setText(calc);
                } else {
                    calc = calc + "3";
                    Calc.setText(calc);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "4";
                }else {
                    number2 = number2 + "4";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "⁴";
                    Calc.setText(calc);
                } else {
                    calc = calc + "4";
                    Calc.setText(calc);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "5";
                }else {
                    number2 = number2 + "5";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "⁵";
                    Calc.setText(calc);
                } else {
                    calc = calc + "5";
                    Calc.setText(calc);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "6";
                }else  {
                    number2 = number2 + "6";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "⁶";
                    Calc.setText(calc);
                } else {
                    calc = calc + "6";
                    Calc.setText(calc);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "7";
                }else {
                    number2 = number2 + "7";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "⁷";
                    Calc.setText(calc);
                } else {
                    calc = calc + "7";
                    Calc.setText(calc);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "8";
                }else {
                    number2 = number2 + "8";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "⁸";
                    Calc.setText(calc);
                } else {
                    calc = calc + "8";
                    Calc.setText(calc);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "9";
                } else {
                    number2 = number2 + "9";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "⁹";
                    Calc.setText(calc);
                } else {
                    calc = calc + "9";
                    Calc.setText(calc);
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.length() == 0)
                {
                    number1 = number1 + "0";
                }else {
                    number2 = number2 + "0";
                }
                if (number1.length() != 0 && operation.equals("^")) {
                    calc = calc + "⁰";
                    Calc.setText(calc);
                } else {
                    calc = calc + "0";
                    Calc.setText(calc);
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.length() == 0) {
                    operation = "";
                } else {
                    operation = "+";
                    calc = calc + " + ";
                    Calc.setText(calc);
                }
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.length() == 0) {
                    operation = "";
                } else {
                    operation = "-";
                    calc = calc + " - ";
                    Calc.setText(calc);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.length() == 0) {
                    operation = "";
                } else {
                    operation = "/";
                    calc = calc + " / ";
                    Calc.setText(calc);
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.length() == 0) {
                    operation = "";
                } else {
                    operation = "*";
                    calc = calc + " * ";
                    Calc.setText(calc);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = "";
                number1 = "";
                number2 = "";
                operation = "";
                Calc.setText(calc);
            }
        });

        btnSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (number1.length() == 0) {
                    operation = "";
                } else {
                    number2 = "";
                    operation = "^";
                    calc = calc + "^";
                    Calc.setText(calc);
                }

            }
        });

    }
}