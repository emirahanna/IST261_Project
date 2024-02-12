package edu.psu.ist.model;

public class Bottom extends Clothing {
    private String cutType; //Describes type of cutting. e.g.  straight, pleated, slim, bootcut, wide-leg etc.
    private boolean isCuffed; //Checks if the bottoms are cuffed or not
    private String bottomsFit; //Describes type of fit. e.g. tapered, loose, baggy, relaxed etc..

    public Bottom(String brand, String color, String material, String type, String cutType, boolean isCuffed, String bottomsFit) {
        super(brand, color, material, type);
        this.cutType = cutType;
        this.isCuffed = isCuffed;
        this.bottomsFit = bottomsFit;
    }

    @Override
    public String careLabel() {
        return super.careLabel();
    }

    public String getCutType() {
        return cutType;
    }

    public void setCutType(String cutType) {
        this.cutType = cutType;
    }

    public boolean isCuffed() {
        return isCuffed;
    }

    public void setCuffed(boolean cuffed) {
        isCuffed = cuffed;
    }

    public String getBottomsFit() {
        return bottomsFit;
    }

    public void setBottomsFit(String bottomsFit) {
        this.bottomsFit = bottomsFit;
    }

    @Override
    public String toString() {
        String cuffs = " that does not have cuffs";
        if(isCuffed){
            cuffs = " that has cuffs";
        }
        return "a " + getColor() + ", " + getMaterial() + ", " + cutType + " " + bottomsFit + " " + getType() +
                " from " + getBrand() + cuffs + ".";
    }
}
