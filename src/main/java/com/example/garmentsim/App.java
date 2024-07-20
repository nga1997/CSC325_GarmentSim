package com.example.csc325module_9;

import com.example.csc325module_9.Categories.*;

    public class App {
        private com.example.csc325module_9.Categories.Pants pants;
        private com.example.csc325module_9.Categories.Tops tops;
        private com.example.csc325module_9.Categories.Shoes shoes;

        public App(com.example.csc325module_9.Factories.GarmentSet factory) {
            pants = factory.createPants();
            tops = factory.createTops();
            shoes = factory.createShoes();
        }


        public void reveal() {
            tops.getTopsStyle();
            pants.getPantsStyle();
            shoes.getShoesStyle();
        }

        public void run() {
            reveal();
        }
    }
