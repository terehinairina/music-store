package com.example.demo7;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Exit {

    @FXML
    private Button b2;

    @FXML
    public void initialize() {
        b2.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Wieone.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Музыкальный магазин");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }


}
