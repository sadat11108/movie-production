package com.example.movieproductionhouse.Delowar_2420208.Director;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

public class EditScriptController
{
    @javafx.fxml.FXML
    private TextArea scriptEditorTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveScriptButtonOnAction(ActionEvent actionEvent) {
        String scriptText = scriptEditorTextArea.getText();

        if (scriptText == null || scriptText.isEmpty()) {
            showAlert("Empty Script", "Write something first, little one.");
            return;
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}