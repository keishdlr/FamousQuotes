package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
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
            System.out.print("Pick a quote (select #1 - #6): ");
            int index = scanner.nextInt();
            index--;   // change number from range 1-6 to range 0-5
            // as long as the user entered a number in the range
            // of 1 to 6, this will work.  Otherwise the index
            // will be out of range.
            System.out.println(names[index]);
        }
        catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
        scanner.close();
    }

}
