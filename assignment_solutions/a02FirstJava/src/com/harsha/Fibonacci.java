// 7. To Calculate Fibonacci Series up to n numbers.

package com.harsha;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int previous = 0;
        int current = 1;
        int count = 2;
        System.out.print("Fibonacci Series for "+number+" is :\n");
        System.out.print(previous+" "+current);

        while(count<=number){

            int temp = current;
            current = current + previous;
            previous = temp;
            count++;

            System.out.print(" "+current);

        }

    }
}
