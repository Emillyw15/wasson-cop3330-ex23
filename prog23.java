/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("For each question, respond with y for yes or n for no");

        System.out.print("Is the car silent when you turn the key? ");
        String answer1 = in.nextLine();

        if (answer1.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String answer2 = in.nextLine();

            if (answer2.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            } else {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            String answer3 = in.nextLine();

            if (answer3.equals("y")) {
                System.out.println("Replace the battery.");
                System.exit(0);
            } else {
                System.out.print("Does the car crank up, but fail to start? ");
                String answer4 = in.nextLine();

                String answer5 = null;
                if (answer4.equals("y")) {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                } else {
                    System.out.print("Does the engine start and then die? ");
                    answer5 = in.nextLine();

                    if (answer5.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String answer6 = in.nextLine();

                        if (answer6.equals("y")) {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                }
                if (answer5.equals("n")) {
                    System.out.println("This should not be possible.");
                    System.exit(0);
                }
            }
        }
    }
}
