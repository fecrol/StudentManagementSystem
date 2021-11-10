package com.studentManagementSystem;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Students students = new Students();

        MyFrame frame = new MyFrame();
        int width = frame.getWidth();
        int height = frame.getHeight();

        Table table = new Table(width, height, students);
        Form form = new Form(width, height, students, table);

        frame.add(form, BorderLayout.WEST);
        frame.add(table, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
