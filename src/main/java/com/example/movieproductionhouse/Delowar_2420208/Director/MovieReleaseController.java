package com.example.movieproductionhouse.Delowar_2420208.Director;

import com.example.movieproductionhouse.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class MovieReleaseController
{
    @javafx.fxml.FXML
    private TableColumn<MovieReleaseItem, String> titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MovieReleaseItem, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableView<MovieReleaseItem> completedMoviesTableView;

    private ObservableList<MovieReleaseItem>
            movieList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadCompletedMovies();
    }

    private void loadCompletedMovies() {
        movieList.addAll(
                new MovieReleaseItem("History of 1971", "Completed"),
                new MovieReleaseItem("Toofan", "Ready for Release"),
                new MovieReleaseItem("Amar Bondhu Rashed", "Completed")
        );

        completedMoviesTableView.setItems(movieList);
    }

    @javafx.fxml.FXML
    public void cancelButtonOnAction(ActionEvent actionEvent) {
        showAlert("Cancelled", "Action cancelled. Go back.");
    }

    @javafx.fxml.FXML
    public void submitReleaseButtonOnAction(ActionEvent actionEvent) {
        MovieReleaseItem selected = completedMoviesTableView.getSelectionModel().getSelectedItem();


        if (selected == null) {
            showAlert("No selection", "Choose a movie first");
            return;
        }

        selected.setStatus("Submitted for Release");
        completedMoviesTableView.refresh();

        showAlert("Success", "Movie submitted for release.");
    }

    private void showAlert(String title, String message) {
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