package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StartController {

    @FXML
    private Button btnTerminEdit;
    @FXML
    private Button btnTerminLoeschen;
    @FXML
    private Button btnDetailsTagesübersicht;
    @FXML
    private Button btnTracker;
    @FXML
    private Button btnLogout;
    @FXML
    private Button btnProfil;
    @FXML
    private Button btnUebersicht;
    @FXML
    private Button btnEinstellungen;
    @FXML
    private Button btnAdressbuch;
    @FXML
    private AnchorPane startPane;
    @FXML
    private Button btnTerminNew;

    //Aufrufen der TerminNeu.fxml//
    public void handleBtnTerminNew(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("TerminNeu.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnProfil(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Profil.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnUebersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Uebersicht.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnAdressbuch(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Adressbuch.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnEinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Einstellungen.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnTerminEdit(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("TerminBearbeiten.fxml"));
        startPane.getChildren().setAll(newPane);
    } //änderung
}


