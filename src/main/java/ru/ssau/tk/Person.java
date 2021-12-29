package ru.ssau.tk;

public class Person {
    private String firstName;
    private String secondName;
    private int personId;


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void  setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Person() {}
    public Person(String firstName, String secondName, int personId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.personId = personId;
    }

    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        firstPerson.setFirstName("Josh");
        firstPerson.setSecondName("Wilson");
        firstPerson.setPersonId(123321);
        secondPerson.setFirstName("John");
        secondPerson.setSecondName("Wilsones");
        secondPerson.setPersonId(1233213);
    }
}
