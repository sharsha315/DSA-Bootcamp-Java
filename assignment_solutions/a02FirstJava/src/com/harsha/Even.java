// 1. Write a program to print whether a number is even or odd, also take input


package com.harsha;


import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number - ");
        int number = input.nextInt();

        if(number%2==0){
            System.out.println("Even!!!");
        }
        else{
            System.out.println("Odd!!!");
        }
    }
}
