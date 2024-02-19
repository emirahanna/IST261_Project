package edu.psu.ist.model;

public class Outerwear extends Clothing {

    private boolean isWaterproof; //Checks if garment can be worn during rainy weather
    private boolean hasHood; // Checks if garment has functional hood or not
    private String fasteningType; //Describes type of fastening. e.g. zips, buttons, clasps, velcro, hook and eye, etc..

    public Outerwear(String brand, String color, String material, String type, boolean isWaterproof, boolean hasHood,
                     String fasteningType) {
        super(brand, color, material, type);
        this.isWaterproof = isWaterproof;
        this.hasHood = hasHood;
        this.fasteningType = fasteningType;
    }

    @Override
    public String careLabel() {
        StringBuilder label = new StringBuilder();
        //make additions based on the fields exclusive to this class
        if (!isWaterproof ){
            return label.append(super.careLabel())
                    .append("Tumble dry on low with a few clean, dry towels to soak extra moisture and speed up drying.\n").toString();
        }

        //Adds these care labels for waterproof clothing
        label.append("Turn clothing inside out.\n")
                .append("Fasten any zips or buttons or ties, if any.\n")
                .append("If using top-load washing machine, wrap a towel over the agitator and secure with rubber bands.\n")
                .append("Wash in cold water and use a delicate cycle.\n")
                .append("Preferably, hand wash these garments.");

        return label.toString();
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }

    public boolean hasHood() {
        return hasHood;
    }

    public void setHood(boolean hasHood) {
        this.hasHood = hasHood;
    }

    public String getFasteningType() {
        return fasteningType;
    }

    public void setFasteningType(String fasteningType) {
        this.fasteningType = fasteningType;
    }

    @Override
    public String toString() {
        String features = "";
        if (isWaterproof && hasHood) {
            features = " that is waterproof and has a hood";
        } else if (isWaterproof) {
            features = " that is waterproof";
        } else if (hasHood) {
            features = " that has a hood";
        }
        return "a " + getColor() + ", " + getMaterial() +  " " + getType() + " with " + fasteningType +  " from " +
                getBrand() + features + ".";
    }
}
