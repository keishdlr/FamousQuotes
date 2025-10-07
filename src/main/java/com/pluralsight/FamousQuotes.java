package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            String[] quotes = {
                    "The only way to do great work is to love what you do.",
                    "Success is not final, failure is not fatal: It is the courage to continue that counts.",
                    "Believe you can and you're halfway there.",
                    "Do not wait for leaders; do it alone, person to person.",
                    "What you get by achieving your goals is not as important as what you become by achieving your goals.",
                    "In the middle of every difficulty lies opportunity.",
                    "The future belongs to those who prepare for it today.",
                    "Happiness is not something ready made. It comes from your own actions.",
                    "You miss 100% of the shots you don’t take.",
                    "Start where you are. Use what you have. Do what you can."
            };
            //Add a loop to the program asks the user if they want to see another
            //saying.  If they say yes, repeat the process.  DO NOT shut the application down
            //when if an exception occurs.  Just pick up with the next iteration.

            boolean keepGoing = true;
            while (keepGoing = true){
                try {
                    System.out.print("Pick a quote (select #1 - #10): ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume leftover newline
                    if (index >= 1 && index <= 10) {
                        index--;
                        System.out.println(quotes[index]);
                    } else {
                        System.out.println("Your number was out of range!");
                   // change number from range 1-10 to range 0-9 because index starts with 0
                // As long as the user entered a number in the range
                // this will work.  Otherwise, the index
                // will be out of range.
        }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number between 1 and 10");
            scanner.nextLine(); // clear the bad input
        }

        System.out.print("Do you want to see another quote? Y / N: ");
        String response = scanner.nextLine().trim().toLowerCase();
        keepGoing = response.equals("y");
    }

        scanner.close();
        System.out.println("Thanks for browsing quotes!");
}}
