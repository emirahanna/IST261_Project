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
        StringBuilder label = new StringBuilder();
        if(getMaterial().equalsIgnoreCase("canvas") || getMaterial().equalsIgnoreCase("leather")){
            label.append("Wash in cold water with all-purpose detergent.\n")
                    .append("Place them in mesh bags to keep laces from wrapping around the agitator.\n")
                    .append("Dry on low for 10 minutes, then air-dry for a day.");
        } else if (isWaterproof || getMaterial().equalsIgnoreCase("rubber") || getMaterial().equalsIgnoreCase("pvc") ) {
            label.append("Brush of any dirt or mud.\n")
                    .append("Wash with gentle non-detergent soap, and warm water.\n")
                    .append("Make sure to brush the crevices and rinse the sop thoroughly.\n")
                    .append("Let them air-dry in a cool, ventilated area.\n")
                    .append("Avoid using direct heat, such as a hair or clothes dryer, as this can cause the material to shrink or weaken.");
        }
        else{
            label.append("Wipe any dust or stains with a clean cloth.\n")
                    .append("Place them in a closed mesh bag with the laces and insoles removed.\n")
                    .append("Wash your shoes in a gentle, cold water cycle with a slow or no-spin setting.");
        }
        return label.toString();
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
