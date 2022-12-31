// 5. Take two numbers as input and print the largest number

package com.harsha;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        float number1 = input.nextFloat();

        System.out.print("Input another number: ");
        float number2 = input.nextFloat();

        float swap;

        if(number1 > number2){
            System.out.println(number1 + " is larger.");
        }
        else if(number2 > number1){
            System.out.println(number2 + " is larger.");
        }
        else if(number1 == number2){
            System.out.println("Both numbers are equal.");
        }
    }
}
