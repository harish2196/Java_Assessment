package com.chainsys.skillmatrix;

import java.util.Scanner;

public class GcdOfNumbers {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
  
    public static int arrayGCD(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = gcd(result, array[i]);
            if (result == 1) {
                return 1; 
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int arrayGCD = arrayGCD(array);
        System.out.print("Resulting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] / arrayGCD + " ");
        }
        
        scanner.close();
    }
}
