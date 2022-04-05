package com.company.exercises2;

public class ArraySum {
    public static void main(String[] args) {
        int[] arrayToSum = {2, 3, 4, 5};
        System.out.println(calculateSum(arrayToSum));
    }

    public static int calculateSum(int[] numbers) {
        //empty variable to store the value of the sum each round of the loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            //the sum gets updated each loop
            sum += numbers[i];

        }
        return sum;
    }
}
