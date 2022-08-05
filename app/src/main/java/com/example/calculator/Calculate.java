package com.example.calculator;

import java.util.concurrent.CopyOnWriteArrayList;

public class Calculate {

    public long Calculating(int number1, int number2, String operation){

        switch (operation) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "/":
                return number1 / number2;
            case "*":
                return (long)number1 * number2;
            case "^":
                return (long)Math.pow(number1, number2);
            default:
                return 981;
        }

    }

}
