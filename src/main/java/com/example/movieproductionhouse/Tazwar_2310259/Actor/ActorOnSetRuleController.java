package com.example.movieproductionhouse.Tazwar_2310259.Actor;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ActorOnSetRuleController {

    @FXML
    private ListView<String> categoriesListView;

    @FXML
    private TextArea rulesTextArea;

    @FXML
    private TextArea safetyProtocolsTextArea;

    private Map<String, String> rulesMap = new HashMap<>();

    @FXML
    public void initialize() {
        // Initialize categories
        categoriesListView.setItems(FXCollections.observableArrayList(
                "General Conduct",
                "Punctuality and Time Management",
                "Dress Code and Wardrobe",
                "Photography and Social Media",
                "Communication Protocol",
                "Equipment Handling",
                "Emergency Procedures",
                "Confidentiality and NDAs"
        ));

        // Load rules data
        loadRulesData();
        loadSafetyProtocols();

        // Add selection listener
        categoriesListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        displayRulesForCategory(newValue);
                    }
                }
        );

        // Select first category by default
        if (!categoriesListView.getItems().isEmpty()) {
            categoriesListView.getSelectionModel().select(0);
        }
    }

    private void loadRulesData() {
        // Initialize with default rules
        rulesMap.put("General Conduct",
                "ON-SET BEHAVIOR GUIDELINES:\n\n" +
                        "1. Be Professional and Respectful\n" +
                        "   • Treat all cast and crew members with respect\n" +
                        "   • Follow the director's instructions at all times\n" +
                        "   • Maintain a positive and collaborative attitude\n\n" +
                        "2. No Alcohol or Drugs\n" +
                        "   • Zero tolerance policy for alcohol and drugs on set\n" +
                        "   • Violation will result in immediate removal\n\n" +
                        "3. Mobile Phone Usage\n" +
                        "   • Keep phones on silent during shooting\n" +
                        "   • Use phones only during breaks\n" +
                        "   • No phone use in shooting areas\n\n" +
                        "4. Cleanliness\n" +
                        "   • Clean up after yourself in dressing rooms\n" +
                        "   • Keep common areas tidy\n" +
                        "   • Dispose of waste properly");

        rulesMap.put("Punctuality and Time Management",
                "TIME MANAGEMENT RULES:\n\n" +
                        "1. Call Times\n" +
                        "   • Arrive at least 15 minutes before your call time\n" +
                        "   • Check your call sheet the night before\n" +
                        "   • Set multiple alarms to ensure punctuality\n\n" +
                        "2. Notification of Delays\n" +
                        "   • Notify production immediately if you will be late\n" +
                        "   • Contact: Production Manager or Assistant Director\n" +
                        "   • Provide estimated arrival time\n\n" +
                        "3. Ready When Called\n" +
                        "   • Be fully prepared (makeup, wardrobe) for your scene\n" +
                        "   • Stay near set when your scene is approaching\n" +
                        "   • Don't leave set without permission\n\n" +
                        "4. Break Times\n" +
                        "   • Return promptly from breaks\n" +
                        "   • Respect the production schedule");

        rulesMap.put("Dress Code and Wardrobe",
                "WARDROBE AND COSTUME GUIDELINES:\n\n" +
                        "1. Arrival Clothing\n" +
                        "   • Wear appropriate clothing for hair and makeup\n" +
                        "   • Avoid clothing that will leave marks on skin\n" +
                        "   • Come prepared for quick changes\n\n" +
                        "2. Costume Care\n" +
                        "   • Do NOT wear your costume off-set\n" +
                        "   • Return all costumes to wardrobe at end of day\n" +
                        "   • Report any damage immediately\n" +
                        "   • Do not eat or drink in costume unless approved\n\n" +
                        "3. Personal Items\n" +
                        "   • Keep personal items separate from costumes\n" +
                        "   • Label your belongings\n" +
                        "   • Production is not responsible for lost items");

        rulesMap.put("Photography and Social Media",
                "PHOTOGRAPHY AND SOCIAL MEDIA POLICY:\n\n" +
                        "1. No Unauthorized Photography\n" +
                        "   • No photos or videos on set without permission\n" +
                        "   • This includes behind-the-scenes content\n" +
                        "   • Violations may result in removal from production\n\n" +
                        "2. Social Media Restrictions\n" +
                        "   • Do NOT post about the production without approval\n" +
                        "   • No sharing of plot details or script information\n" +
                        "   • No tagging of locations during filming\n\n" +
                        "3. Approved Content Only\n" +
                        "   • All official photos must be approved by production\n" +
                        "   • Wait for official release before sharing\n" +
                        "   • Respect embargo dates\n\n" +
                        "4. Privacy\n" +
                        "   • Respect the privacy of other cast and crew\n" +
                        "   • Do not photograph others without permission");

        rulesMap.put("Communication Protocol",
                "COMMUNICATION GUIDELINES:\n\n" +
                        "1. Chain of Command\n" +
                        "   • Address director and department heads respectfully\n" +
                        "   • Use proper channels for questions or concerns\n" +
                        "   • Don't interrupt active filming\n\n" +
                        "2. On-Set Etiquette\n" +
                        "   • Keep noise levels down between takes\n" +
                        "   • Listen carefully to all instructions\n" +
                        "   • Ask questions if you're unsure about anything\n\n" +
                        "3. Reporting to Set\n" +
                        "   • Check in with 2nd AD upon arrival\n" +
                        "   • Report to your designated area when called\n" +
                        "   • Stay within earshot of your name being called");

        rulesMap.put("Equipment Handling",
                "EQUIPMENT SAFETY RULES:\n\n" +
                        "1. Do Not Touch\n" +
                        "   • Never touch camera equipment\n" +
                        "   • Do not adjust lighting equipment\n" +
                        "   • Keep away from technical areas unless authorized\n\n" +
                        "2. Props and Set Pieces\n" +
                        "   • Be careful around props and set decorations\n" +
                        "   • Only use props as directed\n" +
                        "   • Report any damaged props immediately\n\n" +
                        "3. Safety Hazards\n" +
                        "   • Report any safety hazards immediately\n" +
                        "   • Do not attempt to fix equipment issues\n" +
                        "   • Follow crew instructions regarding equipment areas");

        rulesMap.put("Emergency Procedures",
                "EMERGENCY PROTOCOLS:\n\n" +
                        "1. Emergency Exits\n" +
                        "   • Know the location of all emergency exits\n" +
                        "   • Keep exits clear at all times\n" +
                        "   • Never block emergency pathways\n\n" +
                        "2. Evacuation Procedures\n" +
                        "   • Follow evacuation procedures if alarm sounds\n" +
                        "   • Proceed to designated assembly points\n" +
                        "   • Do not re-enter until given all-clear\n\n" +
                        "3. Injury Reporting\n" +
                        "   • Report ALL injuries immediately to production\n" +
                        "   • Even minor injuries must be documented\n" +
                        "   • First aid kits are located: [Check with production]\n\n" +
                        "4. Safety Officer\n" +
                        "   • Follow safety officer instructions at all times\n" +
                        "   • Safety takes priority over filming");

        rulesMap.put("Confidentiality and NDAs",
                "CONFIDENTIALITY AGREEMENT:\n\n" +
                        "1. Non-Disclosure\n" +
                        "   • Do not discuss plot details in public\n" +
                        "   • Keep all script information confidential\n" +
                        "   • Sign and honor all NDA agreements\n\n" +
                        "2. Unreleased Content\n" +
                        "   • Do not share unreleased footage or images\n" +
                        "   • Do not discuss filming locations publicly\n" +
                        "   • Wait for official announcements\n\n" +
                        "3. Intellectual Property\n" +
                        "   • Respect the intellectual property of production\n" +
                        "   • All content belongs to the production company\n" +
                        "   • Do not create unauthorized derivative works\n\n" +
                        "4. Legal Consequences\n" +
                        "   • Violations may result in legal action\n" +
                        "   • Financial penalties may apply\n" +
                        "   • Future employment may be affected");

        // Try to load from file (if custom rules exist)
        try (BufferedReader reader = new BufferedReader(new FileReader("onset_rules.txt"))) {
            String category = null;
            StringBuilder rules = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {
                    if (category != null) {
                        rulesMap.put(category, rules.toString());
                    }
                    category = line.substring(1, line.length() - 1);
                    rules = new StringBuilder();
                } else if (!line.trim().isEmpty()) {
                    rules.append(line).append("\n");
                }
            }
            if (category != null) {
                rulesMap.put(category, rules.toString());
            }
        } catch (IOException e) {
            // Use default rules
        }
    }

    private void loadSafetyProtocols() {
        String safetyText =
                "═══════════════════════════════════════════════════════\n" +
                        "              SAFETY PROTOCOLS AND GUIDELINES\n" +
                        "═══════════════════════════════════════════════════════\n\n" +
                        "1. FIRE SAFETY\n" +
                        "   ✓ Location of fire extinguishers: Check with crew\n" +
                        "   ✓ Emergency exits are marked with green signs\n" +
                        "   ✓ Do NOT block emergency exits\n" +
                        "   ✓ Report any fire hazards immediately\n" +
                        "   ✓ Know the evacuation route from your location\n\n" +
                        "2. ELECTRICAL SAFETY\n" +
                        "   ✓ Do not touch exposed wiring or cables\n" +
                        "   ✓ Report any electrical issues to crew immediately\n" +
                        "   ✓ Keep water and liquids away from electrical equipment\n" +
                        "   ✓ Do not overload power outlets\n\n" +
                        "3. PHYSICAL SAFETY\n" +
                        "   ✓ Wear appropriate safety gear for action scenes\n" +
                        "   ✓ Follow stunt coordinator instructions EXACTLY\n" +
                        "   ✓ Report any physical discomfort immediately\n" +
                        "   ✓ Do not attempt stunts without proper training\n" +
                        "   ✓ Warm up before physical scenes\n\n" +
                        "4. HEALTH PROTOCOLS\n" +
                        "   ✓ Follow all health screening procedures\n" +
                        "   ✓ Report any illness to production\n" +
                        "   ✓ Maintain personal hygiene standards\n" +
                        "   ✓ Wash hands frequently\n\n" +
                        "5. WEATHER SAFETY (Outdoor Shoots)\n" +
                        "   ✓ Stay hydrated in hot weather\n" +
                        "   ✓ Seek shelter during severe weather\n" +
                        "   ✓ Wear appropriate clothing for conditions\n" +
                        "   ✓ Report heat exhaustion symptoms immediately\n\n" +
                        "6. EMERGENCY CONTACTS\n" +
                        "   ✓ Production Manager: [Contact Number]\n" +
                        "   ✓ Medical Services: [Contact Number]\n" +
                        "   ✓ Security: [Contact Number]\n" +
                        "   ✓ Local Emergency: 911\n\n" +
                        "═══════════════════════════════════════════════════════\n" +
                        "REMEMBER: Safety is ALWAYS the top priority!\n" +
                        "When in doubt, ask. Never take unnecessary risks.\n" +
                        "═══════════════════════════════════════════════════════";

        safetyProtocolsTextArea.setText(safetyText);
    }

    private void displayRulesForCategory(String category) {
        String rules = rulesMap.get(category);
        if (rules != null) {
            rulesTextArea.setText(rules);
        } else {
            rulesTextArea.setText("No rules available for this category.");
        }
    }

    @FXML
    void backToDashboardButtonOnAction(ActionEvent event) {
        loadScene(event, "ActorDashboardView.fxml", "Actor Dashboard");
    }

    private void loadScene(ActionEvent event, String fxmlFile, String title) {
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
}
