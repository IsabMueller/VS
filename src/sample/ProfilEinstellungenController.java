package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ProfilEinstellungenController {

    @FXML
    private Button btnBackProfileinstellungen;
    @FXML
    private AnchorPane ProfileinstellungenPane;

    public void handleBtnBackProfileinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Einstellungen.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
}