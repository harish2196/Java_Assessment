package com.chainsys.skillmatrix;

import java.util.Scanner;

public class DigitExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.println("Enter the digit to search for: ");
        int searchDigit = scanner.nextInt();
        
        String mainNumberString = String.valueOf(number);
        String searchDigitString = String.valueOf(searchDigit);
        
        String[] splitValues = mainNumberString.split(searchDigitString);
        
        if (splitValues.length > 0 && !splitValues[0].isEmpty()) {
            String firstPart = splitValues[0];
            System.out.println("Result: " + firstPart.charAt(firstPart.length() - 1));
        } else {
            System.out.println("The search digit is not found in the main number or is at the start.");
        }
        
        scanner.close();
    }
}
