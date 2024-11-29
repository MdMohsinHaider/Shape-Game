package com.jspider.shapeproject;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Game g=new Game();
        char c;
        do {
            int choice=g.selectShape();
            if(choice==1) {
                System.out.println("You have Selected 2D Shape");
                TwoDShape td=g.selectTwoDShape();
                td.getArea();
                td.getPerimeter();
            }
            else{
                System.out.println("You have Selected 3D Shape");
                ThreeDShape td=g.selectThreeDShape();
                td.getVolume();
                td.getCurvedSurfaceArea();
                td.getTotalSurfaceArea();
            }
            System.out.println("Press Y/y to restart....");
            c=sc.next().charAt(0);
        }while(c=='Y' || c=='y');
        System.out.println("====Thank you for playing game====");

    }
}

    /*
    *
    * What is the difference between encapsulation And Abstract Class?
    *
    * Encapsulation is a mechanism providing Security.
    * However,
    * encapsulation is achieved by making data private
    *  by providing public type getter and setter,
    * but abstraction is achieved by using abstract
    * class or interface where we design abstract meths
    * to show functionality but hide inter-details
    *
    *
    *
    * */
