package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("calculator is ready");

        CalculateFactory calculateFactory=new CalculateFactory();
        Calculate calculate=calculateFactory.getCalculate();
        calculate.calculation();
    }
}
