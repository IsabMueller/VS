package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernGeburtstagController {
    @FXML
    private Button btnBackSettings;
    @FXML
    private Pane GeburtstagChangePane;

    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("ProfilEinstellungen.fxml"));
       GeburtstagChangePane.getChildren().setAll(newPane);
    }
}
