package Assignment01;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Adrian Chew
 */

import java.util.Scanner;

public class Solution02 {
    /*
    print "What is the input string?"
    'string' = get input from user
    'strlen' = 'string'.length()
    print 'string'+"has %d characters."
     */
    public static void main(String[] args) {
        System.out.println("What is the input string? ");

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        int strlen = string.length();

        System.out.println(string+" has "+strlen+" characters.");
    }
}
