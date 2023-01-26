
// package com.company;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number :");
        int a = obj.nextInt();
        System.out.print("enter a number :");
        int b = obj.nextInt();
        int sum = a+b;
        System.out.println("sum is = " + sum);
    }
}
