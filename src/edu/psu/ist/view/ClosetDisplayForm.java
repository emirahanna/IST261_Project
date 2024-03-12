package edu.psu.ist.view;

import javax.swing.*;

public class ClosetDisplayForm {
    private JPanel mainPanel;
    private JLabel clothingLabel;
    private JLabel descLabel;
    private JLabel clothingDesc;
    private JTextField clothingName;
    private JButton nextButton;
    private JButton prevButton;
    private JButton homeButton;
    private JButton closeButton;
    private JLabel clothingType;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JLabel getClothingLabel() {
        return clothingLabel;
    }

    public JLabel getClothingDesc() {
        return clothingDesc;
    }

    public JLabel getClothingType() {
        return clothingType;
    }

    public JLabel getDescLabel() {
        return descLabel;
    }

    public JTextField getClothingName() {
        return clothingName;
    }

    public JButton getNextButton() {
        return nextButton;
    }

    public JButton getPrevButton() {
        return prevButton;
    }

    public JButton getHomeButton(){ return homeButton;}

    public JButton getCloseButton(){return closeButton;}

}


