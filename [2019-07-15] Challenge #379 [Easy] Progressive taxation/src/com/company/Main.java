package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value");
        double val = scan.nextDouble();

        Tax(val);
    }

    public static void Tax(double val) {
            if(val>0) {
                if (val < 10000) System.out.println(val);
                if (val > 10000) {
                    if (val < 30000) System.out.println(val * 0.90);
                }
                if (val > 30000) {
                    if (val < 10000) System.out.println(val * 0.75);
                }
                if (val > 100000) System.out.println(val * 0.60);
            }
            else System.out.println("\n" +
                    "invalid value");
    }
}// no Bonus