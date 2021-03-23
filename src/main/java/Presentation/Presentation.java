package Presentation;

import DAO.Dao;
import DAO.IDao;
import Metier.IMetier;
import Metier.Metier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext("DAO","Metier");
        //ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=ctx.getBean(IMetier.class);
        System.out.println("Votre salaire : " + metier.CalculeSalaireNet());
    }
}

