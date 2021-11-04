package com.studentManagementSystem;

public class Student {

    private int id;
    private String forename;
    private String surname;
    private int age;

    public Student() {
    }

    public Student(int id, String forename, String surname, int age) {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }
}
