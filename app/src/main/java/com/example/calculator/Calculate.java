package com.example.calculator;

import java.util.concurrent.CopyOnWriteArrayList;

public class Calculate {

    public long Calculating(long number1, long number2, String operation){

        switch (operation) {
            case "+":
                return (long)number1 + number2;
            case "-":
                return (long)number1 - number2;
            case "/":
                return number1 / number2;
            case "*":
                return (long)number1 * number2;
            case "^":
                return (long)Math.pow(number1, number2);
            default:
                return 0;
        }

    }

}
