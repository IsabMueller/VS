package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EinstellungenAendernEmailController {
    @FXML
    private AnchorPane EmailChangePane;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Button btnChangedEmail;

    /**
     *
     * @param event Änderung der Sicherheitseinstellungen (Änderung Mail-Adresse)
     * @throws IOException Anzeigen des GUI Sicherheitseinstellungen
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/SicherheitsEinstellungen.fxml"));
        EmailChangePane.getChildren().setAll(newPane);
    }
//Halo
}
