package com.company;

public class Cuillere extends Ustensile {
    private double longeur;

    public Cuillere(int annfabri, double longeur) {
        super(annfabri);
        this.longeur = longeur;
    }

    @Override
    public int valeurtotal() {
        int f = 0;
        if (2019 - this.annfabri < 50) {
            return f;
        } else {
            f = 2019 - this.annfabri - 50;
            return f;
        }

    }
}
