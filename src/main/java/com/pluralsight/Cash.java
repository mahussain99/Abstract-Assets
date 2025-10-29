package com.pluralsight;

public class Cash extends Assets{
    private double profits;

    public Cash(String description, double originalCost, String dateAcquired, double profits) {
        super(description, dateAcquired, originalCost);
        this.profits = profits;
    }

    public double getProfits() {
        return profits;
    }

    public void setProfits(double profits) {
        this.profits = profits;
    }

    @Override
    public double getValue() {
       return getOriginalCost();
    }
}
