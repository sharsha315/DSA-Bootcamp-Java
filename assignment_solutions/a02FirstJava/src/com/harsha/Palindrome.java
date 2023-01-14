// 8. To find out whether the given String is Palindrome or not.

package com.harsha;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String aString = input.next();
        String a = "";

        for(int i=0;i<aString.length();i++){

            a += aString.charAt(aString.length()-1-i);

        }
        if(aString.equals(a)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
}
