package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float len,bre,peri,area;
        Scanner scan =new Scanner(System.in);
        System.out.println("plz enter the length and breadth of your shape");
        len=scan.nextFloat();
        bre=scan.nextFloat();
        area=len*bre;
        peri=(2*len)+(2*bre);
        System.out.println("area = "+area);
        System.out.println("primeter = "+peri);
    }
}

