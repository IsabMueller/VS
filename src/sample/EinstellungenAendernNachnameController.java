package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernNachnameController {
    @FXML
    private Pane NachnameChangePane;
    @FXML
    private Button btnBackSettings;

    /**
     *
     * @param event Änderung des Vor- bzw. Nachnamens
     * @throws IOException Anzeigen der GUI ProfilEinstellungen
     */

    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("ProfilEinstellungen.fxml"));
        NachnameChangePane.getChildren().setAll(newPane);
    }
}
