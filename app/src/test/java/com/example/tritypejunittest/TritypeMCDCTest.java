package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(4, tri.Triang(0, 2, 2));
        assertEquals(4, tri.Triang(2, 0, 2));
        assertEquals(4, tri.Triang(2, 2, 0));
    }
}
