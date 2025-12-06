package com.example.movieproductionhouse.Delowar_2420208.Director;

import com.example.movieproductionhouse.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class AssignActorsController
{
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> movieTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ActorItem, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableView<MovieItem> selectMovieTableView;
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> genreTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ActorItem, String> roleTableColumn;
    
    private String message;
    private String movie;
    private String genre;
    @javafx.fxml.FXML
    private TableView availableActorsTableView;

    @javafx.fxml.FXML
    public void initialize() {
        movieTableColumn.setCellValueFactory(new PropertyValueFactory<>("movie"));
        genreTableColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        roleTableColumn.setCellValueFactory(new PropertyValueFactory<>("role"));

        selectMovieTableView.getItems().addAll(
                new MovieItem("Toofan", "Action"),
                new MovieItem("Monpura", "Drama"),
                new MovieItem("Dhaka Attack", "Adventure")
        );
    }

    @javafx.fxml.FXML
    public void assignSelectedButtonOnAction(ActionEvent actionEvent) {
        MovieItem selectedMovie = selectMovieTableView.getSelectionModel().getSelectedItem();
        Object selectedActor = availableActorsTableView.getSelectionModel().getSelectedItem();


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

        availableActorsTableView.getItems().clear();
        availableActorsTableView.getItems().addAll(
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
        alert.showAndWait();
    }


    @javafx.fxml.FXML
    public void goBDDBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/movieproductionhouse/Delowar_2420208/Director/DirectorDashboardFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}