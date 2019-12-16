package com.company.design.bridge;

public abstract class Shape {
    protected Color col;
    public Shape( Color col){
        this.col=col;
    }
    public abstract void applay();
}
