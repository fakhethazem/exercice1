package com.company;

public abstract class Assiette extends Ustensile {
    public abstract double calculsurface();

    public abstract int valeurtotal();

    public Assiette(int annfabri) {
        super(annfabri);
    }
}
