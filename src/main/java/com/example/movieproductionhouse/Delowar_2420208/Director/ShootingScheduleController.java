package com.example.movieproductionhouse.Delowar_2420208.Director;

import com.example.movieproductionhouse.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class ShootingScheduleController
{
    @javafx.fxml.FXML
    private TableColumn<ShootingScheduleItem, String> endTableColumn;
    @javafx.fxml.FXML
    private DatePicker endShootingDatePicker;
    @javafx.fxml.FXML
    private TableColumn<ShootingScheduleItem, String> locationTableColumn;
    @javafx.fxml.FXML
    private TableView<ShootingScheduleItem> showShootingScheduleTableView;
    @javafx.fxml.FXML
    private DatePicker startShootingDatePicker;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TableColumn<ShootingScheduleItem, String> startTableColumn;

    private ObservableList<ShootingScheduleItem> scheduleList
            = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        startTableColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endTableColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        showShootingScheduleTableView.setItems(scheduleList);

    }

    @javafx.fxml.FXML
    public void saveScheduleButtonOnAction(ActionEvent actionEvent) {
        if (startShootingDatePicker.getValue() != null && endShootingDatePicker.getValue() != null && locationTextField.getText().isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String start = startShootingDatePicker.getValue().format(formatter);
            String end = endShootingDatePicker.getValue().format(formatter);
            String location = locationTextField.getText();

            ShootingScheduleItem item = new ShootingScheduleItem(start, end, location);
            scheduleList.add(item);

            startShootingDatePicker.setValue(null);
            endShootingDatePicker.setValue(null);
            locationTextField.clear();
        }
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