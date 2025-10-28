package com.pluralsight;

public class House extends Asset {
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double houseValue = this.squareFoot;
        switch (condition) {
            case 1:
                houseValue *= 180;
                break;
            case 2:
                houseValue += 130;
                break;
            case 3:
                houseValue += 90;
                break;
            case 4:
                houseValue += 80;
                break;
        }

        return houseValue + (this.lotSize * .25);
    }
















































    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }
}
