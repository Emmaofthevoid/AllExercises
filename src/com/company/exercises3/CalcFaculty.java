package com.company.exercises3;

public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println(calcFaculty(9));
    }

    static long calcFaculty(int value) {
        //make a variable to store the result, it can't be 0 bc 0 * everything = 0
        int multiplication = 1;
        //make a new variable (i) that has also value 1 (for the same reason) that navigates through the number
        System.out.println("!" + value + ": ");
        for (int i = 1; i <= value; i++) {
            //here is the value of multiplication updated after each loop, same like in the sum exercises
            multiplication = multiplication * i;
            // until the number we gave, it will print the number and *
            if (i < value) {
                System.out.print(i + "*");
            }
            //when it reaches the value we entered, it will print it + =
                if (i == value)

                    System.out.println(i + "=");
            }
        //it returns the multiplication of all the numbers until the value, since they have been looped one by one
        return multiplication;
    }
}
