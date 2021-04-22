/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: MealBuilder.java, v 0.1 2020-05-23 03:43 rahul.jaiman Exp $$
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        return m;

    }

    public Meal prepareNonvegMeal(){
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Pepsi());
        return m;

    }
}