package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EinstellungenAendernPasswortController {

    @FXML
    private TextField tfPasswortWiederholen;
    @FXML
    private AnchorPane PasswortChangePane;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Button btnChangedPasswort;

    /**
     *
     * @param event Änderung des Passworts
     * @throws IOException Anzeigen des GUI "SicherheitsEinstellungen"
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/SicherheitsEinstellungen.fxml"));
        PasswortChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String UsernameEingabe;

    public TextField getTfChangedUsername() {
        return tfPasswortWiederholen;
    }

    public void submit(ActionEvent event) {
        UsernameEingabe = tfPasswortWiederholen.getText();
        System.out.println(UsernameEingabe);
    }
}
