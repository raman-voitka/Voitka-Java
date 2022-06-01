package com.andersen.voitka_java;

import java.util.Scanner;

public class Task2 implements TaskRealization {
    @Override
    public void getRealization() {
        System.out.println("Please, Enter A Male Name");
        Scanner enteredName = new Scanner(System.in);
        if (enteredName.nextLine().equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав" + '\n');
        } else {
            System.out.println("Нет такого имени" + '\n');
        }
    }
}