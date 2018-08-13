package service;

import dao.PersonDAO;
import model.Person;

/**
 * Реализация сервиса. Класс предназначенный для работы с бизнес логикой.
 * Для работы с разными сущностями(моделями), должны быть разные сервисы.
 */
public class UserServiceIml implements UserService {

    private PersonDAO dao;

    /**
     * Не инициализируем интерфейс PersonDAO явно, даём возможность сделать это вызывающим классам.
     * Таким образом добиваемся ещё более слабой связанности.
     */
    public UserServiceIml(PersonDAO dao) {
        this.dao = dao;
    }

    @Override
    public Person getPersonById(int id) {
        return dao.getPersonById(id);
    }
}
