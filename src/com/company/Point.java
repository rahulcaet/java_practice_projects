package com.company;

import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow( (this.x - 0), 2) + Math.pow(this.y - 0 , 2));
    }

    public double distance(double x1, double y1) {
        return Math.sqrt(Math.pow( (this.x - x1), 2) + Math.pow(this.y - y1 , 2));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow( (this.x - p.getX()), 2) + Math.pow(this.y - p.getY() , 2));
    }
}
