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
        System.out.println("Volume of Cube is: "+side*side*side+" Cu. Unit");
    }

    @Override
    public void getCurvedSurfaceArea() {
        System.out.println("Curved Surface Area of cube is: "+4*side*side+" Sq. Unit");
    }

    @Override
    public void getTotalSurfaceArea() {
        System.out.println("Total Surface Area of cube is: "+6*side*side+" Sq. Unit");
    }
}
