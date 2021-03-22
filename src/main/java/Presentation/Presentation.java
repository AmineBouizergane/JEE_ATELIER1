package Presentation;

import DAO.Dao;
import Metier.IMetier;
import Metier.Metier;

public class Presentation {
    public static void main(String[] args) {
        Dao dao=new Dao();
        Metier metier=new Metier();
        metier.setDao(dao);
        System.out.println("Votre salaire net est "+metier.CalculeSalaireNet());
    }
}

