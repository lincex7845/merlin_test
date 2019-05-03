package com.mera.merlin;

import java.math.BigInteger;
import java.util.Scanner;

public class Punto2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your number below: ");
        Integer n = in.nextInt();
        System.out.println(lastTenDigits(n));
    }

    private static String lastTenDigits(int number){
        BigInteger series = BigInteger.ZERO;
        for (int i = 1; i <= number; i++) {
            series = series.add(BigInteger.valueOf(i).pow(i));
        }

        String lastTenDigits = series.toString();
        if(lastTenDigits.length() >= 10)
            return "last ten digits of the series: " + lastTenDigits.substring(lastTenDigits.length() - 10);
        else
            return series + " does not have at least 10 digits";
    }
}