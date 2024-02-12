package edu.psu.ist.model;

public class Accessory extends Clothing {
    private String shape; //Describes the shape of accessories. e.g. square, chunky, thin, mini etc.
    private String occasion; //Accessories have variety. Determines the occasion for accessories. e.g. sport, office,
    // everyday, formal etc.

    public Accessory(String brand, String color, String material, String type, String shape, String occasion) {
        super(brand, color, material, type);
        this.shape = shape;
        this.occasion = occasion;
    }

    @Override
    public String careLabel() {
        return super.careLabel();
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        return "a " + getColor() + ", " + shape + ", " + getMaterial() + " " + getType() + " for " + occasion +
                " occasions from " + getBrand() + ".";

    }
}
