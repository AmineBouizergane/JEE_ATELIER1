package Metier;

import DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Metier implements  IMetier{

    @Autowired
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public int CalculeSalaireNet() {
        return (int)((dao.getSalaire()*0.2) + dao.getSalaire());
    }
}
