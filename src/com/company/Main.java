package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Below is the board you will be using for this game of tic tac toe \n 1 | 2 | 3 \n 4 | 5 | 6 \n 7 | 8 | 9");
        System.out.println("Player one: Where would you like to place your first X?" + " Choose one of the numbers on the board to place where you want to go");
        Scanner scan = new Scanner(System.in);
        String control = scan.nextLine();
        while (control.equalsIgnoreCase("1")) {
            StringBuffer string = new StringBuffer();
            String s = "X";
            string.append("\n " + s + " | 2 | 3 \n 4 | 5 | 6 \n 7 | 8 | 9");
            String ok = string.toString();
            System.out.println("Here is your board so far" + ok);
            System.out.println("Player two: Where would you like to place your first O?" + " Choose one of the numbers on the board to place where you want to go");
            Scanner kbInput1 = new Scanner(System.in);
            String O = kbInput1.nextLine();
            if (control.equalsIgnoreCase("1")) {
                System.out.println("Sorry player one already went there.");
            }
        }
            while (control.equalsIgnoreCase("2")) {
                StringBuffer string2 = new StringBuffer();
                String s2 = "X";
                string2.append("\n 1 | " + s2 + " | 3 \n 4 | 5 | 6 \n 7 | 8 | 9");
                String ok2 = string2.toString();
                System.out.println("Here is your board so far" + ok2);
                System.out.println("Player two: Where would you like to place your first O?" + " Choose one of the numbers on the board to place where you want to go");
                Scanner kbInput2 = new Scanner(System.in);
                String O2 = kbInput2.nextLine();
                if (control.equalsIgnoreCase("2")) {
                    System.out.println("Sorry player one already went there.");
                }
            }
        while (control.equalsIgnoreCase("3")) {
            StringBuffer string3 = new StringBuffer();
            String s3 = "X";
            string3.append("\n 1 | 2 | " + s3 + "\n 4 | 5 | 6 \n 7 | 8 | 9");
            String ok3 = string3.toString();
            System.out.println("Here is your board so far" + ok3);
            System.out.println("Player two: Where would you like to place your next O?" + " Choose one of the numbers on the board to place where you want to go");
            Scanner kbInput3 = new Scanner(System.in);
            String O3 = kbInput3.nextLine();
            if (control.equalsIgnoreCase("3")) {
                System.out.println("Sorry player one already went there.");
            }
        }
        while (control.equalsIgnoreCase("4")) {
            StringBuffer string4 = new StringBuffer();
            String s4 = "X";
            string4.append("\n 1 | 2 | 3 \n "+ s4 +" | 5 | 6 \n 7 | 8 | 9");
            String ok4 = string4.toString();
            System.out.println("Here is your board so far" + ok4);
            System.out.println("Player two: Where would you like to place your next O?" + " Choose one of the numbers on the board to place where you want to go");
            Scanner kbInput4 = new Scanner(System.in);
            String O4 = kbInput4.nextLine();
            if (control.equalsIgnoreCase("4")) {
                System.out.println("Sorry player one already went there.");
            }
        }
        while (control.equalsIgnoreCase("5")) {
            StringBuffer string5 = new StringBuffer();
            String s5 = "X";
            string5.append("\n 1 | 2 | 3 \n 4 | "+ s5 +" | 6 \n 7 | 8 | 9");
            String ok5 = string5.toString();
            System.out.println("Here is your board so far" + ok5);
            System.out.println("Player two: Where would you like to place your next O?" + " Choose one of the numbers on the board to place where you want to go");
            Scanner kbInput5 = new Scanner(System.in);
            String O5 = kbInput5.nextLine();
            if (control.equalsIgnoreCase("5")) {
                System.out.println("Sorry player one already went there.");
            }
        }
        while (control.equalsIgnoreCase("6")) {
            StringBuffer string6 = new StringBuffer();
            String s6 = "X";
            string6.append("\n 1 | 2 | 3 \n 4 | 5 | "+ s6 +" \n 7 | 8 | 9");
            String ok6 = string6.toString();
            System.out.println("Here is your board so far" + ok6);
            System.out.println("Player two: Where would you like to place your next O?" + " Choose one of the numbers on the board to place where you want to go");
            Scanner kbInput6 = new Scanner(System.in);
            String O6 = kbInput6.nextLine();
            if (control.equalsIgnoreCase("6")) {
                System.out.println("Sorry player one already went there.");
            }
        }
    }
}

