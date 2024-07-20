package com.example.csc325module_9.Factories;

import com.example.csc325module_9.Categories.*;
import com.example.csc325module_9.Types.Professional.*;

public class ProfessionalGarmentFact implements GarmentSet {

    //Creates a method to return Tops, Pants, and Shoes that are related to Professional type

    @Override
    public Tops createTops() {
        return new ProfessionalTops();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
