package com.example.movieproductionhouse.Delowar_2420208.Producer;

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
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MarketingPlansController
{
    @javafx.fxml.FXML
    private TableColumn<MarketingPlanItem, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MarketingPlanItem, String> movieTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MarketingPlanItem, String> StrategyTableColumn;
    @javafx.fxml.FXML
    private TextArea marketingPlansDetailsTextArea;
    @javafx.fxml.FXML
    private TableView<MarketingPlanItem> marketingPlansTableView;


    ObservableList<MarketingPlanItem> marketingPlanList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        movieTableColumn.setCellValueFactory(new PropertyValueFactory<>("movie"));
        StrategyTableColumn.setCellValueFactory(new PropertyValueFactory<>("strategy"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


        marketingPlanList.addAll(
                new MarketingPlanItem("History of 1971", "Digital Poster + Social Media Ads", "Pending"),
                new MarketingPlanItem("Toofan", "Trailer Release + Influencer Review", "Approved"),
                new MarketingPlanItem("Amar Bondhu Rashed", "Celebrity Interview + Teaser", "Pending")
        );

        marketingPlansTableView.setItems(marketingPlanList);

        marketingPlansTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldVal, newVal) -> {
            if (newVal != null) {
                marketingPlansDetailsTextArea.setText(
                        "Movie: " + newVal.getMovie() + "\n"
                                + "Strategy: " + newVal.getStrategy() + "\n"
                                + "Status: " + newVal.getStatus()
                );
            }
        });
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
        MarketingPlanItem selected = marketingPlansTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("Select a plan first.");
            return;
        }

        if (marketingPlansDetailsTextArea.getText().isEmpty()) {
            showAlert("Details cannot be empty.");
            return;
        }

        selected.setStatus("Updated");
        marketingPlansTableView.refresh();

        showAlert("Plan status updated.");
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