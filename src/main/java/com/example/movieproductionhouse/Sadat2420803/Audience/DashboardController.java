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

    @javafx.fxml.FXML
    public void trailerButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Trailers.fxlm"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void FeedbackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchMoviesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) throws IOException {

    }

    @javafx.fxml.FXML
    public void profileButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notificationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void watchlistButton(ActionEvent actionEvent) {
    }
}