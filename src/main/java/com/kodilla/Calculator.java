package com.kodilla;

import java.util.Scanner;

class Kodilla {
    public static void main(String[] args) {
        int first_1;
        int second_2;
        char sign;                                                  //holding symbol to be performed.

        Scanner in = new Scanner(System.in);                        // setting variables.
        System.out.println("First number: ");
        first_1 = in.nextInt();
        System.out.println("Second number: ");
        second_2 = in.nextInt();

        System.out.println("Adding of two numbers, press +");
        System.out.println("Substraction of two numbers, press - ");
        System.out.println("Multiplication of two numbers, press * ");
        System.out.println("dividing of two numbers, press / ");

        sign = in.next().charAt(0);
        switch (sign)
        {
            case '+':
            {
                System.out.println(first_1 + second_2);
                break;
            }
            case '-':
            {
                System.out.println(first_1 - second_2);
                break;
            }
            case '*':
            {
                System.out.println(first_1 * second_2);
                break;
            }
            case '/':
            {
                System.out.println(first_1 / second_2);
                if(second_2 !=0) {                                          // != - not equal
                    System.out.println(first_1 / second_2 + "And the rest: " + first_1 % second_2); //Important % !!!
                } else {
                    System.out.println("Don't divide by 0");
                }
                break;
            }
        }
    }
}