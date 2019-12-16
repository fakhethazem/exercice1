package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class faculte {
    protected List<Person> listP = new ArrayList();

    public List<Person> getListP() {
        return listP;
    }
    public faculte(){
        this.createfaculte();
    }
    public abstract void createfaculte();
}