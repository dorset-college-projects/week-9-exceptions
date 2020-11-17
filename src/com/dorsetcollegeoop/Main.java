package com.dorsetcollegeoop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer numerator\t");

        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator\t");

        int denominator = scanner.nextInt();
        int result = quotient(numerator, denominator);

        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

    }

    public static int quotient(int numerator, int denominator) {

        return numerator / denominator;
    }
}
