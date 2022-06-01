package com.andersen.voitka_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskRealization task1 = new Task1();
        TaskRealization task2 = new Task2();
        TaskRealization task3 = new Task3();
        startProgram(task1, task2, task3);
    }

    private static void startProgram(TaskRealization task1, TaskRealization task2, TaskRealization task3) {
        System.out.println("Hello! How Are You?");
        System.out.println("Please, Choose One Of The Options:");
        while (true) {
            System.out.println("For Check Task 1 Press \"1\"");
            System.out.println("For Check Task 2 Press \"2\"");
            System.out.println("For Check Task 3 Press \"3\"");
            System.out.println("For Exit Press \"0\"");
            Scanner usersChoice = new Scanner(System.in);
            if (usersChoice.hasNextInt()) {
                int choice = usersChoice.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice == 1) {
                    task1.getRealization();
                } else if (choice == 2) {
                    task2.getRealization();
                } else if (choice == 3) {
                    task3.getRealization();
                } else {
                    System.out.println("PLEASE, ENTER CORRECT NUMBER" + '\n');
                }
            } else {
                System.out.println("YOU ENTERED NOT A NUMBER. PLEASE, ENTER A NUMBER" + '\n');
            }
        }
    }
}