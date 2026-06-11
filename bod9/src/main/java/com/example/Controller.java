package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label niilber;

    @FXML
    private TextField txt_a; // Үүнийг S1 гэж ойлгоно

    @FXML
    private TextField txt_b; // Үүнийг S2 гэж ойлгоно

    @FXML
    private TextField txt_c; // Үүнийг S3 гэж ойлгоно

    @FXML
    void buttonclick(ActionEvent event) {
        try {
            // Текст талбаруудаас талбайн утгуудыг унших
            double s1 = Double.parseDouble(txt_a.getText().trim());
            double s2 = Double.parseDouble(txt_b.getText().trim());
            double s3 = Double.parseDouble(txt_c.getText().trim());

            if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
                niilber.setText("Буруу утга!");
                return;
            }

            // Ирмэгүүдийн үржвэрийн квадрат (Эзлэхүүний квадрат)
            double volumeProduct = s1 * s2 * s3;
            double abc = Math.sqrt(volumeProduct);

            // Ирмэг тус бүрийн уртыг олох
            double a = abc / s2;
            double b = abc / s3;
            double c = abc / s1;

            // Бүх 12 ирмэгийн нийлбэр
            double totalLength = 4 * (a + b + c);

            // Үр дүнг бүхэл тоо болгож харуулах (Бодлогын нөхцөлд бүхэл тоон ирмэг гэсэн)
            niilber.setText(String.format("%.0f", totalLength));

        } catch (NumberFormatException e) {
            niilber.setText("Тоо оруулна уу!");
        }
    }
}