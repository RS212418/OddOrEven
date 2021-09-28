package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any random number");
        int number;
        number = input.nextInt();
        if ((number % 2) == 0) {
            System.out.println("Your number is even");
        } else{
            System.out.println("Your number is odd");
        }
        System.out.println("Choose a second number");
        int number2;
        number2 = input.nextInt();
        System.out.println("Your fist number divided by your second number is " + number/number2);
        System.out.println("The remainder of your two numbers divided together is " + number % number2);
    }
}

