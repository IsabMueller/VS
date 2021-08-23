package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UebersichtController {

    @FXML
    private Button btnTagesübersicht;
    @FXML
    private Button btnMonatsübersicht;
    @FXML
    private Button btnWochenübersicht;
    @FXML
    private Button btnJahresübersicht;
    @FXML
    private AnchorPane uebersichtPane;
    @FXML
    private Button btnBackUebersicht;

    /**
     * Controller für das Anzeigen der einzelnen Übersichtseinstellungen (Tages-, Wochen-, Monats- und Jahresansicht)
     * @param event
     * @throws IOException
     */
    public void handleBtnBackUebersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }

    public void handleBtnTagesübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("TagesÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }

    public void handleBtnWochenübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("WochenÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }

    public void handleBtnMonatsübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("MonatsÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }

    public void handleBtnJahresübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("JahresÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }
}
