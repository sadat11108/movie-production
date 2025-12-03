package com.example.movieproductionhouse.Delowar_2420208.Director;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ShootingScheduleController
{
    @javafx.fxml.FXML
    private TableColumn endTableColumn;
    @javafx.fxml.FXML
    private DatePicker endShootingDatePicker;
    @javafx.fxml.FXML
    private TableColumn locationTableColumn;
    @javafx.fxml.FXML
    private TableView showShootingScheduleTableView;
    @javafx.fxml.FXML
    private DatePicker startShootingDatePicker;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TableColumn startTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveScheduleButtonOnAction(ActionEvent actionEvent) {
    }
}