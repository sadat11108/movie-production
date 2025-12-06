package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SoundEditigController
{
    @javafx.fxml.FXML
    private CheckBox echoCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectSoundFileComboBox;
    @javafx.fxml.FXML
    private CheckBox noiseReductionCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectSoundFileComboBox.getItems().addAll("Background sounds","Dialogue recordings","Music tracks");
    }

    @javafx.fxml.FXML
    public void editingGobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("/com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void loadFileButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveFileButton(ActionEvent actionEvent) {
    }
}