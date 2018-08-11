package controller;

import model.Person;
import service.UserService;
import service.UserServiceIml;

import java.util.Scanner;

public class Main {

    private UserService service = new UserServiceIml();

    public static void main(String[] args) {
        Main main = new Main();
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
