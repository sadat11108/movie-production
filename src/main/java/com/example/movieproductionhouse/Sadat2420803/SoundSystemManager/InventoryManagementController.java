package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryManagementController
{
    @javafx.fxml.FXML
    private TableView<Inventory> EquipmentTableview;
    @javafx.fxml.FXML
    private TextField equipmentNameTextField;
    @javafx.fxml.FXML
    private TextField serialNumberTextField;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private Label EquipmentManagementTableview;
    @javafx.fxml.FXML
    private TableColumn<Inventory,String> equipmentNameCol;
    @javafx.fxml.FXML
    private TableColumn<Inventory,Integer> serialCol;

    @javafx.fxml.FXML
    public void initialize() {
        equipmentNameCol.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        serialCol.setCellValueFactory(new PropertyValueFactory<>("equipmentSerial "));
    }

    @javafx.fxml.FXML
    public void additemButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("/com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}