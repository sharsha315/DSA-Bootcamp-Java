// 9. To find Armstrong number between two given number.

package com.harsha;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input two numbers : ");
        boolean isNumber1 = false;
        boolean isNumber2 = false;

        for (int i = 0; i < 2; i++) {
            int number = input.nextInt();
            int remainder = 0;
            int sum = 0;
            int temp = number;

            while(number>0){

                remainder = number%10;
                sum += (remainder*remainder*remainder);
                number /= 10;
            }

            if(i==0){
                if(temp==sum){
                    isNumber1 = true;

                }
            }
            if(i==1){
                if(temp==sum){
                    isNumber2 = true;

                }
            }

        }
        // First number or second number is Armstrong.
        if(isNumber1==true){
            System.out.println("First Number is Armstrong");
        }
        if(isNumber2==true){
            System.out.println("Second number is Armstrong");
        }

    }
}
