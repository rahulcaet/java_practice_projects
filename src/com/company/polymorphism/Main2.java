package com.company.polymorphism;


class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Starting the engine...");
    }

    public void accelerate() {
        System.out.println("Accelerating the engine...");
    }

    public void brake() {
        System.out.println("Breaking the engine...");
    }
}

class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine() {
        System.out.println("Starting the engine for Audi...");
    }

    public void accelerate() {
        System.out.println("Accelerating the engine for Audi...");
    }

    public void brake() {
        System.out.println("Breaking the engine for Audi...");
    }
}

class BMW extends Car {
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine() {
        System.out.println("Starting the engine for  " + getClass().getSimpleName() + "...");
    }

    public void accelerate() {
        System.out.println("Accelerating the engine for  " + getClass().getSimpleName() + "...");
    }

    public void brake() {
        System.out.println("Breaking the engine for  " + getClass().getSimpleName() + "...");
    }
}

class Hyundai extends Car {
    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine() {
        System.out.println("Starting the engine for  " + getClass().getSimpleName() + "...");
    }

    public void accelerate() {
        System.out.println("Accelerating the engine for " + getClass().getSimpleName() + "...");
    }

    public void brake() {
        System.out.println("Breaking the engine for  " + getClass().getSimpleName() + "...");
    }
}

class Tata extends Car {
    public Tata(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine() {
        System.out.println("Starting the engine for " + getClass().getSimpleName() + "...");
    }

    public void accelerate() {
        System.out.println("Accelerating the engine for " + getClass().getSimpleName() + "...");
    }

    public void brake() {
        System.out.println("Breaking the engine for  " + getClass().getSimpleName() + "...");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Car car = new BMW("BMW", 4);
        car.accelerate();
        car.startEngine();
        car.brake();

        System.out.println("**************************************");
        car = new Hyundai( "Hyundai", 2);
        car.accelerate();
        car.startEngine();
        car.brake();

        System.out.println("**************************************");
        car = new Audi( "Audi", 2);
        car.accelerate();
        car.startEngine();
        car.brake();

        System.out.println("**************************************");
        car = new Tata(  "Tata", 2);
        car.accelerate();
        car.startEngine();
        car.brake();

        System.out.println("**************************************");
        car = new Car("Maruti", 1) {
            public void startEngine() {
                System.out.println("Starting the engine for " + getClass().getSimpleName() + "...");
            }

            public void accelerate() {
                System.out.println("Accelerating the engine for " + getClass().getSimpleName() + "...");
            }

            public void brake() {
                System.out.println("Breaking the engine for " + getClass().getSimpleName() + "...");
            }
        };
        car.accelerate();
        car.startEngine();
        car.brake();

    }


}
