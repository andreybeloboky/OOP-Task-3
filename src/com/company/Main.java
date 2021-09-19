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
        System.out.println("Enter 1 - say or 2 - move, press any number to finish");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                Scanner string = new Scanner(System.in);
                System.out.println("Enter phrase");
                String say = string.nextLine();
                Person person = new Person(firstName, lastName, age, say);
                System.out.println(person.say());
            }
            case 2 -> {
                Person person1 = new Person(firstName, lastName);
                System.out.println(person1.move());
            }
            default -> System.out.println("The end");
        }
    }
}
