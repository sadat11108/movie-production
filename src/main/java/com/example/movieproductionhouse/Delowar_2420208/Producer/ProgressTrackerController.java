package com.example.movieproductionhouse.Delowar_2420208.Producer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProgressTrackerController
{
    @javafx.fxml.FXML
    private TableColumn<ProgressItem, String> movieTableColumn;
    @javafx.fxml.FXML
    private TextField remarksTextField;
    @javafx.fxml.FXML
    private TableColumn<ProgressItem, String> progressTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ProgressItem, String> remarksTableColumn;
    @javafx.fxml.FXML
    private TextField newProgressTextField;
    @javafx.fxml.FXML
    private TableView<ProgressItem> movieProgressTableView;

    ObservableList<ProgressItem> progressList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        movieTableColumn.setCellValueFactory(new PropertyValueFactory<>("movieName"));
        progressTableColumn.setCellValueFactory(new PropertyValueFactory<>("progress"));
        remarksTableColumn.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        progressList.addAll(
                new ProgressItem("History of 1971", 40, "Filming"),
                new ProgressItem("Toofan", 75, "Editing"),
                new ProgressItem("Amar Bondhu Rashed", 20, "Script revision")
        );

        movieProgressTableView.setItems(progressList);

        movieProgressTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldItem, newItem) -> {
                    if (newItem != null) {
                        newProgressTextField.setText(String.valueOf(newItem.getProgress()));
                        remarksTextField.setText(newItem.getRemarks());
                    }
                }
        );
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
        ProgressItem selected = movieProgressTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            try {
                int newProgress = Integer.parseInt(newProgressTextField.getText());
                String newRemarks = remarksTextField.getText();

                selected.setProgress(newProgress);
                selected.setRemarks(newRemarks);

                movieProgressTableView.refresh();

            } catch (NumberFormatException e) {
                System.out.println("Invalid progress input.");
            }
        }
    }
}