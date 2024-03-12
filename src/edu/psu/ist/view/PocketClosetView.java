package edu.psu.ist.view;

import javax.swing.*;
import java.awt.*;

public class PocketClosetView extends JFrame {
    private CardLayout crd;
    private Container container;
    private ClosetDisplayForm closetDisplay;
    private TopCreatorView topCreator;
    private BottomCreatorForm bottomCreator;
    private HomePageView homePage;

    public PocketClosetView() {
        //Create all display panels
        this.homePage = new HomePageView();
        this.closetDisplay = new ClosetDisplayForm();
        this.topCreator = new TopCreatorView();
        this.bottomCreator = new BottomCreatorForm();
        this.container = getContentPane();
        this.crd = new CardLayout();
        addContentToContainer();
        createComponents();
    }

    private void addContentToContainer() {

        container.add("home-page", homePage.getMainPanel());
        container.add("closet-display", closetDisplay.getMainPanel());
        container.add("top-creator", topCreator.getMainPanel());
        container.add("bottom-creator", bottomCreator.getMainPanel());
        container.setLayout(crd);
    }

    private void createComponents() {
        JPanel frameContents = closetDisplay.getMainPanel();
        this.setContentPane(frameContents);
        this.pack();
        //names the text at the top of the window
        this.setTitle("PocketCloset - Your Closet in Your Phone");
        //sets the window to open with this resolution
        this.setSize(600, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void show(String name) {
        crd.show(container, name);
    }

    public CardLayout getCrd() {
        return crd;
    }

    public Container getContainer() {
        return container;
    }

    public ClosetDisplayForm getClosetDisplay() {
        return closetDisplay;
    }

    public TopCreatorView getTopCreator() {
        return topCreator;
    }

    public BottomCreatorForm getBottomCreator() {
        return bottomCreator;
    }

    public HomePageView getHomePage() {
        return homePage;
    }


}