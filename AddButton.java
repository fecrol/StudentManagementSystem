package com.studentManagementSystem;

import javax.swing.*;

public class AddButton extends Button {

    private Students students;

    public AddButton(String text, Students students) {
        super(text);
        this.students = students;
    }

    public void addStudent(String id, String forename, String surname, String age) {
        // If details are correct, adds a student.

        Student student = new Student(Integer.parseInt(id), forename, surname, Integer.parseInt(age));
        this.students.addStudent(student);
    }
}
