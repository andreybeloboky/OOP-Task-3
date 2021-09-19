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
    }
}
