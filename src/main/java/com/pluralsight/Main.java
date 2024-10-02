package com.pluralsight;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Parse the name
        String[] nameParts = fullName.split("");

        // Initialize name components
        String firstName, middleName, lastName;

        // Process based on number of parts
        if (nameParts.length == 2) {
            firstName = nameParts[0];
            middleName = "";
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("Invalid name format. Please enter either 'first last' or 'first middle last'.");
            scanner.close();
            return;
        }

        // Display the parsed name components
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}