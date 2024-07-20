package com.example.csc325module_9.Factories;

import com.example.csc325module_9.Categories.*;
import com.example.csc325module_9.Types.Party.*;

public class PartyGarmentFact implements GarmentSet {

    //Creates a method to return Tops, Pants, and Shoes that are related to Party type
    @Override
    public Tops createTops() {
        return new PartyTops();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
