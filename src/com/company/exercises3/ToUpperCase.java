package com.company.exercises3;

public class ToUpperCase {
    public static void main(String[] args) {
        System.out.println(toUpperCase("i became a zombie, not alive but i am still walking"));
    }

    // make it String bc he is giving back a modified String, not only something that we are printing
    public static String toUpperCase(String original) {
        //make a new string to save the modified string, initialize like this bc String is a class
        String rebuild = new String();
        //make and initialize a char variable that navigates through every character of the original string
        char c = ' ';
        //loop that loops for as long as the original string is, checking char by char
        for (int i = 0; i < original.length(); i++) {
            //here we say c equals to the position where i is located at the moment
            c = original.charAt(i);
            //in case that i is 0 or bigger than 0 and has an empty space before, c will equal to an upper case
            if (i == 0 || i > 0 && original.charAt(i - 1) == ' ') {
                //c equals to an upper case from the original string, wherever the i is located
                c = Character.toUpperCase(original.charAt(i));
            }
            //outside of the if statement but inside of the for loop, the new string that we made inside the method equals
            //itself, empty in the beginning, and then will be adding letter by letter as c navigates through the string.
            rebuild = rebuild + c;
        }
        // it returns the new rebuilt string
        return rebuild;
    }

}

