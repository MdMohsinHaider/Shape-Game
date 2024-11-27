package com.jspider.shapeproject;

public class Cube implements ThreeDShape{
    double side;

    public Cube() {
        //
    }

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public void getVolume() {
        System.out.println(" get Volume");
    }

    @Override
    public void getCurvedSurfaceArea() {
        System.out.println(" getCurvedSurfaceArea");
    }

    @Override
    public void getTotalSurfaceArea() {

    }
}
