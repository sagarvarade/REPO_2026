package com.java;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    MathUtils mathUtils=new MathUtils();

    @Test
    void add() {
        System.out.println("Testing ");
        //fail("Not yet implemented.");
        assertTrue(true);
        assertEquals(30,mathUtils.add(10,20),"This is message!");
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        assertIterableEquals(List.of(1,2,3),List.of(1,2,3));

    }

    @Test
    void sub() {
    }
}