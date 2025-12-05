package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportController
{
    @javafx.fxml.FXML
    private TableView reportTableview;
    @javafx.fxml.FXML
    private TableColumn describtionCol;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn valueCol;
    @javafx.fxml.FXML
    private TableColumn itemCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void reportGobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void GenerateReportButton(ActionEvent actionEvent) {
    }
}