package com.com.pepcoding;

import java.util.Scanner;

public class A_1_Numbers {
    public static void main(String[] args) {
        // countDigitsInNumber(1234563);
        // printNumberLeftToRight();
        // reverseANumber();
        inverseOfNumber();


    }

    private static void inverseOfNumber() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter number : ");
            int number=sc.nextInt();
            
        }
    }

    private static void reverseANumber() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter number : ");
            int number=sc.nextInt();
            while(number!=0){
                int rem=number%10;
                System.out.print(rem+"\t");
                number=number/10;
            }
        }
    }

    private static void printNumberLeftToRight() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter number");
            int number=sc.nextInt();
            int count=0;
            int temp=number;
            while(temp!=0){
                count=count+1;
                temp=temp/10;
            }
            int div=(int)Math.pow(10,count-1);
            while(div!=0){
                int quotient=number/div;
                System.out.println(quotient);
                number=number%div;
                div=div/10;
            }
        }
    }


    private static void countDigitsInNumber(int number) {
        int count=0;
        while (number>0){
            count++;
            number=number/10;
        }
        System.out.println(count);
    }
}
