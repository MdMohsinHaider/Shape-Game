package com.jspider.shapeproject;

public class Circle implements TwoDShape{
    double r;
    Circle(){
        ///
    }

    Circle(double r){
        if (r>0){
            System.out.println("Valid Radius");
            this.r=r;
        }else {
            System.out.println("Invalid Radius Entered");
        }
    }


    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }
}
