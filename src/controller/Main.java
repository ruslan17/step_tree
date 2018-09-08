package controller;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import model.Person;
import service.UserService;
import service.UserServiceIml;

import java.util.Scanner;

public class Main {

    private UserService service;

    public Main(UserService service) {
        this.service = service;
    }

    public static void main(String[] args) {

        PersonDAO dao = new PersonDAOImpl();
        UserService service1 = new UserServiceIml(dao);
        Main main = new Main(service1);
        main.menu();

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите id человека: ");
        int id = scanner.nextInt();

        Person person = service.getPersonById(id);

        System.out.println(person);
    }


}
