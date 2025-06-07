package com.DSA.A_01_Array;

public class ArrayTest {
    public static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(" " + a);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        printArray(arrayOne);
        arrayOne[0] = 10;
        printArray(arrayOne);
        try {
            arrayOne[5] = 20;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
