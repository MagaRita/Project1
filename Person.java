package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String workPlace;

    public Person(String firstName, String lastName, int age, String workPlace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.workPlace = workPlace;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getWorkPlace() {
        return workPlace;
    }
}
