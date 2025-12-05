package com.example.movieproductionhouse.Delowar_2420208.Producer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

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
}