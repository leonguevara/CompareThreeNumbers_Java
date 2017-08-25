/*
 *  Main.java
 *  CompareThreeNumbers_Java
 *
 *  This program will help you get the biggest number among three given by the user.
 *
 *  Java:   SDK 1.8 - Language level 8
 *
 *  Author: León Felipe Guevara Chávez
 *  email:  leon.guevara@itesm.mx
 *  date:   May 29th, 2017
 */
package com.leonguevara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double biggest;     // To store the biggest number of the three

        //  We ask for and read three numbers for the user
        System.out.print("Give me the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Give me the second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("Give me the third number: ");
        double number3 = scanner.nextDouble();

        //  We find which of the three numbers is the biggest
        if (number1 >= number2 && number1 >= number3) {
            //  If number1 is bigger than or equals to number2 and number3, then number2 is the biggest
            biggest = number1;
        } else {
            if (number2 >= number1 && number2 >= number3) {
                //  If number2 is bigger than or equals to number1 and number3, then number2 is the biggest
                biggest = number2;
            } else {
                //  If none of the above were true, then number3 is the biggest
                biggest = number3;
            }
        }

        //  We display our findings
        System.out.println("The biggest number among the three is: " + biggest);
    }
}
