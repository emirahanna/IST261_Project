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
        StringBuilder label = new StringBuilder();
        label.append(super.careLabel());
        if (getMaterial().contains("denim") || getType().contains("jeans")){
            label.append("Wash item in small loads to reduce fabric abrasion.\n")
                    .append("Stretch the legs to prevent shrinkage.\n")
                    .append("Hold them by the waistband and legs and gently stretch them vertically before drying.\n")
                    .append("Dry on low or medium heat.\n")
                    .append("Overdrying causes unnecessary wear and tear, so take jeans out when the legs are done but the seams and the waistband are slightly damp.");
        } else if (getMaterial().contains("wool") || getMaterial().contains("cashmere") || getMaterial().contains("silk") ) {
            label.append("Wash item on gentle setting.\n")
                    .append("Put items into a mesh laundry bag or zippered pillowcase.\n")
                    .append("Lay flat to dry. You may need to reshape the item after washing.");
        }
        return label.toString();
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
