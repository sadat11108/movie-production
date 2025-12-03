package com.example.movieproductionhouse.Delowar_2420208.Director;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateMovieController
{
    @javafx.fxml.FXML
    private TableColumn titleTableColumn;
    @javafx.fxml.FXML
    private TextField genreTextField;
    @javafx.fxml.FXML
    private TableColumn genreTableColumn;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn descriptionTableColumn;
    @javafx.fxml.FXML
    private TableView existingMoviesTableView;
    @javafx.fxml.FXML
    private TextField movieTitleTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveMovieButtonOnAction(ActionEvent actionEvent) {
    }
}