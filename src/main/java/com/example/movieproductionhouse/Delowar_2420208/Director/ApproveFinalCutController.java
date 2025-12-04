package com.example.movieproductionhouse.Delowar_2420208.Director;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApproveFinalCutController
{
    @javafx.fxml.FXML
    private TableColumn titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TextArea movieSummaryTextArea;
    @javafx.fxml.FXML
    private TableView<String> completedMoviesTableView;

    @javafx.fxml.FXML
    public void initialize() {
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        completedMoviesTableView.getItems().addAll(
                new MovieItem("Ora 11 Jon", "Completed"),
                new MovieItem("Amar Bondhu Rashed ", "Completed"));

        boolean newVal;
        completedMoviesTableView.getSelectionModel().selectedIndexProperty().addListener((observable, oldVaal, newVal) {
            if (newVal != null) {
                movieSummaryTextArea.setText(
                        "Title: " + newVal + "\n"
                        + "Status: " newVal.getStatus() + "\n\n"
                        +"Sample Summary: The movie completed, waiting for your judgement."
                );
            }
        });
    }

    @javafx.fxml.FXML
    public void approveButtonOnAction(ActionEvent actionEvent) {
        MovieItem selected = completedMoviesTableView.getSelectionModel().getSelectedItems();

        if (selected == null) {
            showAlert("No Movie Selectde", "Choose a movie before approved");
            return;
        }

        showAlert("Approved", "The final cut has been approved");
    }

    @javafx.fxml.FXML
    public void rejectButtonOnAction(ActionEvent actionEvent) {
        MovieItem selectde = completedMoviesTableView.getSelectionModel().getSelectedItems();

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

        public String getStatus() {
            return status;
        }
    }
}