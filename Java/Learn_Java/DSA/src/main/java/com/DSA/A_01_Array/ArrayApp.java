package com.DSA.A_01_Array;

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
        // reverseTheArray(new int[]{1,2,3,4,5,6,7,8},3,5);;
        // findSecondMaxValue(new int[]{1,2,3,4,5,6,7,8,8});
        // moveZerosToEnd(new int[]{8,1,0,2,1,0,3},7);
        // resizeArray(new int[]{8,1,0,2,1,0,3},15);
        System.out.println(checkStringIsPalindrome("madamm"));
    }

    private static boolean checkStringIsPalindrome(String string) {
        char [] charArray=string.toCharArray();
        int start=0;
        int end=string.length()-1;
        while (start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return  true;
    }

    private static void resizeArray(int[] intArray, int capacity) {
        System.out.println("Before Array : "+Arrays.toString(intArray));
        int [] newArray=new int[capacity];
        for(int i=0;i<intArray.length;i++){
            newArray[i]=intArray[i];
        }
     //   System.arraycopy(ints, 0, newArray, 0, ints.length);
        System.out.println("After Array : "+Arrays.toString(newArray));
    }

    private static void moveZerosToEnd(int[] arr, int n) {
        int j=0;
        System.out.println("Before array : "+Arrays.toString(arr));
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println("After array : "+Arrays.toString(arr));
    }

    private static void findSecondMaxValue(int[] ints) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i:ints){
            if(i>max){
                secondMax=max;
                max=i;
            }else if(i>secondMax && i!=max){
                secondMax=i;
            }
        }
        System.out.println("Second max : "+secondMax);
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
