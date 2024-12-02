package com.java.A_Array;

import java.util.Arrays;

/*
Array Single dimension and multi dimension
Data type can not be changed
Size can not be changed.
Better to access by index.

dataType [] arrayName=new dataType[size]; // Preferred syntax

dataType arrayName[] =new dataType[size];

 */
public class ArrayApp {
    public static void main(String[] args) {
        // extracted();
        // removeEvenIntegerFromArray(new int[]{1,2,3,4,5,6,7,8});
           reverseTheArray(new int[]{1,2,3,4,5,6,7,8},3,5);;
    }

    private static void reverseTheArray(int[] ints, int start, int end) {
        System.out.println("Before Array : "+Arrays.toString(ints));
        while (start<end){
            int temp=ints[start];
            ints[start]=ints[end];
            ints[end]=temp;
            start++;
            end--;
        }
        System.out.println("After Array : "+Arrays.toString(ints));
    }

    private static void removeEvenIntegerFromArray(int[] ints) {
        Arrays.stream(ints).filter(e->e%2!=0).forEach(e->System.out.print(">"+e));
    }

    private static void extracted() {
        int [] intArray;
        int [] bArray={1,2,4};  // Initialization
        intArray=new int[5];
        intArray[0]=10;  // Adding element to array
        intArray[1]=20;

        // Iterations of array
        for(int i:intArray){
            System.out.println(i);
        }
        for(int i=0;i<bArray.length;i++){
            System.out.println(i);
        }
        Arrays.stream(intArray).forEach(e->System.out.print(e+" > "));
        System.out.println(" \n "+Arrays.toString(bArray));
        try {
            bArray[4] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught Array Index of of bound barry");
        }
    }
}
