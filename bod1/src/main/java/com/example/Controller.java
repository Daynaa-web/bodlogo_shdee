package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label n;

    @FXML
    private Label s;

    @FXML
    private TextField txt_a;

    @FXML
    private TextField txt_b;

    @FXML
    private TextField txt_c;

    @FXML
    void buttonclick(ActionEvent event) {
        double a = Double.parseDouble(txt_a.getText());
    double b = Double.parseDouble(txt_b.getText());
    double c = Double.parseDouble(txt_c.getText());

    // Гурвалжин мөн эсэхийг шалгах
    if (a + b > c && a + c > b && b + c > a) {

        n.setText("Мөн");

        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        s.setText(String.format("%.2f", area));

    } else {

        n.setText("Биш");
        s.setText("0");

    }

    }

}
