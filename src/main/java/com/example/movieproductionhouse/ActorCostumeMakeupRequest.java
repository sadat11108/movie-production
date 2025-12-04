package com.example.movieproductionhouse;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ActorCostumeMakeupRequest
{
    @javafx.fxml.FXML
    private TextArea notesTextArea;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn requestIdTableColumn;
    @javafx.fxml.FXML
    private ComboBox requestTypeComboBox;
    @javafx.fxml.FXML
    private TextArea itemDescriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn typeTableColumn;
    @javafx.fxml.FXML
    private TableView requestHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn itemTableColumn;
    @javafx.fxml.FXML
    private DatePicker requestDatePicker;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Button submitRequestButton;
    @javafx.fxml.FXML
    private Button backToDashboardButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void clearFormButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitRequestButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestDatePickerOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestTypeComboBoxOnAction(ActionEvent actionEvent) {
    }
}