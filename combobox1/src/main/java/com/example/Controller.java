package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ComboBox<Integer> cmbOperation;

    @FXML
    private Label txt_dun;

    @FXML
    public void initialize() {
        cmbOperation.getItems().addAll(2, 3, 4, 5);
    }

    @FXML
    void buttonclick(ActionEvent event) {

        Integer dun = cmbOperation.getValue();

        if (dun == null) {
            txt_dun.setText("Дүн сонгоно уу");
            return;
        }

        switch (dun) {
            case 5:
                txt_dun.setText("Onts");
                break;
            case 4:
                txt_dun.setText("Sain");
                break;
            case 3:
                txt_dun.setText("Dund");
                break;
            case 2:
                txt_dun.setText("Muu");
                break;
        }
    }
}