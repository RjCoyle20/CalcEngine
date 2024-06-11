package com.pluralsight.calcengine;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {

    public static void main(String[] args) {


        double value1= 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';


        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode =='s')
            result = value1 - value2;
        else if (opCode =='m')
            result = value1 * value2;
        else if (opCode =='d') {
            if (value2 != 0)
                result = value1 / value2;
        }
        else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }
        System.out.println(result);
    }
}