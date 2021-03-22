package Metier;

import DAO.IDao;

public class Metier implements  IMetier{

    IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public int CalculeSalaireNet() {
        return (int)((dao.getSalaire()*0.2) + dao.getSalaire());
    }
}
