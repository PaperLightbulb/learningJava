package com.learningJava.projects.bowl;

import com.learningJava.projects.bowl.Bowl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlTest {
    Bowl bowl = new Bowl(5, 7, "Glass");

    @Test
    public void testRadius() {
        assertEquals(5, bowl.getRadius());
    }
    @Test
    public void testHeight() {
        assertEquals(7, bowl.getHeight());
    }
    @Test
    public void testMaterial() {
        assertEquals("Glass", bowl.getMaterial());
    }
}