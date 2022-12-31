// 2. Take name as input and print greetings message from that name

package com.harsha;
import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name - ");
        String name = input.next();

        System.out.println("Hello " + name +"!!!");
    }

}
