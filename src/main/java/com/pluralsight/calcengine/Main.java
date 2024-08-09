package com.pluralsight.calcengine;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++){
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }

            for (double currentResult: results)
                System.out.println(currentResult);
            } else if (args.length == 3) {
                handleComandLine(args);
            } else 
                System.out.println("Please provide an operation code and 2 numeric values");
        } 


    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts =userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    private static void handleComandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }



    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a' :
                result = leftVal + rightVal;
            break;
            case 's' :
            result = leftVal - rightVal;
                    break;
            case 'm' :
            result = leftVal * rightVal;
                break;
            case  'd' :
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
            break;
            
        }
        return result;
    }

    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord (String word) {

        String[] numberWords = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])){
                value = index;
                break;
            }
        } 
        return value;
    }

}