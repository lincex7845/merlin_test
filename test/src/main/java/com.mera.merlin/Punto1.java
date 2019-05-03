package com.mera.merlin;

/**
 * Calcula factorial de un numero
 * Suma los digitos del factorial
 * Reporta resultado
 */
public class Punto1 {

    public static Long factorial(Long n) {
        return calculateFactorial(1l, n);
    }

    private static Long calculateFactorial(Long acc, Long n) {
        if (n == 1l || n == 0l) {
            return acc;
        } else {
            return calculateFactorial(acc * n, n - 1);
        }
    }

    public static Long getFactorialAndSumDigits(Long n) {
        Long factorial = factorial(n);
        return sumDigits(factorial);
    }

    private static Long sumDigits(Long n) {
        String[] digits = n.toString().split("");
        Long sum = 0l;
        for (String d : digits) {
            Long _d = Long.parseLong(d);
            sum += _d;
        }
        return sum;
    }
}
