package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void trailerButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Trailers.fxlm"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @Deprecated
    public void FeedbackButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void searchMoviesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void profileButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notificationButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void watchlistButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void soundEditingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void inventoryButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void soundSetupButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dailyTasksButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void shootingScheduleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void budgetButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportsButton(ActionEvent actionEvent) {
    }
}