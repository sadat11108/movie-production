package com.example.movieproductionhouse;

import javafx.event.ActionEvent;
<<<<<<< HEAD
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
=======
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
>>>>>>> 0a084b2dd5313fb69432c42dce9bbef158bb47e2

public class LoginFxmlController
{
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private ComboBox userTypeCB;
    @javafx.fxml.FXML
    private TextField idTF;

    @javafx.fxml.FXML
    public void initialize() {
<<<<<<< HEAD
        userTypeCB.getItems().addAll("Director", "Producer", "Actors and Actresses ", "Camera Man", "Audience", "Sound system manager" );

    }

    @javafx.fxml.FXML
    public void createAccountOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CrateAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
=======
    }

    @javafx.fxml.FXML
    public void createAccountOA(ActionEvent actionEvent) {
>>>>>>> 0a084b2dd5313fb69432c42dce9bbef158bb47e2
    }

    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) {
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
=======
>>>>>>> 0a084b2dd5313fb69432c42dce9bbef158bb47e2
    }
}