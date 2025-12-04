package com.example.movieproductionhouse.Tazwar_2310259.Actor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;

public class ActorCostumeMakeupRequest {

    @FXML
    private DatePicker requestDatePicker;

    @FXML
    private ComboBox<String> requestTypeComboBox;

    @FXML
    private TextArea itemDescriptionTextArea;

    @FXML
    private TextArea notesTextArea;

    @FXML
    private Label statusLabel;

    @FXML
    private Button submitRequestButton;

    @FXML
    private Button backToDashboardButton;

    @FXML
    private TableView<CostumeRequest> requestHistoryTableView;

    @FXML
    private TableColumn<CostumeRequest, String> requestIdTableColumn;

    @FXML
    private TableColumn<CostumeRequest, LocalDate> dateTableColumn;

    @FXML
    private TableColumn<CostumeRequest, String> typeTableColumn;

    @FXML
    private TableColumn<CostumeRequest, String> itemTableColumn;

    @FXML
    private TableColumn<CostumeRequest, String> statusTableColumn;

    private ObservableList<CostumeRequest> requestList = FXCollections.observableArrayList();
    private int requestCounter = 1;

    @FXML
    public void initialize() {
        // Initialize ComboBox
        requestTypeComboBox.setItems(FXCollections.observableArrayList(
                "Costume", "Makeup", "Both", "Accessories", "Wig/Hair", "Special Effects Makeup"
        ));

        // Set up table columns
        requestIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        itemTableColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Load request history
        loadRequestHistory();
        requestHistoryTableView.setItems(requestList);

        statusLabel.setText("");
    }

    private void loadRequestHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader("costume_requests.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data.length >= 5) {
                    CostumeRequest request = new CostumeRequest(
                            data[0], // request ID
                            LocalDate.parse(data[1]), // date
                            data[2], // type
                            data[3], // item
                            data[4]  // status
                    );
                    requestList.add(request);

                    // Update counter
                    try {
                        int id = Integer.parseInt(data[0].replace("REQ", ""));
                        if (id >= requestCounter) {
                            requestCounter = id + 1;
                        }
                    } catch (NumberFormatException e) {
                        // Ignore
                    }
                }
            }
        } catch (IOException e) {
            // File doesn't exist yet
        }
    }

    @FXML
    void requestDatePickerOnAction(ActionEvent event) {
        // Date selected
    }

    @FXML
    void requestTypeComboBoxOnAction(ActionEvent event) {
        // Type selected
    }

    @FXML
    void submitRequestButtonOnAction(ActionEvent event) {
        // Validate fields
        if (requestDatePicker.getValue() == null) {
            showError("Please select a date!");
            return;
        }

        if (requestTypeComboBox.getValue() == null || requestTypeComboBox.getValue().isEmpty()) {
            showError("Please select a request type!");
            return;
        }

        if (itemDescriptionTextArea.getText().trim().isEmpty()) {
            showError("Please describe the items needed!");
            return;
        }

        // Create new request
        String requestId = "REQ" + String.format("%03d", requestCounter++);
        LocalDate date = requestDatePicker.getValue();
        String type = requestTypeComboBox.getValue();
        String item = itemDescriptionTextArea.getText().trim();
        String status = "Pending";

        CostumeRequest newRequest = new CostumeRequest(requestId, date, type, item, status);
        requestList.add(newRequest);

        // Save to file
        saveRequestToFile(newRequest);

        statusLabel.setText("Request Submitted Successfully! Request ID: " + requestId);
        statusLabel.setStyle("-fx-background-color: #90EE90; -fx-padding: 5;");

        // Show success alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Request Submitted");
        alert.setContentText("Your costume/makeup request has been submitted successfully!\nRequest ID: " + requestId);
        alert.showAndWait();

        // Clear form
        clearForm();
    }

    private void saveRequestToFile(CostumeRequest request) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("costume_requests.txt", true))) {
            writer.write(request.getRequestId() + "|" +
                    request.getDate() + "|" +
                    request.getType() + "|" +
                    request.getItem().replace("\n", " ") + "|" +
                    request.getStatus() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearForm() {
        requestDatePicker.setValue(null);
        requestTypeComboBox.setValue(null);
        itemDescriptionTextArea.clear();
        notesTextArea.clear();
    }

    private void showError(String message) {
        statusLabel.setText(message);
        statusLabel.setStyle("-fx-background-color: #FFB6C1; -fx-padding: 5;");

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Validation Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void backToDashboardButtonOnAction(ActionEvent event) {
        loadScene(event, "ActorDashboardView.fxml", "Actor Dashboard");
    }

    private void loadScene(ActionEvent event, String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            statusLabel.setText("Error loading dashboard!");
        }
    }

    // Inner class for CostumeRequest data model
    public static class CostumeRequest {
        private String requestId;
        private LocalDate date;
        private String type;
        private String item;
        private String status;

        public CostumeRequest(String requestId, LocalDate date, String type, String item, String status) {
            this.requestId = requestId;
            this.date = date;
            this.type = type;
            this.item = item;
            this.status = status;
        }

        // Getters
        public String getRequestId() { return requestId; }
        public LocalDate getDate() { return date; }
        public String getType() { return type; }
        public String getItem() { return item; }
        public String getStatus() { return status; }

        // Setters
        public void setRequestId(String requestId) { this.requestId = requestId; }
        public void setDate(LocalDate date) { this.date = date; }
        public void setType(String type) { this.type = type; }
        public void setItem(String item) { this.item = item; }
        public void setStatus(String status) { this.status = status; }
    }
}