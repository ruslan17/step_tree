package dao;

import db.MockDB;
import model.Person;

public class PersonDAOImpl implements PersonDAO {

    @Override
    public Person getPersonById(int id) {

        for (Person person : MockDB.persons) {
            if (person.getId() == id) {
                return person;
            }
        }

        return null;
    }
}
