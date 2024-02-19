package edu.psu.ist.test;

import edu.psu.ist.model.*;
import java.util.ArrayList;
import java.util.Collections;


public class TestHarness {

    public TestHarness() {
        //tests model classes to see if interfaces work
        manualTestInterface();
    }

    public void manualTestInterface() {
        //Create ArrayList of OutfitManager type
        ArrayList<OutfitManager> interfaceArrayList = new ArrayList<>();

        //instantiate object from implemented classes
        OutfitManager testCloset = new Closet();
        OutfitManager testClothing = new Top("H&M", "black", "cotton", "blouse", "round", "short", "loose");

        //populate the closet so rateItem can be implemented successfully
        Outerwear outerwear = new Outerwear("Aritzia", "white", "polyester", "coat", true, true, "zippers");
        Headwear headwear = new Headwear("Hegira", "cream", "wool", "beanie", true, true);
        Footwear footwear = new Footwear("Crocs", "lime green", "rubber", "crocs", 1, true, "everyday");
        Collections.addAll(Closet.getClosetArrayList(), outerwear, headwear, footwear);

        //add instantiated objects into ArrayList
        Collections.addAll(interfaceArrayList, testCloset, testClothing);

        //Call overridden method to demonstrate how the implementing classes act differently with the same method call due to polymorphism.
        for (OutfitManager o :
                interfaceArrayList) {
            System.out.println("-----------------------------------------------");
            System.out.println();
            System.out.println("Testing the getRating() and rateItem() method.");
            System.out.println();
            o.rateItem(4);
            System.out.println(o.getRating());
            System.out.println();
            System.out.println("Testing the getDetailedDescription() method.");
            System.out.println();
            System.out.println(o.getDetailedDescription());

        }


    }

    public void manualTestPolymorphism() {
        //Create ArrayList using superclass as the data type
        ArrayList<Clothing> clothingArrayList = new ArrayList<>();

        //instantiate object from subclasses
        Top top = new Top("H&M", "black", "cotton", "blouse", "round", "short", "loose");
        Bottom bottom = new Bottom("LEVI", "navy", "denim", "jeans", "straight", false, "tapered");
        Outerwear outerwear = new Outerwear("Aritzia", "white", "polyester", "coat", true, true, "zippers");
        Headwear headwear = new Headwear("Hegira", "cream", "wool", "beanie", true, true);
        Footwear footwear = new Footwear("Crocs", "lime green", "rubber", "crocs", 1, true, "everyday");
        Accessory accessories = new Accessory("Pandora", "black", "steel", "earrings", "square", "formal");

        //add instantiated objects into ArrayList
        Collections.addAll(clothingArrayList, top, bottom, outerwear, headwear, footwear, accessories);

        //Call overridden method careLabel() for all the subclasses in the ArrayList
        for (Clothing c :
                clothingArrayList) {
            System.out.println("Care label for a/an " + c.getClass().getSimpleName());
            System.out.println(c.careLabel());
            System.out.println();
        }
    }

    public void manualTestTop() {
        //instantiates Top object
        Top top = new Top("H&M", "black", "cotton", "blouse", "round", "short", "loose");

        //Test getter methods in Top
        System.out.println("Test top created successfully");
        System.out.println("Testing getter methods");
        System.out.println("Top info: " + top.getBrand() + " " + top.getColor() + " " + top.getMaterial() + " "
                + top.getType() + " " + top.getNeckline() + " " + top.getSleeveType() + " " + top.getOutfitSilhouette());

        //Test setter methods in Top
        top.setBrand("Forever 21");
        top.setColor("tiffany blue");
        top.setMaterial("poly-cotton");
        top.setType("sweater");
        top.setNeckline("sweetheart");
        top.setSleeveType("3/4 sleeves");
        top.setOutfitSilhouette("fitted");

        System.out.println("Testing setter methods");
        System.out.println("Top info: " + top.getBrand() + " " + top.getColor() + " " + top.getMaterial() + " "
                + top.getType() + " " + top.getNeckline() + " " + top.getSleeveType() + " " + top.getOutfitSilhouette());

        //Test toString()
        System.out.println(top.toString());
        System.out.println();

    }

    public void manualTestBottom() {
        //instantiates bottom object
        Bottom bottom = new Bottom("LEVI", "navy", "cotton", "sweatpants", "straight", true, "tapered");

        //Test getter methods in Bottom
        System.out.println("Test bottom created successfully");
        System.out.println("Testing getter methods");
        System.out.println("Bottom info: " + bottom.getBrand() + " " + bottom.getColor() + " " + bottom.getMaterial()
                + " " + bottom.getType() + " " + bottom.getCutType() + " " + bottom.isCuffed() + " " + bottom.getBottomsFit());

        bottom.setBrand("Ardene");
        bottom.setColor("tan");
        bottom.setMaterial("linen");
        bottom.setType("trousers");
        bottom.setCutType("pleated");
        bottom.setCuffed(false);
        bottom.setBottomsFit("loose");

        //Test setter methods in Bottom
        System.out.println("Testing setter methods");
        System.out.println("Bottom info: " + bottom.getBrand() + " " + bottom.getColor() + " " + bottom.getMaterial()
                + " " + bottom.getType() + " " + bottom.getCutType() + " " + bottom.isCuffed() + " " + bottom.getBottomsFit());

        //Test toString()
        System.out.println(bottom.toString());
        System.out.println();
    }
}
