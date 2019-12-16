package com.company.design.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color col){
        super(col);
    }

    @Override
    public void applay() {
        System.out.println("la rectangle de couleur :");
        col.applycolor();
    }

}
