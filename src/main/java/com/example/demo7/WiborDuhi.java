package com.example.demo7;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WiborDuhi {

    @FXML
    private Button butt1;

    @FXML
    private Button butt2;

    @FXML
    private Button butt4;

    @FXML
    private ImageView im1;

    @FXML
    private ImageView im2;

    @FXML
    private ImageView im4;

    @FXML
    private Text text1;

    @FXML
    private Button b2;

    @FXML
    public void initialize() {
        butt1.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Tuba.fxml"));
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
        butt2.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Voltorna.fxml"));
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
        butt4.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Saksofon.fxml"));
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