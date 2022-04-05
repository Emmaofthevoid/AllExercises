package com.company.exercises2;

public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println(exchangeCurrency("HUF", 1.54));
        System.out.println(exchangeCurrency("SEK", 342.28));
        System.out.println(exchangeCurrency("USD", 234.45));
        System.out.println(exchangeCurrency("CAD", 346.54));
    }

    public static double exchangeCurrency(String currencyID, double value) {
        if (currencyID.equals("HUF")) {
            value *= 328.61;
        } else if (currencyID.equals("SEK")) {
            value *= 10.76;
        } else if (currencyID.equals("USD")) {
            value *= 1.12;
        } else if (currencyID.equals("CAD")) {
            value *= 1.47;
        }
        System.out.println(currencyID);
        return value;
    }
}
