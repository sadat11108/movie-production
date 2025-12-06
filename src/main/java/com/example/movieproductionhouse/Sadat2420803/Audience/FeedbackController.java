package com.example.movieproductionhouse.Sadat2420803.Audience;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FeedbackController
{
    @javafx.fxml.FXML
    private TextField ratingTextField;
    @javafx.fxml.FXML
    private TableView<Feedback> movieTableview;
    @javafx.fxml.FXML
    private TableColumn<Feedback,String> movienameCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback,String> genreCol;
    @javafx.fxml.FXML
    private TextArea feedbackTextarea;
    @javafx.fxml.FXML
    private TableColumn<Feedback,Integer> releasedateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void feedbackgobackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example.movieproductionhouse/Sadat2420803/Audience/Dashboard"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();


        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void submitFeedbackButton(ActionEvent actionEvent) {
    }
}