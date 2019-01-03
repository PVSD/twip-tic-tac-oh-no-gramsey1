package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        String[] board = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};
        boolean end = false;
        boolean endB = false;
        System.out.println("Below is the board you will be using for this game of tic tac toe \n " + board[0] + " | " + board[1] + " | " + board[2] + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
        System.out.println("Player one: Where would you like to place your first X?" + " Choose one of the numbers on the board to place where you want to go");
        Scanner scan = new Scanner(System.in);
        String control = scan.nextLine();
        int result = Integer.valueOf(control);
        /*while (end == false && endB == false) {
            if (board[0].equalsIgnoreCase("X") && board[1].equalsIgnoreCase("X") && board[2].equalsIgnoreCase("X")
                    || board[3].equalsIgnoreCase("X") && board[4].equalsIgnoreCase("X") && board[5].equalsIgnoreCase("X")
                    || board[6].equalsIgnoreCase("X") && board[7].equalsIgnoreCase("X") && board[8].equalsIgnoreCase("X")
                    || board[0].equalsIgnoreCase("X") && board[3].equalsIgnoreCase("X") && board[6].equalsIgnoreCase("X")
                    || board[1].equalsIgnoreCase("X") && board[4].equalsIgnoreCase("X") && board[7].equalsIgnoreCase("X")
                    || board[2].equalsIgnoreCase("X") && board[5].equalsIgnoreCase("X") && board[8].equalsIgnoreCase("X")
                    || board[0].equalsIgnoreCase("X") && board[4].equalsIgnoreCase("X") && board[8].equalsIgnoreCase("X")
                    || board[6].equalsIgnoreCase("X") && board[4].equalsIgnoreCase("X") && board[2].equalsIgnoreCase("X")) {
                end = true;
                System.out.println("Congrats! X won!");
            } else if ((board[0].equalsIgnoreCase("O") && board[1].equalsIgnoreCase("O") && board[2].equalsIgnoreCase("O")
                    || board[3].equalsIgnoreCase("O") && board[4].equalsIgnoreCase("O") && board[5].equalsIgnoreCase("O")
                    || board[6].equalsIgnoreCase("O") && board[7].equalsIgnoreCase("O") && board[8].equalsIgnoreCase("O")
                    || board[0].equalsIgnoreCase("O") && board[3].equalsIgnoreCase("O") && board[6].equalsIgnoreCase("O")
                    || board[1].equalsIgnoreCase("O") && board[4].equalsIgnoreCase("O") && board[7].equalsIgnoreCase("O")
                    || board[2].equalsIgnoreCase("O") && board[5].equalsIgnoreCase("O") && board[8].equalsIgnoreCase("O")
                    || board[0].equalsIgnoreCase("O") && board[4].equalsIgnoreCase("O") && board[8].equalsIgnoreCase("O")
                    || board[6].equalsIgnoreCase("O") && board[4].equalsIgnoreCase("O") && board[2].equalsIgnoreCase("O"))) {
                endB = true;
                System.out.println("Congrats! O won!");
            }
        }
        {
        */

            if (control.equalsIgnoreCase(board[result])) {
                StringBuffer string = new StringBuffer();
                String s = "X";
                if (board[result] == "0") {
                    string.append("\n " + s + " | " + board[1] + " | " + board[2] + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                            " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                    String ok = string.toString();
                    System.out.println("Here is your board so far" + ok);
                }
                if (board[result] == "1") {
                    string.append("\n " + board[0] + " | " + s + " | " + board[2] + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                            " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                    String ok2 = string.toString();
                    System.out.println("Here is your board so far" + ok2);
                }
                if (board[result] == "2") {
                    string.append("\n " + board[0] + " | " + board[1] + " | " + s + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                            " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                    String ok3 = string.toString();
                    System.out.println("Here is your board so far" + ok3);
                }
                if (board[result] == "3") {
                    string.append("\n " + board[0] + " | " + board[1] + " | " + board[2] + " \n " + s + " | " + board[4] + " | " + board[5] +
                            " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                    String ok3 = string.toString();
                    System.out.println("Here is your board so far" + ok3);
                }
                if (board[result] == "4") {
                    string.append("\n " + board[0] + " | " + board[1] + " | " + board[2] + " \n " + board[3] + " | " + s + " | " + board[5] +
                            " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                    String ok4 = string.toString();
                    System.out.println("Here is your board so far" + ok4);
                }
                if (board[result] == "5") {
                    string.append("\n " + board[0] + " | " + board[1] + " | " + board[2] + " \n " + board[3] + " | " + s + " | " + s +
                            " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                    String ok5 = string.toString();
                    System.out.println("Here is your board so far" + ok5);
                }
                if (board[result] == "6") {
                    string.append("\n " + board[0] + " | " + board[1] + " | " + board[2] + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                            " \n " + s + " | " + board[7] + " | " + board[8] + "");
                    String ok6 = string.toString();
                    System.out.println("Here is your board so far" + ok6);
                }
                if (board[result] == "7") {
                    string.append("\n " + board[0] + " | " + board[1] + " | " + board[2] + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                            " \n " + board[6] + " | " + s + " | " + board[8] + "");
                    String ok7 = string.toString();
                    System.out.println("Here is your board so far" + ok7);
                }
                if (board[result] == "8") {
                    string.append("\n " + board[0] + " | " + board[1] + " | " + board[2] + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                            " \n " + board[6] + " | " + board[7] + " | " + s + "");
                    String ok8 = string.toString();
                    System.out.println("Here is your board so far" + ok8);
                }

           /* string.append("\n "+ board[0] + " | "+ board[1] + " | "+ board[2]+" \n "+ board[3] + " | "+ board[4] + " | "+ board[5] +
                    " \n "+ board[6] + " | "+ board[7] + " | "+board[8]+"");
            String ok = string.toString();
            System.out.println("Here is your board so far" + ok);
            */

                System.out.println("Player two: Where would you like to place your first O? DON'T GO WHERE PLAYER ONE WENT!" + " Choose one of the numbers on the board to place where you want to go");
                Scanner scan2 = new Scanner(System.in);
                String control2 = scan2.nextLine();
                int result2 = Integer.valueOf(control2);
                if (control2.equalsIgnoreCase(board[result2])) {
                    StringBuffer string2 = new StringBuffer();
                    String s2 = "O";
                    if (board[result2] == "0" && board[result] == "1") {
                        string2.append("\n " + s2 + " | " + s + " | " + board[2] + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                                " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                        String ok9 = string2.toString();
                        System.out.println("Here is your board so far" + ok9);
                    }
                    if (board[result2] == "0" && board[result] == "2") {
                        string2.append("\n " + s2 + " | " + board[1] + " | " + s + " \n " + board[3] + " | " + board[4] + " | " + board[5] +
                                " \n " + board[6] + " | " + board[7] + " | " + board[8] + "");
                        String ok9 = string2.toString();
                        System.out.println("Here is your board so far" + ok9);
                    }
                    if (board[result2] == "0" && board[result] == "3") {
                        string2.append("\n "+ s2 + " | "+ board[1] + " | "+ board[2]+" \n "+ s + " | "+ board[4] + " | "+ board[5] +
                                " \n "+ board[6] + " | "+ board[7] + " | "+board[8]+"");
                        String ok10 = string2.toString();
                        System.out.println("Here is your board so far" + ok10);
                    }
                }
        }

            }


    }




