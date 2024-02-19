package edu.psu.ist.model;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Clothing implements OutfitManager {
    private String brand; //Determines the brand, e.g. UNIQLO, lululemon, Aritzia, Columbia etc.
    private String color; //Determines the color. String so that user can be as vague or specific they want to be.
    private String material; // Determines the material. e.g. cotton, wool, linen, polyester etc.
    private String type; // Determines type of specific outfit. e.g. types for top may be t-shirt, polo, turtleneck etc.
    private int rating;

    public Clothing(String brand, String color, String material, String type) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
    }


    public String careLabel() {
        StringBuilder label = new StringBuilder();
        //general advice
        label.append("Turn clothing inside out.\n");
        label.append("Fasten any zips or buttons or ties, if any.\n");

        //checks color
        if (color.equalsIgnoreCase("white")) {
            label.append("Separate from dark colors.\n");
            label.append("Wash in hot water with vinegar and baking soda.\n");
        }
        if (material.equalsIgnoreCase("lace") || material.equalsIgnoreCase("satin") ||
                material.equalsIgnoreCase("silk") || material.equalsIgnoreCase("chiffon")) {
            label.append("Hand wash this garment.\n");
        }

        return label.toString();
    }

    /**
     * @param rating
     * @return
     */
    @Override
    public void rateItem(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.err.println("Please give a valid rating (number between 1 to 5)");
        }
    }

    /**
     * @return
     */
    @Override
    public String getDetailedDescription() {
        StringBuilder description = new StringBuilder();
        return description.append(this.toString()).append("\n").append(careLabel()).toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRating() {
        try {
            return this.toString() + " has a rating of " + rating + " stars";
        } catch (Exception e) {
            return "This " + this.getClass().getSimpleName() + " has not been given a rating";
        }
    }

    @Override
    public String toString() {
        return "a " + color + ", " + material + " " + type + " from " + brand + ".";
    }
}
