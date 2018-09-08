package service;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import model.Person;

public class UserServiceIml implements UserService {

    private PersonDAO dao;

    public UserServiceIml(PersonDAO dao) {
        this.dao = dao;
    }

    @Override
    public Person getPersonById(int id) {
        return dao.getPersonById(id);
    }

    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAOImpl();
        UserServiceIml userServiceIml =
                new UserServiceIml(personDAO);

        System.out.println(userServiceIml.getPersonById(1));


    }
}
