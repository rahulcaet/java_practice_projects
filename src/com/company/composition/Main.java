package com.company.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "220V", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                                      27, new Resolution(2540, 144011));

        Motherboard theMotherboard = new Motherboard("83-200", "Intel", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(0,0, "green");
//
//        thePC.getMotherboard().loadProgram("Ramayan");
//
//        thePC.getTheCase().pressPowerButton();

          thePC.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "green");

        Bed bed = new Bed("Modern", 4,3,2, 1);

        Lamp lamp  = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tim", wall1, wall2, wall3,
                                       wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
