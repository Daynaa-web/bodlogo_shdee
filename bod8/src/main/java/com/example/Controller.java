package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label buult;

    @FXML
    private TextField txt_too;

    @FXML
    void clickbutton(ActionEvent event) {
        try {
            // Оролтын утгыг уншиж авах
            String input = txt_too.getText().trim();
            
            if (input.isEmpty()) {
                buult.setText("Тоо оруулна уу!");
                return;
            }
            
            long k = Long.parseLong(input);
            
            if (k < 0) {
                buult.setText("0-ээс их тоо оруулна уу!");
                return;
            }
            
            // Давталттай хэсэглэлийн томьёо: (k+3)*(k+2)*(k+1) / 6
            // long төрөл ашигласан нь тоо томрох үед overflow-оос сэргийлнэ
            long result = (k + 3) * (k + 2) * (k + 1) / 6;
            
            // Үр дүнг дэлгэцэнд хэвлэх
            buult.setText(String.valueOf(result));
            
        } catch (NumberFormatException e) {
            buult.setText("Зөвхөн бүхэл тоо оруулна уу!");
        }
    }
}