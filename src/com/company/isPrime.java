package com.company;

import com.sun.prism.impl.shape.MaskData;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        // write your code here
        boolean prime = true;
        System.out.println("input your number to check Prime");
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        if (numberToCheck < 2) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (numberToCheck % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println(" your number is a Prime");
        } else {
            System.out.println(" your number is not a Prime");
        }


    }
}
