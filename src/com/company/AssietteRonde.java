package com.company;

public class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annfabri, double rayon) {
        super(annfabri);
        this.rayon = rayon;
    }

    @Override
    public double calculsurface() {
        return  3.14 * rayon * rayon;
    }

    @Override
    public int valeurtotal() {
        int f=0;
        if(2019-this.annfabri<50)
        {return f;  }
        else{
            f=2019-this.annfabri-50;
            return f;
        }

    }
    }

