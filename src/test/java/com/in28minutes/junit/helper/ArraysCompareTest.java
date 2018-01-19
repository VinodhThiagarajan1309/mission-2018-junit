package com.in28minutes.junit.helper;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by vthiagarajan on 1/18/18.
 */
public class ArraysCompareTest {

    //Arrays.sort

    @Test
    public void testArraysSort_RandomArray() {
        int[] numbers = { 12,3,4,1};
        int[] expected = {1  , 3 , 4 ,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraysSort_NullArray()

    {
        int[] numbers = null;
        //int[] expected = {1 , 2 , 3 , 4 ,12};
        Arrays.sort(numbers);
    }

    @Test(timeout = 30)
    public void testSort_Performance() {
        int[] array = {12,23,4};
        for(int i = 1 ; i < 2000000; i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }


    }
