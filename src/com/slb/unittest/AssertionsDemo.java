package com.slb.core.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsDemo {

    @Test
    public void whenAssertingEquality() {

        String expected = "SLB";
        String actual = "SLB";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenAssertingNonEquality() {
        String expected = "SLB";
        String actual = "Simplified Learning Blog";

        Assertions.assertNotEquals(expected, actual);
    }

    @Test
    public void whenAssertingArraysEquality() {
        char[] expected = {'J','A','V','A','8'};
        char[] actual = "JAVA8".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenAssertingNotSameObject() {
        Object ram = new Object();
        Object shyam = new Object();

        assertNotSame(ram, shyam);
    }
    @Test
    public void whenAssertingSameObject() {
        Object ram = new Object();
        Object rahul = ram;

        assertSame(ram, rahul);
    }
    @Test
    public void whenAssertingTrueConditions() {
        assertTrue( 100 > 10);
    }
    @Test
    public void whenAssertingFalseConditions() {
        assertFalse( 5 > 6);
    }
//    @Test
//    public void whenAssertingTriggersFail() {
//        fail("Exception scenario");
//    }

    @Test
    public void testAssertThat() {
        assertAll( "asserting all", ( () -> assertTrue( 5 > 4) ), () -> assertFalse( 3 > 4) );

    }
    @Test
    void whenAssertingException_thenThrown() {
        Throwable exception = assertThrows(
                ArithmeticException.class,
                () -> {
                    throw new ArithmeticException("Exception message");
                }
        );
        assertEquals("Exception message", exception.getMessage());
    }
}
