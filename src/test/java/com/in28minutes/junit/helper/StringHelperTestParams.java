package com.in28minutes.junit.helper;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vthiagarajan on 1/18/18.
 */
@RunWith(Parameterized.class)
public class StringHelperTestParams {

    StringHelper   helper = new StringHelper();

    public StringHelperTestParams(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    private String input;
    private String expectedOutput;

    @Parameterized.Parameters
    public static Collection testConditions() {
        String expectedOutputs [][]= {{ "ACD" ,  "CD"}};
        return Arrays.asList(expectedOutputs);
    }


    @Test
    public void testtruncateAInFirst2Positions_AinFirst2Positions(){

        System.out.println("exp  " + expectedOutput);
        System.out.println("inp  " + input);
        assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
    }




}