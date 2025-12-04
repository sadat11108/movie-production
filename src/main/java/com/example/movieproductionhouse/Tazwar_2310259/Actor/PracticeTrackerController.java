package com.example.movieproductionhouse.Tazwar_2310259.Actor;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;

public class PracticeTrackerController {

    @FXML
    private TableView<DialogueScene> scenesTableView;
    @FXML
    private TableColumn<DialogueScene, String> sceneNumberTableColumn;
    @FXML
    private TableColumn<DialogueScene, String> movieTitleTableColumn;
    @FXML
    private TableColumn<DialogueScene, String> sceneDescriptionTableColumn;
    @FXML
    private TableColumn<DialogueScene, String> practiceStatusTableColumn;
    @FXML
    private TableColumn<DialogueScene, String> lastPracticedTableColumn;

    @FXML
    private Label selectedSceneLabel;
    @FXML
    private Label progressLabel;
    @FXML
    private TextArea dialoguePreviewTextArea;

    private ObservableList<DialogueScene> scenesList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set up table columns
        sceneNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("sceneNumber"));
        movieTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("movieTitle"));
        sceneDescriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        practiceStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("practiceStatus"));
        lastPracticedTableColumn.setCellValueFactory(new PropertyValueFactory<>("lastPracticed"));

        // Load scenes
        loadDialogueScenes();
        scenesTableView.setItems(scenesList);

        // Add selection listener
        scenesTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        selectedSceneLabel.setText(newValue.getSceneNumber());
                        dialoguePreviewTextArea.setText(newValue.getDialoguePreview());
                    }
                }
        );

        updateProgressLabel();
    }

    private void loadDialogueScenes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("practice_tracker.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data.length >= 6) {
                    DialogueScene scene = new DialogueScene(
                            data[0], // scene number
                            data[1], // movie title
                            data[2], // description
                            data[3], // practice status
                            data[4], // last practiced
                            data[5]  // dialogue preview
                    );
                    scenesList.add(scene);
                }
            }
        } catch (IOException e) {
            createSampleDialogueScenes();
        }
    }

    private void createSampleDialogueScenes() {
        scenesList.add(new DialogueScene("1", "Action Movie", "Opening scene",
                "Not Practiced", "Never",
                "Character A: Hello there!\nCharacter B: Welcome to the show."));
        scenesList.add(new DialogueScene("2", "Action Movie", "Fight scene dialogue",
                "Completed", LocalDate.now().minusDays(2).toString(),
                "Character A: You won't get away!\nCharacter B: Try to stop me!"));
        scenesList.add(new DialogueScene("3", "Drama Movie", "Emotional confrontation",
                "In Progress", LocalDate.now().minusDays(5).toString(),
                "Character A: I can't believe you did this...\nCharacter B: I had no choice."));
    }

    @FXML
    void markAsPracticedButtonOnAction(ActionEvent event) {
        DialogueScene selected = scenesTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setPracticeStatus("Completed");
            selected.setLastPracticed(LocalDate.now().toString());
            scenesTableView.refresh();
            saveToFile();
            updateProgressLabel();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Scene " + selected.getSceneNumber() + " marked as practiced!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Selection");
            alert.setHeaderText(null);
            alert.setContentText("Please select a scene first!");
            alert.showAndWait();
        }
    }

    @FXML
    void viewDialogueButtonOnAction(ActionEvent event) {
        DialogueScene selected = scenesTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Full Dialogue - Scene " + selected.getSceneNumber());
            alert.setHeaderText("Movie: " + selected.getMovieTitle());

            TextArea textArea = new TextArea(selected.getDialoguePreview());
            textArea.setEditable(false);
            textArea.setWrapText(true);
            textArea.setMaxWidth(Double.MAX_VALUE);
            textArea.setMaxHeight(Double.MAX_VALUE);

            alert.getDialogPane().setContent(textArea);
            alert.showAndWait();
        }
    }

    @FXML
    void refreshListButtonOnAction(ActionEvent event) {
        scenesList.clear();
        loadDialogueScenes();
        updateProgressLabel();
    }

    private void updateProgressLabel() {
        long totalScenes = scenesList.size();
        long practicedScenes = scenesList.stream()
                .filter(scene -> "Completed".equals(scene.getPracticeStatus()))
                .count();

        int percentage = totalScenes > 0 ? (int)((practicedScenes * 100) / totalScenes) : 0;
        progressLabel.setText(percentage + "% (" + practicedScenes + "/" + totalScenes + ")");
    }

    private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("practice_tracker.txt"))) {
            for (DialogueScene scene : scenesList) {
                writer.write(scene.getSceneNumber() + "|" +
                        scene.getMovieTitle() + "|" +
                        scene.getDescription() + "|" +
                        scene.getPracticeStatus() + "|" +
                        scene.getLastPracticed() + "|" +
                        scene.getDialoguePreview() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void backToDashboardButtonOnAction(ActionEvent event) {
        switchScene(event, "ActorDashboard.fxml", "Actor Dashboard");
    }

    private void switchScene(ActionEvent event, String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Inner class for DialogueScene data model
    public static class DialogueScene {
        private String sceneNumber;
        private String movieTitle;
        private String description;
        private String practiceStatus;
        private String lastPracticed;
        private String dialoguePreview;

        public DialogueScene(String sceneNumber, String movieTitle, String description,
                             String practiceStatus, String lastPracticed, String dialoguePreview) {
            this.sceneNumber = sceneNumber;
            this.movieTitle = movieTitle;
            this.description = description;
            this.practiceStatus = practiceStatus;
            this.lastPracticed = lastPracticed;
            this.dialoguePreview = dialoguePreview;
        }

        // Getters
        public String getSceneNumber() { return sceneNumber; }
        public String getMovieTitle() { return movieTitle; }
        public String getDescription() { return description; }
        public String getPracticeStatus() { return practiceStatus; }
        public String getLastPracticed() { return lastPracticed; }
        public String getDialoguePreview() { return dialoguePreview; }

        // Setters
        public void setSceneNumber(String sceneNumber) { this.sceneNumber = sceneNumber; }
        public void setMovieTitle(String movieTitle) { this.movieTitle = movieTitle; }
        public void setDescription(String description) { this.description = description; }
        public void setPracticeStatus(String practiceStatus) { this.practiceStatus = practiceStatus; }
        public void setLastPracticed(String lastPracticed) { this.lastPracticed = lastPracticed; }
        public void setDialoguePreview(String dialoguePreview) { this.dialoguePreview = dialoguePreview; }
    }
}