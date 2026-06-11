package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label txt_tomuseg;

    @FXML
    private TextField txt_useg;

    @FXML
    void buttonclick(ActionEvent event) {
        String inputtext = txt_useg.getText();

        String uppercaseText = inputtext.toUpperCase();

        txt_tomuseg.setText(uppercaseText);
    }

}
