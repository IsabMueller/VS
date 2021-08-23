package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class EinstellungenAendernPasswortController {

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
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("SicherheitsEinstellungen.fxml"));
        PasswortChangePane.getChildren().setAll(newPane);
    }
}
