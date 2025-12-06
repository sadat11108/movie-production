package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class TrailersController
{
    @javafx.fxml.FXML
    private Label selectedmovieOutputLabel1;
    @javafx.fxml.FXML
    private TableColumn<Movie,String> movienameCol;
    @javafx.fxml.FXML
    private Label selectedmovieOutputLabel;
    @javafx.fxml.FXML
    private TableView<Movie> listofmoviesTableview;
    @javafx.fxml.FXML
    private TableColumn<Movie,String> genreCol;
    @javafx.fxml.FXML
    private Label selectedmovieOutputLabel11;
    @javafx.fxml.FXML
    private TableColumn<Movie,Integer> releasedateCol;
    @javafx.fxml.FXML
    private Label genreOutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
        movienameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
        releasedateCol.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    @javafx.fxml.FXML
    public void playtrailerButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trailergobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example.movieproductionhouse/Sadat2420803/Audience/Dashboard"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();


        stage.setScene(scene);
        stage.show();
    }
}