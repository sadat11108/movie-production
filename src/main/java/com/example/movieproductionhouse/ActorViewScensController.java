package com.example.movieproductionhouse;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ActorViewScensController {
    @javafx.fxml.FXML
    private TableColumn sceneNumberTableColumn;
    @javafx.fxml.FXML
    private TableColumn shootingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn locationTableColumn;
    @javafx.fxml.FXML
    private TextArea dialogueTextArea;
    @javafx.fxml.FXML
    private TableColumn sceneDescriptionTableColumn;
    @javafx.fxml.FXML
    private Label selectedSceneLabel;
    @javafx.fxml.FXML
    private TableColumn movieTitleTableColumn;
    @javafx.fxml.FXML
    private TableView scenesTableView;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Button viewSceneDetailsButton;
    @javafx.fxml.FXML
    private Button backToDashboardButton;

    @javafx.fxml.FXML
    public void viewSceneDetailsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void refreshScenesButtonOnAction(ActionEvent actionEvent) {
    }
}
