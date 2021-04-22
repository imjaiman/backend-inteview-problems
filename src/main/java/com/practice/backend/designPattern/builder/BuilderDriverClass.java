/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.builder;

/**
 * @author rahul.jaiman
 *
 * Builder Design Pattern - It is used to create a complex object from simple ones step by step.
 *
 */
public class BuilderDriverClass {

    public static void main(String args[]) {
        MealBuilder mealBuilder = new MealBuilder();
        System.out.println("-----Veg Meal Order------");

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

        System.out.println("----Non Veg Meal Order---------");
        Meal nonVegMeal = mealBuilder.prepareNonvegMeal();
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());

    }
}