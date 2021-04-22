/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahul.jaiman
 * @version $Id: Meal.java, v 0.1 2020-05-23 03:38 rahul.jaiman Exp $$
 */
public class Meal {
    List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }


    public float getCost() {
        float totalCost = 0.0f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }


    public void showItems() {
        for (Item item : items) {
            System.out.println("Name: " + item.name());
            System.out.println("Price: " + item.price());
            System.out.println("Packing: " + item.packing().pack());
        }
    }
}