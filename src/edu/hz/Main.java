package edu.hz;

import edu.hz.io.*;
import edu.hz.statement.HZMissionStatement;

public class Main {

    public static void main(String[] args) {

        // Define IO tools
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        // Execute
        HZMissionStatement HZIP = new HZMissionStatement();

        // Ask the user for their name
        writer.write("Enter your name: ");
        String userName = reader.readLine();

        // Ask the user about their interests
        writer.write("What are your interests, " + userName + "? ");
        String userInterests = reader.readLine();

        // Display a personalized greeting with user's interests
        writer.writeLines("Hello, " + userName + "! Welcome to the HZ Mission Statement.");
        writer.writeLines("We're glad to have someone interested in " + userInterests + " with us.");

        // Display the first ambition
        writer.writeLines("Now, let's explore our first ambition:");
        writer.writeLines(HZIP.getFirstAmbition());

        // Perform a seemingly unnecessary task
        performRandomTask();

        // Call the long method
        longMethod();

        // Call another unnecessary function
        unnecessaryFunction();
    }

    // Overly simplistic and seemingly unnecessary function
    private static void performRandomTask() {
        System.out.println("Performing a seemingly unnecessary task...");
        // You can add more functionality here if needed
    }

    // A long method with no specific functionality yet
    private static void longMethod() {
        // Comment explaining the purpose of the longMethod
        System.out.println("This is a very long method that doesn't do much right now.");

        // Comment indicating where additional functionality can be added
        // You can add more functionality here if needed

        // Reminder comment about keeping methods purposeful and clear
        // Remember to keep methods purposeful and clear. If this method grows too large,
        // consider breaking it into smaller, more manageable methods.
    }

    // Another overly simplistic and seemingly unnecessary function
    private static void unnecessaryFunction() {
        System.out.println("This is an unnecessary function that currently does nothing.");
        // You can add more functionality here if needed
    }
}