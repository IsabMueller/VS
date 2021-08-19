package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ProfilEinstellungenController {

    @FXML
    private Button btnChangeHausnummer;
    @FXML
    private Button btnChangeStadt;
    @FXML
    private Button btnChangePostleitzahl;
    @FXML
    private Button btnChangeLand;
    @FXML
    private Button btnChangeStraße;
    @FXML
    private Button btnChangeNachname;
    @FXML
    private Button btnChangeVorname;
    @FXML
    private Button btnChangeUsername;
    @FXML
    private Button btnChangeGeburtstag;
    @FXML
    private TextField tfUsernameSet;
    @FXML
    private Button btnBackProfileinstellungen;
    @FXML
    private AnchorPane ProfileinstellungenPane;

    public void handleBtnBackProfileinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Einstellungen.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
}
