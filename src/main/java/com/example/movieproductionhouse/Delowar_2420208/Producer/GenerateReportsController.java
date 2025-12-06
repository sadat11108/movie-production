package com.example.movieproductionhouse.Delowar_2420208.Producer;

import com.example.movieproductionhouse.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class GenerateReportsController
{
    @javafx.fxml.FXML
    private DatePicker reportStartDatePicker;
    @javafx.fxml.FXML
    private DatePicker ReportEndDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        reportStartDatePicker.setValue(LocalDate.now().minusDays(7));
        ReportEndDatePicker.setValue(LocalDate.now());

    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
        LocalDate startDate = reportStartDatePicker.getValue();
        LocalDate endDate = ReportEndDatePicker.getValue();

        if (startDate == null || endDate == null) {
            showAlert("Both start and end dates must be selected.");
            return;
        }

        if (endDate.isBefore(startDate)) {
            showAlert("End date cannot come before start date.");
            return;
        }

        String reportMessage = "Report generated for period";
        showAlert(reportMessage);
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