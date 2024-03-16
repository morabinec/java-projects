package com.example;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte months_in_year = 12;
        final byte percent = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numOfPayments = 0;


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal (1k - 100M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 100_000_000) {
                break;
            }
            System.out.println("You can only input a number between 1000 and 100M");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            monthlyInterest = annualInterest / percent / months_in_year;
            if (annualInterest >= 1 && annualInterest <= 30) {
                break;
            }
            System.out.println("You can only enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numOfPayments = years * months_in_year;
                break;
            }
            System.out.println("You can only enter a value between 1 and 30");
        }


        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numOfPayments))
                / (Math.pow(1 + monthlyInterest, numOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Your monthly mortgage will be: " + mortgageFormatted + ".");

    }
}