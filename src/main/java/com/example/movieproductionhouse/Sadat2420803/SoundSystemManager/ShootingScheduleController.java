package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ShootingScheduleController
{
    @javafx.fxml.FXML
    private ComboBox selectMoviecombBox;
    @javafx.fxml.FXML
    private TableColumn equipmentCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TableView shootingTableview;
    @javafx.fxml.FXML
    private DatePicker shootingDatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void requirementsGobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}