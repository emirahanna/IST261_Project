package edu.psu.ist.model;

public class Top extends Clothing {

    private String neckline; //Describes type of neckline. e.g. round neckline, heart neckline, square neckline etc.
    private String sleeveType; //Describes type of sleeve. e.g. bell sleeves, 3/4 sleeves, long sleeves, etc.

    private String outfitSilhouette; //Describes outfit's fit/silhouette, e.g. is tight, fitted, relaxed or loose etc.

    public Top(String brand, String color, String material, String type, String neckline, String sleeveType, String outfitSillhouette) {
        super(brand, color, material, type);
        try {
            this.neckline = neckline;
            this.sleeveType = sleeveType;
            this.outfitSilhouette = outfitSillhouette;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String careLabel() {
        return super.careLabel();
    }

    public String getNeckline() {
        return neckline;
    }

    public void setNeckline(String neckline) {
        this.neckline = neckline;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    public String getOutfitSilhouette() {
        return outfitSilhouette;
    }

    public void setOutfitSilhouette(String outfitSilhouette) {
        this.outfitSilhouette = outfitSilhouette;
    }

    @Override
    public String toString() {
        return "a " + getColor() + ", " + getMaterial() + ", " + outfitSilhouette +" " + getType() + " with " +
                sleeveType+ " sleeves and a " + neckline +  " neckline from " + getBrand() + ".";
    }
}
