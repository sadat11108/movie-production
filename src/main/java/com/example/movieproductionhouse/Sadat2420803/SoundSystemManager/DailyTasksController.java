package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class DailyTasksController
{
    @javafx.fxml.FXML
    private TableColumn<Task,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Task,String> taskNameCol;
    @javafx.fxml.FXML
    private TableView<Task> dailyTaskTableview;
    @javafx.fxml.FXML
    private TableColumn<Task,Double> timeCol;

    @javafx.fxml.FXML
    public void initialize() {
        taskNameCol.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
    }

    @javafx.fxml.FXML
    public void dailyTaskGobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("/com/example/movieproductionhouse/Sadat2420803/SoundSystemManager/DashboardSound"));
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