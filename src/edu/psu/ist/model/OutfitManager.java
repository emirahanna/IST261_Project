package edu.psu.ist.model;

import java.util.ArrayList;

public interface OutfitManager {
    public abstract void rateItem(int rating);

    public abstract String getDetailedDescription();

    public abstract String getRating();

    /*
    Ideas that didn't make the cut
        public abstract boolean isAvailable();
        public abstract int checkInventory();
        public abstract Object giveClothingRecommendation(String type);
     */
}
