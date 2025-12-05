package com.example.movieproductionhouse.Delowar_2420208.Director;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class CrewMessagesController
{
    @javafx.fxml.FXML
    private TableView<CrewItem> crewInfoTableView;
    @javafx.fxml.FXML
    private TableColumn<CrewItem, String> nameTableColumn;
    @javafx.fxml.FXML
    private TextArea writeMessageTextArea;
    @javafx.fxml.FXML
    private TableColumn<CrewItem, String> roleTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        roleTableColumn.setCellValueFactory(new PropertyValueFactory<>("role"));

        crewInfoTableView.getItems().addAll(
                new CrewItem("Rahim", "Camera Operator"),
                new CrewItem("Abul","Lighting Technician"),
                new CrewItem("Mina", "Makeup Artist"),
                new CrewItem("Ali", "Sound Engineer")
        );
    }

    @javafx.fxml.FXML
    public void sendMessageButtonOnAction(ActionEvent actionEvent) {
        CrewItem selectedCrew = crewInfoTableView.getSelectionModel().getSelectedItem();
        String message = writeMessageTextArea.getText();

        if (message.isEmpty()) {
            showAlert("Empty Message", "Write something before sending.");
            return;
        }

        showAlert("Message Sent", "Your message has been sent");


        writeMessageTextArea.clear();
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}