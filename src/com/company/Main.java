package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scanner.nextLine();
        System.out.println("Enter lastName");
        String lastName = scanner.nextLine();
        System.out.println("Enter age, default age - 18");
        int age = scanner.nextInt();
        if (age > 0) {
            System.out.println("Enter 1 - say or 2 - move, press any number to finish");
            int number = scanner.nextInt();
            Person person = new Person(firstName, lastName, age);
            do {
                switch (number) {
                    case 1 -> {
                        System.out.println(person.say());
                        number = 100;
                    }
                    case 2 -> {
                        System.out.println(person.move());
                        number = 100;
                    }
                    default -> {
                        System.out.println("Enter 1 - say or 2 - move, press any number to finish");
                        number = scanner.nextInt();
                    }
                }
            } while ((number >= 1 && number <= 2) || number == 100);
            System.out.println("The end");
        } else {
            System.out.println("Incorrect enter. Example: Age should be more then 0");
        }
    }
}
