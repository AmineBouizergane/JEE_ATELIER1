package DAO;

import org.springframework.stereotype.Component;

@Component
public class Dao implements  IDao{

    @Override
    public int getSalaire() {
        return 50000;
    }
}
