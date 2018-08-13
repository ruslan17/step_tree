package controller;

import dao.PersonDAOImpl;
import model.Person;
import service.UserService;
import service.UserServiceIml;

import java.util.Scanner;

/**
 * Класс для взаимодействия с пользователем.
 * Если функционал будет разрастаться, можно перенести его в отдельные котроллеры разделив по функционалу.
 */
public class BaseController {

    private UserService service;

    /**
     *  Не инициализируем интерфейс UserService явно, даём возможность сделать это вызывающим классам.
     *  Таким образом добиваемся ещё более слабой связанности.
     */
    public BaseController(UserService service) {
        this.service = service;
    }

    /**
     * Точка входа. Здесь и инициализируем наши сервисы, ДАО и тд.
     * @param args
     */
    public static void main(String[] args) {
        BaseController baseController = new BaseController(new UserServiceIml(new PersonDAOImpl()));
        baseController.menu();

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите id человека: ");
        int id = scanner.nextInt();

        Person person = service.getPersonById(id);

        System.out.println(person);
    }
}
