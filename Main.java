package com.studentManagementSystem;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Students students = new Students();

        MyFrame frame = new MyFrame();
        int width = frame.getWidth();
        int height = frame.getHeight();

        Form form = new Form(width, height);

        frame.add(form, BorderLayout.WEST);

        frame.setVisible(true);
    }
}
