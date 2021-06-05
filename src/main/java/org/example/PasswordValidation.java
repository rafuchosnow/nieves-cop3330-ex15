/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "DrStruggle";

        System.out.print("What is the username? ");
        String usernameString = input.nextLine();

        if (usernameString.equals(correctUsername)) {

            System.out.print("What is the passcode? ");
            String guessString = input.nextLine();

            String passcode = "12345";

            if (guessString.equals(passcode)) {
                System.out.println("Welcome!");
            }
            else {
                System.out.println("I don't know you.");
            }
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
