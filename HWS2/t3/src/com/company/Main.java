package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        System.out.println("enter your number :");
        Scanner scanner = new Scanner(System.in);
        num = Integer.parseInt(scanner.next());
        Num_Info num_info = new Num_Info();

        System.out.println(num_info.isPositive(num));

        System.out.println(num_info.isNegative(num));

        System.out.println(num_info.isZero(num));

        System.out.println(num_info.isEven(num));

        System.out.println(num_info.isOdd(num));
    }
}