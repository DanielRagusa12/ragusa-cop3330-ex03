package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print("What is the quote? ");
        String Quote;
        Scanner input=new Scanner(System.in).useDelimiter("\n");
        Quote=input.next();

        System.out.print("Who said it? ");
        String Author;
        Scanner input2=new Scanner(System.in).useDelimiter("\n");
        Author=input2.next();

        String Final=(Author) + " says," + " \"" + (Quote) + "\"";
        System.out.println(Final);
    }
}
