package com.example.movieproductionhouse.Delowar_2420208.Director;

import com.example.movieproductionhouse.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class DailyReportsController
{
    @javafx.fxml.FXML
    private TableView<DailyReportItem> shottingReportsTableView;
    @javafx.fxml.FXML
    private TableColumn<DailyReportItem, String> dateTableView;
    @javafx.fxml.FXML
    private TextArea reportDetailsTextArea;
    @javafx.fxml.FXML
    private TableColumn<DailyReportItem, String> reportIdTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        reportIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        dateTableView.setCellValueFactory(new PropertyValueFactory<>("date"));
        loadRorts();
        shottingReportsTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldVal, newVal) -> {
                    if (newVal != null) {
                        reportDetailsTextArea.setText(newVal.getDetails());
                    }
                }
        );
    }

    private void loadRorts() {
        shottingReportsTableView.getItems().addAll(
                new DailyReportItem("OOP1", "2025-12-03", "All scenes completed. Weather was good."),
                new DailyReportItem("OOP2", "2025-12-04", "Actor absent. Used backup schedule.")
        );
    }


    @javafx.fxml.FXML
    public void saveRemarksButtonOnAction(ActionEvent actionEvent) {
        DailyReportItem selected = shottingReportsTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            System.out.println("No report selected");
            return;
        }

        String newRemarks = reportDetailsTextArea.getText();
        selected.setDetails(newRemarks);

        System.out.println("Remarks saved for report");
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