package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label p;

    @FXML
    private Label s;

    @FXML
    private TextField txt_a;

    @FXML
    private TextField txt_b;

    @FXML
    private void buttonclick(ActionEvent event) {
        
        int a = Integer.parseInt(txt_a.getText());
        int b = Integer.parseInt(txt_b.getText());

        int area = a * b;
        int perimeter = 2 * (a + b);

        s.setText(String.valueOf(area));
        p.setText(String.valueOf(perimeter));

    }

}