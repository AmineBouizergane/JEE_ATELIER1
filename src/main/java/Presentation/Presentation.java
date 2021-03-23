package Presentation;

import DAO.Dao;
import DAO.IDao;
import Metier.IMetier;
import Metier.Metier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(new File("C:\\Users\\lenovo\\IdeaProjects\\JEE_Atelier1\\src\\main\\resources\\config.txt"));
            Class clDao = Class.forName(s.nextLine());
            IDao dao = (IDao) clDao.newInstance();
            Class clMetier = Class.forName(s.nextLine());
            IMetier metier = (IMetier) clMetier.newInstance();

            Method method = clMetier.getMethod("setDao", IDao.class);
            method.invoke(metier, dao);

            System.out.println("Votre salaire net est "+metier.CalculeSalaireNet());

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}

