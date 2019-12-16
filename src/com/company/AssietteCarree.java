package com.company;

public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annfabri, double cote) {
        super(annfabri);
        this.cote = cote;
    }

    @Override
    public double calculsurface() {
        return cote * cote;
    }

    @Override
    public int valeurtotal() {
        int f = 0;
        if (2019 - this.annfabri < 50) {
            return f;
        } else {
            f = 2019 - this.annfabri - 50;
            return f * 5;
        }

    }
}
