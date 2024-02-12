package edu.psu.ist.model;

public class Footwear extends Clothing{

    private int shoeHeight; //Describes the height of the shoe. This is meant to differentiate between different heels,
                            // platforms and boots.
    private boolean isWaterproof; //Checks if shoes can be worn during rainy weather;
    private String occasion; //Shoes have variety. Describes the occasion for accessories. e.g. sport, office,
    // everyday, formal etc.


    public Footwear (String brand, String color, String material, String type, int shoeHeight, boolean isWaterproof, String occasion){
        super(brand, color, material, type);
        this.shoeHeight = shoeHeight;
        this.isWaterproof = isWaterproof;
        this.occasion = occasion;
    }

    @Override
    public String careLabel() {
        return super.careLabel();
    }

    public int getShoeHeight() {
        return shoeHeight;
    }

    public void setShoeHeight(int shoeHeight) {
        this.shoeHeight = shoeHeight;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        String features = "";
        if (isWaterproof) {
            features = " that is waterproof";
        }
        return "a " + getColor() + ", " + getMaterial() +  " " + getType() + " with " + shoeHeight + " inch heels"
                + " for " + occasion +" occasions " + features + " from " + getBrand()+ ".";
    }
}
