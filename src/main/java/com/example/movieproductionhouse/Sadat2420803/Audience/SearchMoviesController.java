package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchMoviesController
{
    @javafx.fxml.FXML
    private TextField EnterMovieNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Movie,String> movienameCol;
    @javafx.fxml.FXML
    private TableColumn<Movie,String> genreCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback,Double> ratingCol;
    @javafx.fxml.FXML
    private TableColumn<Movie,Integer> releasedateCol;
    @javafx.fxml.FXML
    private TableView<Movie> searchmovieTableview;

    @javafx.fxml.FXML
    public void initialize() {
        movienameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
        releasedateCol.setCellValueFactory(new PropertyValueFactory<>("year"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
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