package edu.psu.ist.model;

public class Headwear extends Clothing {
    private boolean hasWinterProtection; //Checks if the items can be used during cold and snowy weather
    private boolean hasSunProtection; //Checks if the items can be used during sunny and hot weather

    public Headwear(String brand, String color, String material, String type, boolean hasWinterProtection, boolean hasSunProtection) {
        super(brand, color, material, type);
        this.hasWinterProtection = hasWinterProtection;
        this.hasSunProtection = hasSunProtection;
    }

    @Override
    public String careLabel() {
        StringBuilder label = new StringBuilder();
        label.append("Wash on gentle in cold water.\n")
                .append("Spot-treat any stained areas.\n")
                .append("Use all-purpose detergent.\n")
                .append("Air dry to maintain the item's shape.");
        return label.toString();
    }

    public boolean hasWinterProtection() {
        return hasWinterProtection;
    }

    public void setHasWinterProtection(boolean hasWinterProtection) {
        this.hasWinterProtection = hasWinterProtection;
    }

    public boolean hasSunProtection() {
        return hasSunProtection;
    }

    public void setHasSunProtection(boolean hasSunProtection) {
        this.hasSunProtection = hasSunProtection;
    }

    @Override
    public String toString() {
        String features = "";
        if (hasWinterProtection && hasSunProtection) {
            features = " that is suitable for cold and warm weather";
        } else if (hasWinterProtection) {
            features = " that is suitable for cold weather";
        } else if (hasSunProtection) {
            features = " that is suitable for cold weather";
        }
        return "a " + getColor() + ", " + getMaterial() +  " " + getType() +  " from " +
                getBrand() + features + ".";
    }
}
