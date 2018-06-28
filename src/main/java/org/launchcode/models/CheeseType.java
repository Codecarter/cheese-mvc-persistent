package org.launchcode.models;

/**
 * Congratulations again to our great Professor Doug - Pearl will be your jewel forever
 */
public enum CheeseType {

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake");
    private final String name;
    CheeseType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
