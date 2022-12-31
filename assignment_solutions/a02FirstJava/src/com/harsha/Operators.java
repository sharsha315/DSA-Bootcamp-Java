// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.harsha;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        float number1 = input.nextFloat();

        System.out.print("Input another number: ");
        float number2 = input.nextFloat();

        System.out.print("Input the operator: ");
        char character = input.next().charAt(0);

        //float result;

        if(character == '+'){
            float result = number1 + number2;
            System.out.println("Addition : " + result);
        }
        else if(character == '-'){
            float result = number1 - number2;
            System.out.println("Subtraction : " + result);
        }
        else if(character == '*'){
            float result = number1 * number2;
            System.out.println("Multiplication : " + result);
        }
        else if(character == '/'){
            float result = number1 / number2;
            System.out.println("Division : " + result);
        }


    }
}
