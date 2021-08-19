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
    private Button btnChangeAdresse;
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

    public void handleBtnChangeAdresse(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("EinstellungenAendernAdresse.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnChangeUsername(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("EinstellungenAendernUsername.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnChangeNachname(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("EinstellungenAendernNachname.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnChangeVorname(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("EinstellungenAendernVorname.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }

    public void handleBtnChangeGeburtstag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("EinstellungenAendernGeburtstag.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
}
