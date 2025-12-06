package com.example.movieproductionhouse.Delowar_2420208.Director;

import com.example.movieproductionhouse.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateMovieController
{
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> titleTableColumn;
    @javafx.fxml.FXML
    private TextField genreTextField;
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> genreTableColumn;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> descriptionTableColumn;
    @javafx.fxml.FXML
    private TextField movieTitleTextField;
    @javafx.fxml.FXML
    private TableView<MovieItem> saveMovieTableView;

    ObservableList<MovieItem> movieList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        genreTableColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        saveMovieTableView.setItems(movieList);

    }

    @javafx.fxml.FXML
    public void saveMovieButtonOnAction(ActionEvent actionEvent) {
        String title = movieTitleTextField.getText();
        String genre = genreTextField.getText();
        String description = descriptionTextArea.getText();
        if (title.isEmpty() || genre.isEmpty() || description.isEmpty()) {
            showAlert("Missing Fields", "Fillup all fields properly before saving.");
            return;

        }

        MovieItem movie = new MovieItem(title, genre);
        saveMovieTableView.getItems().add(movie);
        movieTitleTextField.clear();
        genreTextField.clear();
        descriptionTextArea.clear();

        showAlert("Movie Saved", "The movie has been added");

    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();

    }

    @javafx.fxml.FXML
    public void goBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/movieproductionhouse/Delowar_2420208/Director/DirectorDashboardFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}