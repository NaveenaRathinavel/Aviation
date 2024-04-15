package com.aviation.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class PartTest {

    private Part part;

    @Before
    public void setUp() {
        part = new Part();
    }

    @Test
    public void testIdGetterAndSetter() {
        part.setId(1);
        assertEquals(1, part.getId());
    }

    @Test
    public void testNameGetterAndSetter() {
        part.setName("Test Part");
        assertEquals("Test Part", part.getName());
    }

    @Test
    public void testQuantityGetterAndSetter() {
        part.setQuantity(10);
        assertEquals(10, part.getQuantity());
    }

    @Test
    public void testAircraftGetterAndSetter() {
        Aircraft aircraft = new Aircraft();
        part.setAircraft(aircraft);
        assertEquals(aircraft, part.getAircraft());
    }

    @Test
    public void testParameterizedConstructor() {
        Aircraft aircraft = new Aircraft();
        Part newPart = new Part(1, "Test Part", 10, aircraft);
        assertEquals(1, newPart.getId());
        assertEquals("Test Part", newPart.getName());
        assertEquals(10, newPart.getQuantity());
        assertEquals(aircraft, newPart.getAircraft());
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(part);
    }
}
