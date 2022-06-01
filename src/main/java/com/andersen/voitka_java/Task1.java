package com.andersen.voitka_java;

import java.util.Scanner;

public class Task1 implements TaskRealization {
    @Override
    public void getRealization() {
        System.out.println("Please, Enter A Number Greater Than 7");
        while (true) {
            Scanner enteredNumber = new Scanner(System.in);
            if (enteredNumber.hasNextInt()) {
                int number = enteredNumber.nextInt();
                if (number > 7) {
                    System.out.println("Привет" + '\n');
                    break;
                } else {
                    System.out.println("YOU ENTERED A NUMBER LESS THAN OR EQUAL TO 7. PLEASE, TRY AGAIN");
                }
            } else {
                System.out.println("YOU ENTERED NOT A NUMBER. PLEASE, ENTER A NUMBER");
            }
        }
    }
}