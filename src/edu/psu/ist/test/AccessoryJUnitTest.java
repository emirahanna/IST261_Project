package edu.psu.ist.test;

import edu.psu.ist.model.*;

import static org.junit.jupiter.api.Assertions.*;


public class AccessoryJUnitTest {
    Accessory accessories = new Accessory("Pandora", "black", "steel", "earrings", "square", "formal");

    //Testing toString method

    @org.junit.jupiter.api.Test
    void getToString() {
        assertEquals("a black, square, steel earrings for formal occasions from Pandora.", accessories.toString());
    }

    //Testing getter methods in Accessory
    @org.junit.jupiter.api.Test
    void getAccessoryBrand() {
        assertEquals("Pandora", accessories.getBrand());
    }

    @org.junit.jupiter.api.Test
    void getAccessoryColor() {
        assertEquals("black", accessories.getColor());
    }

    @org.junit.jupiter.api.Test
    void getAccessoryMaterial() {
        assertEquals("steel", accessories.getMaterial());
    }

    @org.junit.jupiter.api.Test
    void getAccessoryType() {
        assertEquals("earrings", accessories.getType());
    }

    @org.junit.jupiter.api.Test
    void getAccessoryShape() {
        assertEquals("square", accessories.getShape());
    }

    @org.junit.jupiter.api.Test
    void getAccessoryOccasion() {
        assertEquals("formal", accessories.getOccasion());
    }

    //Testing setter methods in Accessory
    @org.junit.jupiter.api.Test
    void setAccessoryBrand() {
        accessories.setBrand("Cartier");
        assertEquals("Cartier", accessories.getBrand());

    }

    @org.junit.jupiter.api.Test
    void setAccessoryColor() {
        accessories.setColor("rose");
        assertEquals("rose", accessories.getColor());
    }

    @org.junit.jupiter.api.Test
    void setAccessoryMaterial() {
        accessories.setMaterial("gold");
        assertEquals("gold", accessories.getMaterial());
    }

    @org.junit.jupiter.api.Test
    void setAccessoryType() {
        accessories.setType("necklace");
        assertEquals("necklace", accessories.getType());
    }

    @org.junit.jupiter.api.Test
    void setAccessoryShape() {
        accessories.setShape("diamond");
        assertEquals("diamond", accessories.getShape());
    }

    @org.junit.jupiter.api.Test
    void setAccessoryOccasion() {
        accessories.setOccasion("casual");
        assertEquals("casual", accessories.getOccasion());
    }


}
