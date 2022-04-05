package com.company.exercises2;

public class PingPong {
    public static void main(String[] args) {
        pingPongGame(0);
        forLoopPingPong(0);
    }

    public static void pingPongGame(int value) {
        while (value < 100) {
            if (value % 6 == 0) {
                System.out.println(value + " ping pong");
            } else if (value % 3 == 0) {
                System.out.println(value + " pong");
            } else if (value % 2 == 0) {
                System.out.println(value + " ping");
            }
            value++;
        }
    }

    public static void forLoopPingPong(int value) {
        //the i variable exists only to be equal to the other variable (the one we give as info when we
        //call the method
        for (int i = value; value < 100; value++) {
            if (value % 6 == 0) {
                System.out.println(value + " ping pong");
            } else if (value % 3 == 0) {
                System.out.println(value + " pong");
            } else if (value % 2 == 0) {
                System.out.println(value + " ping");
            }

        }
    }
}
