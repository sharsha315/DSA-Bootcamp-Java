// 3. Write a program to input principal, time, and rate (P, T, R)
//    from the user and find Simple Interest.

package com.harsha;
import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Formula to calculate Simple Interest - P(1 + RT)
        System.out.print("Input Principal: ");
        float princial = input.nextFloat();

        System.out.print("Input Interest Rate: ");
        float rate = input.nextFloat();

        System.out.print("Input Time: ");
        int time = input.nextInt();

        float si = princial * (1 + ((rate/100) * time));
        System.out.println("Simple Interest is " + si);

    }
}
