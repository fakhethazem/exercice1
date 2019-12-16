package com.company;

public class deptinfo extends faculte {
    public deptinfo() {
    }

    @Override
    public void createfaculte() {
        listP.add(new Enseigant("jamel","glanza"));
        listP.add(new Etudiant(12,"sofien","trabelsi"));
        listP.add(new Etudiant(15,"bader","kouki"));
    }
}
