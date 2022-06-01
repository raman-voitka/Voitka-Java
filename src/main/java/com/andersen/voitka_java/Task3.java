package com.andersen.voitka_java;

import java.util.Scanner;

public class Task3 implements TaskRealization {
    @Override
    public void getRealization() {
        System.out.println("Please, Enter The Numbers In Next Format:   N1,N2,...,Nn");
        while (true) {
            Scanner enteredArray = new Scanner(System.in);
            String[] array = enteredArray.nextLine().split(",");
            int[] arrayInt = new int[array.length];
            try {
                for (int i = 0; i < array.length; i++) {
                    arrayInt[i] = Integer.parseInt(array[i]);
                    if (arrayInt[i] % 3 == 0) {
                        System.out.print(arrayInt[i] + " ");
                    }
                }
                System.out.println('\n');
                break;
            } catch (NumberFormatException e) {
                System.out.println("So Sorry. An Error Occurred While Executing The Program Because Of " +
                        "Incorrect Input Format, Try Again Enter The Numbers In Next Format:   N1,N2,...,Nn");
            }
        }
    }
}