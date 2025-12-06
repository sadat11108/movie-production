package com.example.movieproductionhouse.Delowar_2420208.Producer;

import com.example.movieproductionhouse.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ContractsController
{
    @javafx.fxml.FXML
    private TableColumn<ContractItem, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ContractItem, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableView<ContractItem> contractTableView;
    @javafx.fxml.FXML
    private TableColumn<ContractItem, String> typeTableColumn;

    private ObservableList<ContractItem> contractList
            = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadData();
        contractTableView.setItems(contractList);
    }

    private void loadData() {
        contractList.add(new ContractItem("Actor A", "Talent", "Pending"));
        contractList.add(new ContractItem("Studio X", "Partnership", "Pending"));
        contractList.add(new ContractItem("Composer Y", "Music", "Pending"));
    }

    @javafx.fxml.FXML
    public void approveButtonOnAction(ActionEvent actionEvent) {
        ContractItem selected = contractTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("Select a contract first.");
            return;
        }

        selected.setStatus("Approved");
        contractTableView.refresh();
        showAlert("Contract Approved.");
    }

    @javafx.fxml.FXML
    public void rejectButtonOnAction(ActionEvent actionEvent) {
        ContractItem selected = contractTableView.getSelectionModel().getSelectedItem();


        if (selected == null) {
            showAlert("Select a contract first.");
            return;
        }

        selected.setStatus("Rejected");
        contractTableView.refresh();
        showAlert("Contract Rejected.");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
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