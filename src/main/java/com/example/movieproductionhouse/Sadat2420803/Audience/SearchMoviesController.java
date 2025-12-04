package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchMoviesController
{
    @javafx.fxml.FXML
    private TextField EnterMovieNameTextField;
    @javafx.fxml.FXML
    private TableColumn movienameCol;
    @javafx.fxml.FXML
    private TableColumn genreCol;
    @javafx.fxml.FXML
    private TableColumn ratingCol;
    @javafx.fxml.FXML
    private TableColumn releasedateCol;
    @javafx.fxml.FXML
    private TableView searchmovieTableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchMoviegobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("com/example/movieproductionhouse/Sadat2420803/Audience/Dashboard"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void openMovieButton(ActionEvent actionEvent) {
    }
}