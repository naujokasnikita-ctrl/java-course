package com.bootcampexcercise.module10.activity5;
import java.util.HashMap;

public class ElectronicItemDetails {
    // return price method
    public double returnPriceOfItem(HashMap<String, Double> map, String name) {
        return map.get(name);
    }
    public static void main(String[] args) {
        ElectronicItemDetails details = new ElectronicItemDetails();

        HashMap<String, Double> itemHashMap = new HashMap<>();

        itemHashMap.put("TV", 450.00);
        itemHashMap.put("Dishwasher", 800.50);
        itemHashMap.put("refrigerator", 500.25);
        itemHashMap.put("Pc", 1200.99);

        double tvPrice = details.returnPriceOfItem(itemHashMap, "TV");
        System.out.println("Price of TV is " + tvPrice);
    }
}


