package com.company;

public class Floor {
    private double width;
    private double length;

    public Floor() {
        this.width = 0;
        this.length = 0;
    }
    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
