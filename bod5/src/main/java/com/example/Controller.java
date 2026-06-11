package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label e;

    @FXML
    private Label q;

    @FXML
    private TextField txt_a;

    @FXML
    private Label w;

    @FXML
    void buttonclick(ActionEvent event) {

        int totalSeconds = Integer.parseInt(txt_a.getText());

        int hour = totalSeconds / 3600;
        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds % 60;

        q.setText(String.valueOf(hour));
        w.setText(String.valueOf(minute));
        e.setText(String.valueOf(second));
    }
}