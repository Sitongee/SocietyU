package com.societyu.societyu;

/**
 * Created by Stella on 18/7/30.
 */

public class Item {
    /**
     * All data for a event.
     */
    private String title;
    private String address;
    private String description;

    /**
     * Constructor
     */
    public Item(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    /**
     * Getters for private attributes of Event class.
     */
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }
    public String getDescription() { return this.description; }
}

