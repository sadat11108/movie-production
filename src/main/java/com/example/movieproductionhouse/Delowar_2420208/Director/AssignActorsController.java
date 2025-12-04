package com.example.movieproductionhouse.Delowar_2420208.Director;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AssignActorsController
{
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> movieTableColumn;
    @javafx.fxml.FXML
    private TableView<ActorItem> availableActorsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ActorItem, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableView<MovieItem> selectMovieTableView;
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> genreTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ActorItem, String> roleTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        movieTableColumn.setCellValueFactory(new PropertyValueFactory<>("movie"));
        genreTableColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        roleTableColumn.setCellValueFactory(new PropertyValueFactory<>("role"));

        selectMovieTableView.getItems().addAll(
                new MovieItem("Tuffan", "Action"),
                new MovieItem("Monpura", "Drama"),
                new MovieItem("Dhaka Attack", "Adventure")
        );
    }

    @javafx.fxml.FXML
    public void assignSelectedButtonOnAction(ActionEvent actionEvent) {
        MovieItem selectedMovie = selectMovieTableView.getSelectionModel().getSelectedItem();
        ActorItem selectedActor = availableActorsTableColumn.getSelectionModel().getSelectedItem();


        if (selectedMovie == null) {
            showAlert("No Movie Selected");
            return;

        }

        if (selectedActor == null) {
            showAlert("No Actor Selected");
            return;

        }

        showAlert("Actor Assigned");
    }

    @javafx.fxml.FXML
    public void loadActorsButtonOnAction(ActionEvent actionEvent) {
        MovieItem selectedMovie = selectMovieTableView.getSelectionModel().getSelectedItem();

        if (selectedMovie == null) {
            showAlert("No Movie Selected");
            return;
        }

        availableActorsTableColumn.getItems().clear();
        availableActorsTableColumn.getItems().addAll(
                new ActorItem("Shakib Khan", "Hero"),
                new ActorItem("Purnima", "Heroine"),
                new ActorItem("Dipjol", "Villain")
        );

        showAlert("Actors Loaded are now shown");

    }

    private void showAlert(String title) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    public static class MovieItem {
        private String movie;
        private String genre;

        public MovieItem(String movie, String genre) {
            this.movie = movie;
            this.genre = genre;
        }
    }

    public String getMovie() {
        return movie;
    }

    public String getGenre() {
        return genre;
    }

    public static class ActorItem {
        private String name;
        private String role;

        public ActorItem(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }
    }
}