package ru.ssau.tk;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person firstPerson = new Person();
    Person secondPerson = new Person();

    @Test
    public void setFirstPersonTest() {
        firstPerson.setFirstName("Josh");
        firstPerson.setSecondName("Wilson");
        firstPerson.setPersonId(123321);
        assertEquals(firstPerson.getPersonId(), 123321);
        assertEquals(firstPerson.getFirstName().equals("Josh"), true);
        assertEquals(firstPerson.getSecondName().equals("Wilson"), true);
    }

    @Test
    public void setSecondPersonTest() {
        secondPerson.setFirstName("John");
        secondPerson.setSecondName("Wilsones");
        secondPerson.setPersonId(1233213);
        assertEquals(secondPerson.getPersonId(), 1233213);
        assertEquals(secondPerson.getFirstName().equals("John"), true);
        assertEquals(secondPerson.getSecondName().equals("Wilsones"), true);
    }
}