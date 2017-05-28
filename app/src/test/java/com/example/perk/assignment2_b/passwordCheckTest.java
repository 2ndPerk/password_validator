package com.example.perk.assignment2_b;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Perk on 2017-05-28.
 * tests things
 */

public class passwordCheckTest {
    @Test
    public void passwordCheckWorks(){
        assertTrue(MainActivity.checkPassword("Aa1qwerty"));
        assertFalse(MainActivity.checkPassword("password"));
        assertFalse(MainActivity.checkPassword("aB1"));
    }
}
