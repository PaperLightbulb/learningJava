package com.learningJava.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassToTestTest {
    ClassToTest classToTest;
    @BeforeEach
    void setUp() {
        classToTest = new ClassToTest();
    }

    @Test
    void testOne() {
        assertEquals(classToTest.getNumPlusOne(3), 4);
    }
    @Test
    void testTwo() {
        assertEquals(classToTest.getNumPlusOne(23542), 23543);
    }
    @Test
    void testThree() {
        assertEquals(classToTest.getNumPlusOne(234509), 234510);
    }
    @Test
    void testFour() {
        assertEquals(classToTest.getNumPlusOne(3), 2);
    }
}