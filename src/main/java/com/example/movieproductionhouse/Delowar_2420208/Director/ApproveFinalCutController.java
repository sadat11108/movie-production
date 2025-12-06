package com.example.movieproductionhouse.Delowar_2420208.Director;

import com.example.movieproductionhouse.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ApproveFinalCutController
{
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MovieItem, String> statusTableColumn;
    @javafx.fxml.FXML
    private TextArea movieSummaryTextArea;
    @javafx.fxml.FXML
    private TableView<MovieItem> completedMoviesTableView;

    @javafx.fxml.FXML
    public void initialize() {
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        completedMoviesTableView.getItems().addAll(
                new MovieItem("Ora 11 Jon", "Completed"),
                new MovieItem("Amar Bondhu Rashed ", "Completed"));


        completedMoviesTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldVaal, newVal) -> {
            if (newVal != null) {
                movieSummaryTextArea.setText(
                        "Title: " + newVal.getTitle() + "\n"
                                + "Status: " + newVal.getStatus() + "\n\n"
                                + "Sample Summary: The film stands completed, waiting for your judgement."
                );

            }
        });
    }

    @javafx.fxml.FXML
    public void approveButtonOnAction(ActionEvent actionEvent) {
        MovieItem selected = completedMoviesTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("No Movie Selectde", "Choose a movie before approved");
            return;
        }

        showAlert("Approved", "The final cut has been approved");
    }

    @javafx.fxml.FXML
    public void rejectButtonOnAction(ActionEvent actionEvent) {
        MovieItem selectde = completedMoviesTableView.getSelectionModel().getSelectedItem();

        if (selectde == null) {
            showAlert("No Movie Selectde", "Choose a movie before rejected");
            return;
        }

        showAlert("Rejected", "The final cut has been rejected");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    @javafx.fxml.FXML
    public void goBackDDBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/movieproductionhouse/Delowar_2420208/Director/DirectorDashboardFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public static class MovieItem {
        private String title;
        private String status;

        public MovieItem(String title, String status) {
            this.title = title;
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }
}