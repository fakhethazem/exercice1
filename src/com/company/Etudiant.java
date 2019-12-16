package com.company;

public class Etudiant extends Person {
    public int matricule;
    public String nom;
    public String prenom;

    public Etudiant(int matricule,String nom,String prenom) {
        this.prenom=prenom;
        this.matricule = matricule;
       this.nom=nom;

    }
}
