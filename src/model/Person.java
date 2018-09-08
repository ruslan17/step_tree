package model;

import java.time.LocalDate;

public class Person {

    private int id;

    private String name;

    private LocalDate birthday;

    private Person mother;

    private Person father;

    public Person() {
    }

    public Person(int id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public Person(int id, String name, LocalDate birthday, Person mother, Person father) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.mother = mother;
        this.father = father;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {

//        String motherName = mother != null
//                ? mother.getName() : "";

        String motherName = "";

        if (mother != null) {
            motherName = mother.getName();
        }

        String fatherName = father != null
                ? father.getName() : "";

        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthday +
                '}';
    }
}
