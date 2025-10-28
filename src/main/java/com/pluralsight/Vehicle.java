package com.pluralsight;

public class Vehicle extends Asset {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double depreciatedTotal = this.getOriginalCost();
        if (year > 10) {
            depreciatedTotal = 1000;
        }
        else if (this.year > 6) {
            depreciatedTotal -= (.08 * this.year);
        } else if (this.year > 3) {
            depreciatedTotal -= (.06 * this.year);
        } else {
            depreciatedTotal -= (.03 * this.year);
        }

        return this.odometer > 100000 && (!this.makeModel.contains("Honda") || !this.makeModel.contains("Toyota"))
                ? depreciatedTotal *= .25
                : depreciatedTotal;

    }





























}
