package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by vthiagarajan on 1/18/18.
 */
public class StringHelperTest {

    StringHelper helper;

    @org.junit.Before
    public void setUp() throws Exception {
        helper = new StringHelper();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void truncateAInFirst2Positions() throws Exception {

    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() throws Exception {

    }

    @Test
    public void testtruncateAInFirst2Positions_AinFirst2Positions(){


        assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testtruncateAInFirst2Positions2_AinFirstPosition(){
        StringHelper helper = new StringHelper();

        assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenarion(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }


}