/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;
/*
        Exercise 1 - Saying Hello
        Create a program that prompts for your name and prints a greeting using your name.

        Example Output
        What is your name? Brian
        Hello, Brian, nice to meet you!

        Constraint
        Keep the input, string concatenation, and output separate.
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String name = myApp.readName();
        String outputString = myApp.generateOutputString(name);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readName() {
        System.out.print("What is your name? ");
        String name = in.nextLine();
        return name;
    }

    public String generateOutputString(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }
}

