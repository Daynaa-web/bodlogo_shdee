package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txt_n;

    @FXML
    private Label txt_urdun;

    @FXML
    void buttonclick(ActionEvent event) {
        
        int n = Integer.parseInt(txt_n.getText());
        
        int sum = n * (n + 1) / 2;
        
        txt_urdun.setText(String.valueOf(sum));
    }

}