package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vthiagarajan on 1/18/18.
 */
public class StringHelperTest2 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public  void setUp(){
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        System.out.println("test 1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test 2 executed");
    }

    @After
    public  void tearDown(){
        System.out.println("After Test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
}