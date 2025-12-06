package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MoviePageController
{
    @javafx.fxml.FXML
    private Label movieTitleLabel;
    @javafx.fxml.FXML
    private Label descriptionMovieLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void moviepageGobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example.movieproductionhouse/Sadat2420803/Audience/Dashboard"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();


        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void playTrailerButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addToFavoritesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void markAsWatchedButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addToWatchlistButton(ActionEvent actionEvent) {
    }
}