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
        StringBuilder label = new StringBuilder();
        //checks if the accessory is jewelery
        if (getType().equalsIgnoreCase("earrings") || getType().equalsIgnoreCase("necklace")
                || getType().equalsIgnoreCase("ring") || getType().equalsIgnoreCase("bracelet")) {
            label.append("Wash your accessories using baby shampoo.\n")
                    .append("Gently brush off the dirt by using a soft-bristled toothbrush.\n")
                    .append("Rinse it with cold water.\n")
                    .append("Use a microfiber cloth when drying them.");
        } else{
            label.append("Wash on gentle in cold water.\n")
                    .append("Spot-treat any stained areas.\n")
                    .append("Use all-purpose detergent.\n")
                    .append("Air dry to maintain the item's shape.");
        }
        return label.toString();
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
