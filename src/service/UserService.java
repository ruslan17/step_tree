package service;

import model.Person;

public interface UserService {

    /**
     * Метод возвращающий человека по его id.
     */
    Person getPersonById(int id);

}
