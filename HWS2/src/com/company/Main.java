package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int select;
        float x;
        float y;
        System.out.println("calculate");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        x = input.nextFloat();
        y = input.nextFloat();
        System.out.println("Enter 1 to sum");
        System.out.println("Enter 2 to minus");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to division");
        select = input.nextInt();
        calculate calculate = new calculate();


        switch (select) {
            case 1:
                calculate.sum(x,y);
            case 2:
                calculate.minus(x,y);
            case 3:
                calculate.multiply(x,y);
            case 4:
                calculate.div(x,y);
            default:
                System.out.println(" please enter 1-4 ");
        }
    }
}
