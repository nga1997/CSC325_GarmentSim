package com.example.csc325module_9;


import com.example.csc325module_9.Factories.*;

public class GarmentSim {

    public static void main(String[] args) {


    GarmentSet professionalFact = new ProfessionalGarmentFact();

    GarmentSet casualFact = new CasualGarmentFact();

    GarmentSet partyFact = new PartyGarmentFact();


    App professionalApp = new App(professionalFact);

    App casualApp = new App(casualFact);

    App partyApp = new App(partyFact);

    //Method to output the garments

    System.out.println("Professional Garments:");
    professionalApp.reveal();

    System.out.println("\nCasual Garments:");
    casualApp.reveal();

    System.out.println("\nParty Garments:");
    partyApp.reveal();
    }
}