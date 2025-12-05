package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class DailyTasksController
{
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn taskNameCol;
    @javafx.fxml.FXML
    private TableView dailyTaskTableview;
    @javafx.fxml.FXML
    private TableColumn timeCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dailyTaskGobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void completedButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void taskviewButton(ActionEvent actionEvent) {
    }
}