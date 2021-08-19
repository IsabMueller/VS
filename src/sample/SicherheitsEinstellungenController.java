package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SicherheitsEinstellungenController {
    @FXML
    private Button btnChangePasswort;
    @FXML
    private Button btnChangeEmail;
    @FXML
    private Button btnBackSicherheitseinstellungen;
    @FXML
    private AnchorPane SicherheitseinstellungenPane;

    public void handleBtnBackSicherheitseinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Einstellungen.fxml"));
        SicherheitseinstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnChangeEmail(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("EinstellungenAendernEmail.fxml"));
        SicherheitseinstellungenPane.getChildren().setAll(newPane);
    }


    public void handleBtnChangePasswort(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("EinstellungenAendernPasswort.fxml"));
        SicherheitseinstellungenPane.getChildren().setAll(newPane);
    }
}
