package com.example.movieproductionhouse.Delowar_2420208.Producer;

import com.example.movieproductionhouse.HelloApplication;
import javafx.beans.binding.ObjectBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class MoviePerformanceController
{
    @javafx.fxml.FXML
    private TableView<MoviePerformanceItem> moviePerformanceTableView;
    @javafx.fxml.FXML
    private TableColumn<MoviePerformanceItem, String> movieTableColumn;
    @javafx.fxml.FXML
    private TextArea writeReviewTextArea;
    @javafx.fxml.FXML
    private TableColumn<MoviePerformanceItem, String> ratingTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MoviePerformanceItem, String> revenueTableColumn;

    ObservableList<MoviePerformanceItem> performanceList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        movieTableColumn.setCellValueFactory(new PropertyValueFactory<>("movie"));
        revenueTableColumn.setCellValueFactory(new PropertyValueFactory<>("revenue"));
        ratingTableColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));

        performanceList.addAll(
                new MoviePerformanceItem("History of 1971", "2M", "8.4"),
                new MoviePerformanceItem("Toofan", "3", "7.9"),
                new MoviePerformanceItem("Amar Bondhu Rashed", "1M", "9.1")
        );
    }

    @javafx.fxml.FXML
    public void saveReviewButtonOnAction(ActionEvent actionEvent) {
        MoviePerformanceItem selected = moviePerformanceTableView.getSelectionModel().getSelectedItem();
        String review = writeReviewTextArea.getText().trim();

        if (selected == null) {
            showAlert("Select a movie before saving a review.");
            return;
        }

        if (review.isEmpty()) {
            showAlert("Write something before saving.");
            return;
        }

        showAlert("Review saved");
        writeReviewTextArea.clear();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void goBPDBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/movieproductionhouse/Delowar_2420208/Producer/ProducerDashboardFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}