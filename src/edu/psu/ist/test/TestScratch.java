package edu.psu.ist.test;

import edu.psu.ist.model.*;


public class TestScratch {

    public static void testTopMethods() {
        System.out.println();
        Top top = new Top("H&M", "black", "cotton", "blouse", "round", "short", "loose");
        System.out.println("Testing Top Instantiation and Methods =>");
        System.out.println("Initial Top Object");
        System.out.println(top.toString());
        System.out.println("Retrieving the sleeveType and outfitSilhouette fields");
        System.out.println(top.getSleeveType() + " " + top.getOutfitSilhouette());
        System.out.println("After changing the color from black to aquamarine");
        top.setColor("aquamarine");
        System.out.println(top.toString());
        System.out.println();

    }

    public static void testBottomMethods() {
        System.out.println();
        Bottom bottom = new Bottom("LEVI", "navy", "cotton", "sweatpants", "straight", true, "tapered");
        System.out.println("Testing Bottom Instantiation and Methods =>");
        System.out.println("Initial Bottom Object");
        System.out.println(bottom.toString());
        System.out.println("Retrieving the cutType and bottomsFit fields");
        System.out.println(bottom.getCutType() + " " + bottom.getBottomsFit());
        System.out.println("After changing the color from navy to pink");
        bottom.setColor("pink");
        System.out.println(bottom.toString());
        System.out.println();

    }

    public static void testOuterwearMethods() {
        System.out.println();
        Outerwear outerwear = new Outerwear("Aritzia", "white", "polyester", "coat", true, true, "zippers");
        System.out.println("Testing Outerwear Instantiation and Methods =>");
        System.out.println("Initial Outerwear Object");
        System.out.println(outerwear.toString());
        System.out.println("Retrieving the cutType and bottomsFit fields");
        System.out.println(outerwear.getFasteningType() + " " + outerwear.isWaterproof());
        System.out.println("After changing the color from navy to pink");
        outerwear.setColor("pink");
        System.out.println(outerwear.toString());
        System.out.println();

    }

    public static void testHeadwearMethods() {
        System.out.println();
        Headwear headwear = new Headwear("Hegira", "cream", "wool", "beanie", true, true);
        System.out.println("Testing Headwear Instantiation and Methods =>");
        System.out.println("Initial Headwear Object");
        System.out.println(headwear.toString());
        System.out.println("Retrieving the cutType and bottomsFit fields");
        System.out.println(headwear.hasSunProtection() + " " + headwear.hasWinterProtection());
        System.out.println("After changing the color from cream to black");
        headwear.setColor("black");
        System.out.println(headwear.toString());
        System.out.println();

    }

    public static void testFootwearMethods() {
        System.out.println();
        Footwear footwear = new Footwear("Crocs", "lime green", "rubber", "crocs", 1, true, "everyday");
        System.out.println("Testing Footwear Instantiation and Methods =>");
        System.out.println("Initial Footwear Object");
        System.out.println(footwear.toString());
        System.out.println("Retrieving the cutType and bottomsFit fields");
        System.out.println(footwear.getOccasion() + " " + footwear.isWaterproof());
        System.out.println("After changing the color from lime green to fire red");
        footwear.setColor("fire red");
        System.out.println(footwear.toString());
        System.out.println();

    }

    public static void testAccessoryMethods() {
        System.out.println();
        System.out.println("Testing Accessory Instantiation and Methods =>");
        Accessory accessories = new Accessory("Pandora", "black", "steel", "earrings", "square", "formal");
        System.out.println("Initial Accessory Object");
        System.out.println(accessories.toString());
        System.out.println("Retrieving the shape and occasion fields");
        System.out.println(accessories.getShape() + " " + accessories.getOccasion());
        System.out.println("After changing the color from black to pink");
        accessories.setColor("pink");
        System.out.println(accessories.toString());
        System.out.println();

    }

    public static void main(String[] args) {
        testTopMethods();
        testBottomMethods();
        testHeadwearMethods();
        testOuterwearMethods();
        testFootwearMethods();
        testAccessoryMethods();
    }


}
