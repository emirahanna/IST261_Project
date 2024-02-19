package edu.psu.ist.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class OutfitCatalog {

    private static ArrayList<LinkedList> catalogArrayList = new ArrayList<>();
    private HashMap<LinkedList<Clothing>, Integer> ratingMap = new HashMap<LinkedList<Clothing>, Integer>();

    /**
     * @param rating
     * @return
     */
    public void rateItem(int rating){

    }

    /**
     * @param item
     * @return
     */

    public ArrayList<Clothing>  getSimilarItems(Clothing item) {
        return null;
    }

    public void save(LinkedList<Clothing> outfit) {
        catalogArrayList.add(outfit);

    }
    public void delete(LinkedList<Clothing> outfit) {
        catalogArrayList.remove(outfit);
    }

    public static ArrayList<LinkedList> getCatalogArrayList() {
        return catalogArrayList;
    }


}
