package com.company;

import com.company.design.bridge.*;
import composite.Employee;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Collection {

    public static void main(String[] args) {
//        Ustensile[] us = new Ustensile[5];
//        us[0] = new AssietteRonde(1926, 8.4);
//        us[1] = new Cuillere(1881, 7.3);
//        us[2] = new AssietteCarree(1935, 5.6);
//        us[3] = new Cuillere(1917, 8.8);
//        us[4] = new AssietteRonde(1837, 5.4);
//        ArrayList<Integer> L = new ArrayList<>();
//        L.add(4);
//        L.add(7);
//        L.add(8);
//        L.add(6);
//        L.add(10);
//        L.add(412);
//        int x = L.stream().max(Integer::compare).get();
//        int y = L.stream().min(Integer::compare).get();
//        ArrayList<Integer> e = (ArrayList<Integer>) L.stream().filter(z -> z < x).filter(z -> y < z).collect(Collectors.toList());
//        System.out.println(e);
//        afficherCuilleres(us);
//        afficherSurfaceAssiettes(us);
//        afficherValeurTotale(us);
//    }
//
//    static void afficherCuilleres(Ustensile[] us) {
//        int nbCuilleres = 0;
//        for (int i = 0; i < us.length; i++) {
//            if (us[i] instanceof Cuillere) {
//                nbCuilleres++;
//            }
//        }
//        System.out.println("Il y a " + nbCuilleres + " cuillères.");
//    }
//
//    static void afficherSurfaceAssiettes(Ustensile[] us) {
//        double somme = 0;
//        for (int i = 0; i < us.length; i++) {
//            if (us[i] instanceof AssietteCarree) {
//                AssietteCarree C = (AssietteCarree) us[i];
//                double x = C.calculsurface();
//                somme = somme + x;
//            }
//            if (us[i] instanceof AssietteRonde) {
//                AssietteRonde k = (AssietteRonde) us[i];
//                double z = k.calculsurface();
//                somme = somme + z;
//            }
//
//        }
//        System.out.println("Surface totale des assiettes : " + somme);
//    }
//
//    static void afficherValeurTotale(Ustensile[] us) {
//        double somme = 0;
//        for (int i = 0; i < us.length; i++) {
//            if (us[i] instanceof AssietteRonde) {
//                AssietteRonde g = (AssietteRonde) us[i];
//                int z = g.valeurtotal();
//                somme += z;
//
//            } else if (us[i] instanceof Cuillere) {
//                Cuillere d = (Cuillere) us[i];
//                int y = d.valeurtotal();
//                somme += y;
//            } else {
//                AssietteCarree e = (AssietteCarree) us[i];
//                int x = e.valeurtotal();
//                somme += x;
//            }
//
//        }
//        System.out.println("Valeur totale de la collection : " + somme);
//    }

        faculte fac = facultefactory.getfaculte("deptinfo");

        System.out.println(fac.getListP());
PersonFacade p=PersonFacade.getInstance();
        System.out.println(p);
        faculte facc = facultefactory.getfaculte("deptchimie");

        System.out.println(facc.getListP());
        Person per =new Person.BuildPerson().withcin(5).withnom("wael").withprenom("jalouz").builder();
        System.out.println(per);
        Shape SH=new Circle(new RedColor());
        SH.applay();
        Shape SF=new Rectangle(new GreenColor());
        SF.applay();

        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }

}

