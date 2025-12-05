package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BudgetController
{
    @javafx.fxml.FXML
    private ComboBox categoryCombobox;
    @javafx.fxml.FXML
    private TextField enterAmountTextField;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private Label totalExpensesLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void budgetGobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void saveExpenseButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addExpenseButton(ActionEvent actionEvent) {
    }
}