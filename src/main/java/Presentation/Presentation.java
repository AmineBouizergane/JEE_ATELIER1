package Presentation;

import DAO.Dao;
import DAO.IDao;
import Metier.IMetier;
import Metier.Metier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("configb.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println("Votre salaire net est "+metier.CalculeSalaireNet());
    }
}

