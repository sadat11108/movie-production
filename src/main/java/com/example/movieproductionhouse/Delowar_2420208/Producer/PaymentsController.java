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
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentsController
{
    @javafx.fxml.FXML
    private TableView<PaymentItem> pendingPaymentsTableView;
    @javafx.fxml.FXML
    private TableColumn<PaymentItem, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentItem, String> paymentStatusTableColumn;
    @javafx.fxml.FXML
    private TextArea paymentDetailsTextArea;
    @javafx.fxml.FXML
    private TableColumn<PaymentItem, String> payAmountTableColumn;

    ObservableList<PaymentItem> paymentList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        payAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("payAmount"));
        paymentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));


        paymentList.addAll(
                new PaymentItem("Milon", 2500, "Pending"),
                new PaymentItem("Abdul", 1800, "Pending"),
                new PaymentItem("Asif", 3200, "Pending")
        );

        pendingPaymentsTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldItem, newItem) -> {
                    if (newItem != null) {
                        paymentDetailsTextArea.setText(
                                "Name: " + newItem.getName() + "\n" +
                                        "Amount: " + newItem.getPayAmount() + "\n" +
                                        "Status: " + newItem.getPaymentStatus()
                        );
                    }

                }
        );
    }

    @javafx.fxml.FXML
    public void payButtonOnAction(ActionEvent actionEvent) {
        PaymentItem selected = pendingPaymentsTableView.getSelectionModel().getSelectedItem();


        if (selected != null) {
            selected.setPaymentStatus("Paid");
            pendingPaymentsTableView.refresh();
            paymentDetailsTextArea.setText("Payment completed");
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