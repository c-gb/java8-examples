package com.slb.core.unittest;

import org.junit.jupiter.api.*;

public class JUnitTestCases {

    @Test
    public void testMethodDemo(){
        System.out.println("in test method 1");
        assert 4 == 4;
    }

    @Test
    public void testMethodDemo2(){
        System.out.println("in test method 2");
        assert "SLB" == "SLB";

    }

    @BeforeEach
    public void testBeforeEachDemo(){
        System.out.println("in before each method");
    }

    @AfterEach
    public void testAfterEachDemo(){
        System.out.println("in after each method");
    }

    @BeforeAll
    public static void testBeforeAllDemo(){
        System.out.println("in BeforeAll method");
    }

    @AfterAll
    public static void testAfterAllDemo(){
        System.out.println("in AfterAll method");
    }
}
