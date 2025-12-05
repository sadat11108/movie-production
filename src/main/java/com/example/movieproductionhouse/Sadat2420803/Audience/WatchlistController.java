package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class WatchlistController
{
    @javafx.fxml.FXML
    private TableColumn<Movie,Integer> yearCol;
    @javafx.fxml.FXML
    private TableColumn<Movie,String> genreCol;
    @javafx.fxml.FXML
    private TableColumn<Movie,String> movieTitleCol;
    @javafx.fxml.FXML
    private TableView<Movie> watchlistTableview;

    @javafx.fxml.FXML
    public void initialize() {
        movieTitleCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
        yearCol.setCellValueFactory(new PropertyValueFactory<>("year"));
    }

    @javafx.fxml.FXML
    public void goBackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("com/example/movieproductionhouse/Sadat2420803/Audience/MoviePage"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void openMovieButton(ActionEvent actionEvent) {
    }
}