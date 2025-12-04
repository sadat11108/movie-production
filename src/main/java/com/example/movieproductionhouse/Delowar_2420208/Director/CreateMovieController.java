package com.example.movieproductionhouse.Delowar_2420208.Director;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<MovieItem> existingMoviesTableView;
    @javafx.fxml.FXML
    private TextField movieTitleTextField;

    @javafx.fxml.FXML
    public void initialize() {
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        genreTableColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

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

        MovieItem movie = new MovieItem(title, genre, description);
        existingMoviesTableView.getItems().add(movie);
        movieTitleTextField.clear();
        genreTextField.clear();
        descriptionTextArea.clear();

        showAlert("Movie Saved", "The movie has been added");

    }

    private void showAlert(String title, String message)
}