package com.studentManagementSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DeleteButton extends Button {

    public DeleteButton(String text) {
        super(text);
    }

    public void delete(JTable table, Students students) {

        int row = table.getSelectedRow();
        if (row > -1) {
            int result = JOptionPane.showConfirmDialog(null,"Sure? You want to exit?", "Swing Tester", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == 0) {
                ((DefaultTableModel)table.getModel()).removeRow(row);
                students.getStudents().remove(row);
            }
        }
    }
}
