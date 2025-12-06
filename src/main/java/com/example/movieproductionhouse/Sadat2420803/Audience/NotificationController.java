package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public class NotificationController
{
    @javafx.fxml.FXML
    private CheckBox SelectGenresSciFi;
    @javafx.fxml.FXML
    private CheckBox SelectGenresComedy;
    @javafx.fxml.FXML
    private CheckBox SelectGenresAction;
    @javafx.fxml.FXML
    private CheckBox SelectGenresDrama;
    @javafx.fxml.FXML
    private CheckBox SelectGenresHorror;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void notificationgobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/movieproductionhouse/Sadat2420803/Audience/Dashboard"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void SaveSubscriptionButton(ActionEvent actionEvent) {
    }
}