package com.msubaroda.shashank.lab3;
import java.util.Scanner;
public class Lab1Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if (age < 19){
            System.out.println("Sorry, U are not Eligible. ");
        }
        else {
            System.out.println("U are Eligible for voting.");
        }
    }
}
