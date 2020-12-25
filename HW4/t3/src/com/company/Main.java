package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        studentinfo studentinfo = new studentinfo();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your fullname");
        studentinfo.setFullname(input.nextLine());
        System.out.println("enter your fathername");
        studentinfo.setFathername(input.nextLine());
        System.out.println("enter student number");
        studentinfo.setStudent_number(input.nextLine());
        List <Double> grade = new ArrayList<>();
        System.out.println("enter your first grade");
        grade.add(input.nextDouble());
        System.out.println("enter your second grade");
        grade.add(input.nextDouble());
        System.out.println("enter your third grade");
        grade.add(input.nextDouble());
        System.out.println("enter your fourth grade");
        grade.add(input.nextDouble());
        System.out.println("enter your fifth grade");
        grade.add(input.nextDouble());
        System.out.println(studentinfo.getFullname());
        System.out.println(studentinfo.getFathername());
        System.out.println(studentinfo.getStudent_number());


    }
}
