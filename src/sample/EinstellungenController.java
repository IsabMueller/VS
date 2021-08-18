package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EinstellungenController {
    @FXML
    private Button btnKategorienVerwalten;
    @FXML
    private AnchorPane einstellungenPane;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Button btnProfileinstellungen;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnSicherheitseinstellungen;

    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnProfilEinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Profileinstellungen.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnKategorienVerwalten(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("KategorienVerwalten.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnSicherheitseinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Sicherheitseinstellungen.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }
}
