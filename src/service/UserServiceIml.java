package service;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import model.Person;

public class UserServiceIml implements UserService {

    private PersonDAO dao = new PersonDAOImpl();

    @Override
    public Person getPersonById(int id) {
        return dao.getPersonById(id);
    }
}
