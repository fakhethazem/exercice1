package com.company;

public class  Person  {
    private int cin;
    private String nom;
    private String prenom;

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static class BuildPerson {
        private int cin;
        private String nom;
        private String prenom;

        public BuildPerson() {
        }

        public BuildPerson withcin(int cin) {
            this.cin = cin;
            return this;
        }

        public BuildPerson withnom(String nom) {
            this.nom = nom;
            return this;
        }

        public BuildPerson withprenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public Person builder() {
            Person p = new Person();
            p.cin = this.cin;
            p.nom = this.nom;
            p.prenom = this.prenom;
            return p;
        }


    }
}