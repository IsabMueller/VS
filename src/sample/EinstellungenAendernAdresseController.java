package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernAdresseController {
    @FXML
    private Pane adresseChangePane;
    @FXML
    private Button btnBackAdresseChange;

    /**
     *
     * @param event Änderung der Adresse
     * @throws IOException Anzeigen des UI Profil Einstellungen
     */
    public void handleBtnBackAdresseChange(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("ProfilEinstellungen.fxml"));
        adresseChangePane.getChildren().setAll(newPane);
    }
}
