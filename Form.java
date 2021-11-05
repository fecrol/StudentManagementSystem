package com.studentManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JPanel implements ActionListener {

    private int width;
    private int height;
    private int containerHeight;
    private Students students;
    private Table table;
    private JPanel container;
    private JLabel id;
    private JTextField idText;
    private JLabel forename;
    private JTextField forenameText;
    private JLabel surname;
    private JTextField surnameText;
    private JLabel age;
    private JTextField ageText;
    private AddButton addButton;
    private EditButton editButton;
    private SaveButton saveButton;
    private DeleteButton deleteButton;

    public Form(int width, int height) {
        this.width = width / 3;
        this.height = height;
        this.containerHeight = 120;
        this.setPreferredSize(new Dimension(this.width, this.height));

        this.students = students;
        this.table = table;

        this.container = new JPanel();
        this.container.setLayout(new GridLayout(4, 2, 0, 10));
        this.container.setPreferredSize(new Dimension(this.width - 10, this.containerHeight));

        this.id = new JLabel("ID");
        this.idText = new JTextField();

        this.forename = new JLabel("Forename");
        this.forenameText = new JTextField();

        this.surname = new JLabel("Surname");
        this.surnameText = new JTextField();

        this.age = new JLabel("Age");
        this.ageText = new JTextField();

        this.addButton = new AddButton("ADD");
        this.addButton.addActionListener(this);

        this.editButton = new EditButton("EDIT");
        this.editButton.addActionListener(this);

        this.saveButton = new SaveButton("SAVE");
        this.saveButton.addActionListener(this);

        this.deleteButton = new DeleteButton("DELETE");
        this.deleteButton.addActionListener(this);

        this.container.add(this.id);
        this.container.add(this.idText);
        this.container.add(this.forename);
        this.container.add(this.forenameText);
        this.container.add(this.surname);
        this.container.add(this.surnameText);
        this.container.add(this.age);
        this.container.add(this.ageText);
        this.add(this.container);
        this.add(this.addButton);
        this.add(this.editButton);
        this.add(this.saveButton);
        this.add(this.deleteButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
