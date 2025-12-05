package com.example.movieproductionhouse;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.security.auth.login.LoginContext;
import java.io.IOException;
import java.util.EventObject;

public class LoginFxmlController
{
    @FXML
    private PasswordField passwordPF;
    @FXML
    private ComboBox<String> userTypeCB;
    @FXML
    private TextField idTF;

    @FXML
    public void initialize() {
        userTypeCB.getItems().addAll("Director", "Producer", "Actors and Actresses ", "Camera Man", "Audience", "Sound system manager" );


        userTypeCB.setValue("Director");

    }

    @FXML
    public void createAccountOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



        System.out.println("Going to Create Account Dashboard");
    }


    @FXML
    public void loginOA(ActionEvent actionEvent) {
        String userType = userTypeCB.getValue();

        if (userType == null) {
            System.out.println("⚠ Select a user type first.");
            return;
        }

        try {
            switch (userType) {

                case "Director" -> switchScene("/dashboard/director_dashboard.fxml", "Director Dashboard");

                case "Producer" -> switchScene("/dashboard/producer_dashboard.fxml", "Producer Dashboard");

                case "Actors and Actresses" ->
                        switchScene("/dashboard/actors_dashboard.fxml", "Actors & Actresses Dashboard");

                case "Camera Man" ->
                        switchScene("/dashboard/cameraman_dashboard.fxml", "Camera Operator Dashboard");

                case "Audience" ->
                        switchScene("/dashboard/audience_dashboard.fxml", "Audience Dashboard");

                case "Sound system manager" ->
                        switchScene("/dashboard/sound_manager_dashboard.fxml", "Sound Manager Dashboard");

                default -> System.out.println("⚠ Unknown user type.");
            }

        } catch (IOException e) {
            System.out.println("⚠ Error switching scene: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------
    // Helper method for switching dashboards
    // ---------------------------------------------------------
    private void switchScene(String fxmlPath, String title) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CrateAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        EventObject actionEvent = null;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


}