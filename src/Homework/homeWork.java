package Homework;

import day16_review.SoccerGame;

import java.util.Scanner;

public class homeWork {
    /* Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi

     */

    public static void stringTimes(String str, int number) {

        if (number >= 0) {

            for (int j = 0; j < number; j++) {

                // j = 0; hi
                // j = 1; hihi
                // j = 2; hihihi

                System.out.print(str);

            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string and a number");

        stringTimes(input.nextLine(), input.nextInt());
    }
}
