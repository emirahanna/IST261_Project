package edu.psu.ist.controller;

import edu.psu.ist.model.*;
import edu.psu.ist.view.PocketClosetView;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class PocketClosetController implements ActionListener {
    private PocketClosetView view;
    private static int currIndex;
    ArrayList<Clothing> clothingArrayList;

    public PocketClosetController() {
        //instantiate the view class
        this.view = new PocketClosetView();
        //creates ArrayList to put model objects
        clothingArrayList = new ArrayList<>();
        currIndex = 0;
        addActionListener();
        createData();
        updateData();
    }

    /**
     * Instantiate model objects
     */
    public void createData() {
        Top top = new Top("H&M", "black", "cotton", "blouse", "round", "short", "loose");
        Bottom bottom = new Bottom("LEVI", "navy", "denim", "jeans", "straight", false, "tapered");
        Outerwear outerwear = new Outerwear("Aritzia", "white", "polyester", "coat", true, true, "zippers");
        Headwear headwear = new Headwear("Hegira", "cream", "wool", "beanie", true, true);
        Footwear footwear = new Footwear("Crocs", "lime green", "rubber", "crocs", 1, true, "everyday");
        Accessory accessories = new Accessory("Pandora", "black", "steel", "earrings", "square", "formal");
        //adds model objects to Arraylist
        Collections.addAll(clothingArrayList, top, bottom, outerwear, headwear, footwear, accessories);
        view.getClosetDisplay().getPrevButton().setEnabled(false);
    }

    /**
     * putting information from the first object in the list into the view class
     */
    public void updateData() {
        //Use the class name as a placeholder before the user can save the outfit with a name they choose
        view.getClosetDisplay().getClothingName().setText(getClothing(currIndex).getClass().getSimpleName());
        view.getClosetDisplay().getClothingDesc().setText(getClothing(currIndex).toString());
    }

    /**
     * Hooks action listeners to all the buttons in the view
     */
    public void addActionListener() {
        view.getClosetDisplay().getPrevButton().addActionListener(this);
        view.getClosetDisplay().getNextButton().addActionListener(this);
    }

    /**
     * Calls relevant method, depending on the action event (the button that was pressed)
     *
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        if (src.equals(view.getClosetDisplay().getPrevButton())) {
                goToPreviousIndex();
        } else if (src.equals(view.getClosetDisplay().getNextButton())) {
                goToNextIndex();
        }
    }

    public void goToPreviousIndex() {
        //if currIndex is 0, then disable the button.
        if (currIndex <= 1){
            view.getClosetDisplay().getPrevButton().setEnabled(false);
        }
        else {
            //Enable the next button if the previous button is pressed
            view.getClosetDisplay().getNextButton().setEnabled(true);
            currIndex--;
            updateData();
        }
    }

    public void goToNextIndex(){
        //if currIndex is the last index of the arraylist, then disable the button.
        if (currIndex == clothingArrayList.size() - 1){
            view.getClosetDisplay().getNextButton().setEnabled(false);
        }
        else {
            //Enable the prev button if the previous button is pressed
            view.getClosetDisplay().getPrevButton().setEnabled(true);
            currIndex++;
            updateData();
        }
    }

    public Clothing getClothing(int index) {
        return clothingArrayList.get(index);
    }


    public void createClothing() {
        //check if empty or not
        //check for null or empty before we go into something
        //DISPLAY FEEDBACK Maybe display Hey that worked! Or maybe clear the text boxes
        //Clothing
        //BUttom that clears the values???
        //JOPtion Pane.showMessage
    }


}
