package com.example.movieproductionhouse.Delowar_2420208.Producer;

import com.example.movieproductionhouse.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class StudioResourcesController
{
    @javafx.fxml.FXML
    private TextField typeTextField;
    @javafx.fxml.FXML
    private TableColumn<StudioResource, String> resourceNameTableColumn;
    @javafx.fxml.FXML
    private TableView<StudioResource> studioResourcesTableView;
    @javafx.fxml.FXML
    private TableColumn<StudioResource, Integer> quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<StudioResource, String> typeTableColumn;
    @javafx.fxml.FXML
    private TextField resourceNameTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    ObservableList<StudioResource> resourceList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        resourceNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("resourceName"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));


        resourceList.addAll(
                new StudioResource("Camera", "Equipment", 5),
                new StudioResource("Green Screen", "Set", 2),
                new StudioResource("Lighting Kit", "Equipment", 3)
        );

        studioResourcesTableView.setItems(resourceList);
    }

    @javafx.fxml.FXML
    public void addResourceButtonOnAction(ActionEvent actionEvent) {
        String name = resourceNameTextField.getText();
        String type = typeTextField.getText();
        String quantityText = quantityTextField.getText();


        if (name.isEmpty() || type.isEmpty() || quantityText.isEmpty()) {
            System.out.println("Fillup all fields before adding.");
            return;
        }

        try {
            int quantity = Integer.parseInt(quantityText);
            StudioResource newResource = new StudioResource(name, type, quantity);
            resourceList.add(newResource);

            studioResourcesTableView.refresh();

            resourceNameTextField.clear();
            typeTextField.clear();
            quantityTextField.clear();

        } catch (NumberFormatException e) {
            System.out.println("Quantity must be a valid number.");
        }
    }

    @javafx.fxml.FXML
    public void goBPDBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/movieproductionhouse/Delowar_2420208/Producer/ProducerDashboardFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}