package com.example.demo7;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;


public class Controller {

    @FXML
    private ImageView dog1;
    @FXML
    private TableView<Customer> tableView;

    @FXML
    private TableColumn<Customer, String> kodColumn;

    @FXML
    private TableColumn<Customer, Integer> numberColumn;

    @FXML
    private TableColumn<Customer, String> nameColumn;

    @FXML
    private TextField kodInput;

    @FXML
    private TextField nameInput;
    @FXML
    private TextField numberInput;

    @FXML
    private Button save;

    ObservableList<Customer> customers = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        save.setOnAction(clik -> {
            try {
                String line = ("Имя заказчика: "+" "+nameInput.getText()+" ");
                String line2=("Код инструмента: "+kodInput.getText()+" ");
                String line3=("Номер телефона заказчика: "+numberInput.getText()+" ");
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\demo7\\src\\main\\resources\\com\\example\\demo7\\Zakaz");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                buffer=line2.getBytes();
                fileOutputStream.write(buffer);
                buffer=line3.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Удачно сохранено");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Exit.fxml"));
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

        nameColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("name"));
        kodColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("kod"));
        numberColumn.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("number"));
    }

    @FXML
    public void submit(ActionEvent event) {
        Customer customer = new Customer(nameInput.getText(),
                (kodInput.getText()),
                Integer.parseInt(numberInput.getText()));
        customers.add(customer);
        tableView.setItems(customers);
    }

    @FXML
    public void removeCustomer(ActionEvent event) {
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }

}