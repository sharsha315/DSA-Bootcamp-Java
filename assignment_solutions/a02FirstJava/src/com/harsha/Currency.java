// 6. Input currency in rupees and output in USD

package com.harsha;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input amount in rupees: ");
        double rupees = input.nextDouble();
        double usd = rupees / 82.45;
        System.out.println("Amount in Dollars: $"+ usd);

    }
}
