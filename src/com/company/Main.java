package com.company;

import java.util.Scanner;

public class Main {
    private static final String name = "William";
    private static final int year = 2020;
    public static void main(String[] args) {
        System.out.printf("Hello! My name is %s.\n",name);
        System.out.printf("I was created in %d. \n",year);
        System.out.println("Please, remind me your name");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.printf("What a great name you have, %s! \n", username );
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int userAge = (num1 * 70 + num2 * 21 + num3 * 15) % 105;
        System.out.printf("Your age is %d; that`s a good time to start programming!"
                ,userAge);
    }
}
