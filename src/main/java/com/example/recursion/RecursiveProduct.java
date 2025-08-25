package com.example.recursion;

import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate product
    public static int product(int[] numbers, int index) {
        // base case
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        // recursive case
        return numbers[index] * product(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int result = product(numbers, 0);

        System.out.println("\nThe product of the 5 numbers is: " + result);
        scanner.close();
    }
}
