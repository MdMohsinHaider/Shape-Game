package com.jspider.shapeproject;

import java.util.Scanner;

public class Game {

    Game(){
        System.out.println("====Game Has Started====");
    }

    public int selectShape(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for 2DShape");
        System.out.println("Press 2 for 3DShape");
        int choice=sc.nextInt();
        if(choice==1)
            return 1;
        else if(choice==2)
            return 2;
        else {
            System.out.println("Invalid Choice!");
            return selectShape();
        }
    }
}
