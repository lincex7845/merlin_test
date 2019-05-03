package com.mera.merlin;

import org.junit.jupiter.api.Test;
import com.mera.merlin.Punto1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Punto1Test {

    @Test
    public void factorialTest(){
        Long f = Punto1.factorial(5l);
        assertEquals(120l, f);
    }

    @Test
    public void factorialZeroTest(){
        Long _f0 = Punto1.factorial(0l);
        assertEquals(1l, _f0);
    }

    @Test
    public void getFactorialAndSumDigits(){
        Long sum = Punto1.getFactorialAndSumDigits(5l);
        assertEquals(3l, sum);
    }

    @Test
    public void getFactorialAndSum_12_fact(){
        Long _fact_10 = 479001600l;
        Long _sum_fact_10 = 27l;
        Long actualF = Punto1.factorial(12l);
        Long actualS = Punto1.getFactorialAndSumDigits(12l);
        assertEquals(_fact_10, actualF);
        assertEquals(_sum_fact_10, actualS);
    }

}
