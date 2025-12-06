package com.example.movieproductionhouse;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFxmlController
{
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeCB;
    @javafx.fxml.FXML
    private TextField idTF;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeCB.getItems().addAll("Director", "Producer", "Actors and Actresses ", "Camera Man", "Audience", "Sound system manager" );

    }

    @javafx.fxml.FXML
    public void createAccountOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



        System.out.println("Going to Create Account Dashboard");
    }


    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) throws IOException {
        if (userTypeCB.getValue().equals("Director")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/movieproductionhouse/Delowar_2420208/Director/DirectorDashboardFxml.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (userTypeCB.getValue().equals("Producer")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/movieproductionhouse/Delowar_2420208/Producer/ProducerDashboardFxml.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (userTypeCB.getValue().equals("Audience")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/movieproductionhouse/Sadat2420803/Audience/Profile.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }

        else if (userTypeCB.getValue().equals("Sound system manager")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }

        String id = idTF.getText();
        String pass = passwordPF.getText();
        String user = userTypeCB.getValue();

        // --- validation ---
        if (id == null || id.isEmpty()) {
            showAlert("ID cannot be empty.");
            return;
        }

        if (pass == null || pass.isEmpty()) {
            showAlert("Password cannot be empty.");
            return;
        }

        if (user == null || user.isEmpty()) {
            showAlert("Please select a user type.");
            return;
        }




    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }



}