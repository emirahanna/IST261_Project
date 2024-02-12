package edu.psu.ist.test;

import edu.psu.ist.model.*;

import static org.junit.jupiter.api.Assertions.*;


public class OuterwearJUnitTest {
    Outerwear outerwear = new Outerwear("Aritzia", "white", "polyester", "coat", true, true, "zippers");

    //Testing toString

    @org.junit.jupiter.api.Test
    void getToString() {
        assertEquals("a white, polyester coat with zippers from Aritzia that is waterproof and has a hood.",
                outerwear.toString());
    }

    //Testing getter methods in Outerwear

    @org.junit.jupiter.api.Test
    void getOuterwearBrand() {
        assertEquals("Aritzia", outerwear.getBrand());
    }

    @org.junit.jupiter.api.Test
    void getOuterwearColor() {
        assertEquals("white", outerwear.getColor());
    }

    @org.junit.jupiter.api.Test
    void getOuterwearMaterial() {
        assertEquals("polyester", outerwear.getMaterial());
    }

    @org.junit.jupiter.api.Test
    void getOuterwearType() {
        assertEquals("coat", outerwear.getType());
    }

    @org.junit.jupiter.api.Test
    void getOuterwearIsWaterproof() {
        assertEquals(true, outerwear.isWaterproof());
    }

    @org.junit.jupiter.api.Test
    void getOuterwearHasHood() {
        assertEquals(true, outerwear.hasHood());
    }

    @org.junit.jupiter.api.Test
    void getOuterwearFasteningType() {
        assertEquals("zippers", outerwear.getFasteningType());
    }

    //Testing setter methods in Outerwear

    @org.junit.jupiter.api.Test
    void setOuterwearBrand() {
        outerwear.setBrand("ZARA");
        assertEquals("ZARA", outerwear.getBrand());
    }

    @org.junit.jupiter.api.Test
    void setOuterwearColor() {
        outerwear.setColor("chartreuse");
        assertEquals("chartreuse", outerwear.getColor());
    }

    @org.junit.jupiter.api.Test
    void setOuterwearMaterial() {
        outerwear.setMaterial("wool");
        assertEquals("wool", outerwear.getMaterial());
    }

    @org.junit.jupiter.api.Test
    void setOuterwearType() {
        outerwear.setType("cape");
        assertEquals("cape", outerwear.getType());
    }

    @org.junit.jupiter.api.Test
    void setOuterwearIsWaterproof() {
        outerwear.setWaterproof(false);
        assertEquals(false, outerwear.isWaterproof());
    }

    @org.junit.jupiter.api.Test
    void setOuterwearHasHood() {
        outerwear.setHood(false);
        assertEquals(false, outerwear.hasHood());
    }

    @org.junit.jupiter.api.Test
    void setOuterwearFasteningType() {
        outerwear.setFasteningType("buttons");
        assertEquals("buttons", outerwear.getFasteningType());
    }
}
