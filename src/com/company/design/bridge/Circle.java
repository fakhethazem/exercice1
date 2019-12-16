package com.company.design.bridge;

public class Circle extends Shape {
    public Circle(Color col) {
        super(col);
    }

    @Override
    public void applay() {
        System.out.println("la cercle de couleur :");
        col.applycolor();
    }
}
