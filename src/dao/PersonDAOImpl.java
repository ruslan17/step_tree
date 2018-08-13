package dao;

import db.MockDB;
import model.Person;

/**
 * Реализация DAO - Data Access Object.
 * Обеспечивает работу с базой данных.
 * В нашем случае с иммитацией базы - классом MockDB.
 * Класс должен отвечать за доступ к данным, и не нести в себе бизнес логики.
 * Для работы с разными сущностями(моделями), должны быть разные DAO.
 */
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