package edu.psu.ist.model;

import java.util.ArrayList;
import java.util.HashMap;


public class Closet implements OutfitManager {
    private static ArrayList<Clothing> closetArrayList = new ArrayList<>();
    private int rating;

    @Override
    public void rateItem(int rating) {//a way to mass rate the clothes
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
            for (Clothing c :
                    closetArrayList) {
                c.rateItem(rating);
            }
        } else {
            System.err.println("Please give a valid rating (number between 1 to 5)");
        }
    }

    public String getRating() {
        try {
            StringBuilder ratingDesc = new StringBuilder();
            ratingDesc.append("Here is an overview of the items within the closet.\n");
            for (Clothing c :
                    closetArrayList) {
                ratingDesc.append(c.toString()).append(" has a rating of ").append(rating).append(" stars.\n");
            }
            return ratingDesc.toString();
        } catch (Exception e) {
            return "This " + this.getClass().getSimpleName() + " has not been given a rating";
        }

    }

    @Override
    public String getDetailedDescription() {
        StringBuilder description = new StringBuilder();
        description.append("A ")
                .append(this.getClass().getSimpleName())
                .append(" that holds ")
                .append(closetArrayList.size())
                .append(" clothes.\n");

        return description.toString();
    }

    public void save(Object o) {
        Clothing c = (Clothing) o;
        closetArrayList.add(c);
    }

    public void delete(Object o) {
        Clothing c = (Clothing) o;
        closetArrayList.remove(c);
    }

    public static ArrayList<Clothing> getClosetArrayList() {
        return closetArrayList;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
