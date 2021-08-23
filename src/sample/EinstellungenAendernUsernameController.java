package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernUsernameController {
    @FXML
    private TextField tfChangedUsername;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Pane usernameChangePane;

    /**
     *
     * @param event Änderung des Nutzernamens (Username)
     * @throws IOException Anzeigen des GUI "ProfilEinstellungen"
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("ProfilEinstellungen.fxml"));
        usernameChangePane.getChildren().setAll(newPane);
    }
     //Textfeld Eingabe Auswerten
    String UsernameEingabe;

    public TextField getTfChangedUsername() {
        return tfChangedUsername;
    }

    public void submit(ActionEvent event) {
        UsernameEingabe = tfChangedUsername.getText();
        System.out.println(UsernameEingabe);
    }
}
