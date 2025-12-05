package com.example.movieproductionhouse.Delowar_2420208.Producer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MovieBudgetController
{
    @javafx.fxml.FXML
    private TableColumn<MovieBudgetItem, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MovieBudgetItem, String> movieNameTableColumn;
    @javafx.fxml.FXML
    private TableView<MovieBudgetItem> movieBudgetTableView;
    @javafx.fxml.FXML
    private TableColumn<MovieBudgetItem, String> estimatedBudgetTableColumn;

    ObservableList<MovieBudgetItem> movieBudgetList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        movieNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("movieName"));
        estimatedBudgetTableColumn.setCellValueFactory(new PropertyValueFactory<>("estimatedBudget"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        movieBudgetList.addAll(
                new MovieBudgetItem("History of 1971", "2 Million", "Pending"),
                new MovieBudgetItem("Toofan", "3 Million", "Approved"),
                new MovieBudgetItem("Amar Bondhu Rashed", "4 Million", "Pending")
        );

        movieBudgetTableView.setItems(movieBudgetList);
    }

    @javafx.fxml.FXML
    public void approveButtonOnAction(ActionEvent actionEvent) {
        MovieBudgetItem selected = movieBudgetTableView.getSelectionModel().getSelectedItem();


        if (selected == null) {
            showAlert("Choose a movie first.");
            return;
        }

        selected.setStatus("Approved");
        movieBudgetTableView.refresh();

        showAlert("Budget approved.");
    }

    @javafx.fxml.FXML
    public void editButtonOnAction(ActionEvent actionEvent) {
        MovieBudgetItem selected = movieBudgetTableView.getSelectionModel().getSelectedItem();


        if (selected == null) {
            showAlert("Select a movie to edit.");
            return;
        }

        selected.setEstimatedBudget(selected.getEstimatedBudget() + "(edited)");
        movieBudgetTableView.refresh();

        showAlert("Budget edited");
    }


    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}