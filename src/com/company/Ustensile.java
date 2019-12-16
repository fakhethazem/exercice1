package com.company;

public abstract class Ustensile {

    protected int annfabri;

    public Ustensile(int annfabri) {
        this.annfabri = annfabri;
    }

    public abstract int valeurtotal();
}
