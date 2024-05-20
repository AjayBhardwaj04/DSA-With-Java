package com.ajay.loop;

public class Main {
    public static void main(String[] args) {


        // This for loop will print the numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

// This while loop will print the numbers from 1 to 10, but it will stop if the user enters a negative number
        int i = 1;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

// This do-while loop will print the numbers from 1 to 10, but it will always print the number 1, even if the user enters a negative number
        int j = 1;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
