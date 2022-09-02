package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void max_isCorrect() {
        MinMax m = new MinMax();
        assertEquals(m.max(4,3), 4);
        assertEquals(m.max(2,2), 2);
        assertEquals(m.max(1,12), 12);
        assertEquals(m.max(55,78), 78);
    }

    @Test
    public void min_isCorrect() {
        MinMax m = new MinMax();
        assertEquals(m.min(4,3), 3);
        assertEquals(m.min(2,2), 2);
        assertEquals(m.min(1,12), 1);
        assertEquals(m.min(55,78), 55);
    }
}