package com.learningJava.bowl;

import jakarta.annotation.security.RunAs;
import org.atmosphere.interceptor.AtmosphereResourceStateRecovery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlTest {
    Bowl bowl = new Bowl(5, 7, "Glass");

    @Test
    public void testRadius() {
        assertEquals(5, bowl.radius);
    }
    @Test
    public void testHeight() {
        assertEquals(7, bowl.height);
    }
    @Test
    public void testMaterial() {
        assertEquals("Glass", bowl.material);
    }
}