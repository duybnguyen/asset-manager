package com.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        House house1 = new House("my house", "01/02/2024", 500000.00, "123 Street", 1, 20000, 1000);
        House house2 = new House("my house", "01/02/2024", 500000.00, "456 Street", 1, 20000, 1000);

        Vehicle car1 = new Vehicle("my car", "01/02/2024", 40000.00, "Test Model Y", 2025, 2000);
        Vehicle car2 = new Vehicle("my car", "01/02/2024", 40000.00, "Test Model 3", 2025, 2000);

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(house1);
        assets.add(house2);
        assets.add(car1);
        assets.add(car2);

        for (Asset a: assets) {
            System.out.println("Description: " + a.getDescription());
            System.out.println("Date Acquired: " + a.getDateAcquired());
            System.out.println("Original Cost: " + a.getOriginalCost());
            System.out.println("Asset Value: " + a.getValue());
        }
    }
}