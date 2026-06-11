package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ComboBox<Integer> cmbApartment; // орцны тоо

    @FXML
    private ComboBox<Integer> cmbFloorCount; // давхарын тоо

    @FXML
    private ComboBox<Integer> cmbDoorCount; // нэг давхрын айлын тоо

    @FXML
    private TextField txtDoorNumber; // айлын дугаар

    @FXML
    private Label lblResult;

    @FXML
    public void initialize() {

        for (int i = 1; i <= 20; i++) {
            cmbApartment.getItems().add(i);
            cmbFloorCount.getItems().add(i);
            cmbDoorCount.getItems().add(i);
        }
    }

    @FXML
    void buttonclick(ActionEvent event) {

        try {
            int entrances = cmbApartment.getValue();
            int floors = cmbFloorCount.getValue();
            int doorsPerFloor = cmbDoorCount.getValue();
            int doorNumber = Integer.parseInt(txtDoorNumber.getText());

            int apartmentsPerEntrance = floors * doorsPerFloor;

            int entrance = (doorNumber - 1) / apartmentsPerEntrance + 1;

            int positionInsideEntrance =
                    (doorNumber - 1) % apartmentsPerEntrance;

            int floor =
                    positionInsideEntrance / doorsPerFloor + 1;

            int door =
                    positionInsideEntrance % doorsPerFloor + 1;

            if (entrance > entrances) {
                lblResult.setText("Ийм дугаартай айл байхгүй!");
                return;
            }

            lblResult.setText(
                    "Орц: " + entrance +
                    "  Давхар: " + floor +
                    "  Хаалга: " + door
            );

        } catch (Exception e) {
            lblResult.setText("Бүх утгыг зөв оруулна уу!");
        }
    }
}