package com.example.lab1;

public class MinMax {

    public int max(int num1, int num2) {
        if(num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public int min(int num1, int num2) {
        if(num1 <= num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
