/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week13_14;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author domin
 */
public class ParenMatch {
     public static void main(String[] args) {
        Stack s = new Stack();
        String line; // the string of characters to be checked
        Scanner scan = new Scanner(System.in);
        System.out.println("\nParenthesis Matching");
        System.out.println("Enter a parenthesized expression: ");
        line = scan.nextLine();
//      loop to process the line one character at a time
//      print the results
        boolean extraRight = false;
        int i;
        for (i = 0; i < line.length(); i++) {

            char ch = line.charAt(i);

            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {

                if (s.isEmpty()) {
                    extraRight = true;
                    break;
                } else {
                    s.pop();
                }
            }
        }
        if (extraRight) {
            System.out.println("Too many right parenthesis " + line.substring(0, i + 1));
        } else if (!s.isEmpty()) {
            System.out.println("Too many left parenthesis: " + line);
        } else {
            System.out.println("Parenthesis match");
        }
    }
}   

