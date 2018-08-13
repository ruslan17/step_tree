package dao;

import model.Person;

public interface PersonDAO {
    /**
     * Метод возвращающий человека по его id.
     */
    Person getPersonById(int id);
}