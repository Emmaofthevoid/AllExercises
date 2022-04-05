package com.company.exercises2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrayToReverse = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reverse(arrayToReverse)));
    }

    public static int[] reverse(int[] original) {
        //creat a new array to store the new values, as long as the original array is
        int[] newArray = new int[original.length];
        //new variable created to store the values for the new array
        int j = 0;
        //for loop to navigate through the array, i = .length-1 to position it in the last place of the array,
        //and as long as i is bigger or equal to zero (bc arrays begin with 0) it will go on
        for (int i = original.length -1; i >= 0; i--) {
        // the position of j in the new array has the value of the position i in the original one
            newArray[j] = original[i];
        // j increases along with i in the for loop bc both arrays have the same length
            j++;
        }
        return newArray;
    }
}
