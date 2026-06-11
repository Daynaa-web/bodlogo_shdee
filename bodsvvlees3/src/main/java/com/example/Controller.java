package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txt_a;

    @FXML
    private TextField txt_b;

    @FXML
    private Label txt_ih;

    @FXML
    void buttonclick(ActionEvent event) {
        try {
            // 1. Оролтын TextField-үүдээс текстийг авч тоо руу хөрвүүлэх
            int a = Integer.parseInt(txt_a.getText().trim());
            int b = Integer.parseInt(txt_b.getText().trim());
            
            // 2. Хоёр тооны ихийг олох
            int max;
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
            
            // Заавал if ашиглахгүйгээр Math.max(a, b) гэж бичиж бас болно:
            // int max = Math.max(a, b);

            // 3. Үр дүнг Label дээр хэвлэх (тоог буцаагаад String болгоно)
            txt_ih.setText(String.valueOf(max));
            
        } catch (NumberFormatException e) {
            // Хэрэглэгч тоо биш текст оруулсан эсвэл хоосон орхисон үед алдаа заах хэсэг
            txt_ih.setText("Тоо оруулна уу!");
        }
    }
}