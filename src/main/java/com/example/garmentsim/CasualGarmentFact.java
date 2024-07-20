package com.example.csc325module_9.Factories;

import  com.example.csc325module_9.Categories.*;
import  com.example.csc325module_9.Types.Casual.*;

public class CasualGarmentFact implements GarmentSet {

    //Creates a method to return Tops, Pants, and Shoes that are related to Casual type
    @Override
    public Tops createTops() {
        return new CasualTops();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
