package com.msubaroda.shashank.lab3;
import java.util.Scanner;
public class Lab1Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        String result = (num1 > num2)?"Number 1 is Greater than Number 2":"Number 2 is Greater than Number 1";
        System.out.println(result);
    }
}
