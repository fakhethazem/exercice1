package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonFacade {
    private static final PersonFacade perfac=new PersonFacade();


    private PersonFacade() {
    }
    public static PersonFacade getInstance()
    {
        return perfac;
    }

}
