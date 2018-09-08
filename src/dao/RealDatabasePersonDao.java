package dao;

import model.Person;

public class RealDatabasePersonDao implements PersonDAO {
    @Override
    public Person getPersonById(int id) {
        String sql = "SELECT * FROM PERSONS " +
                "WHERE ID = " + id;


        return null;
    }
}
