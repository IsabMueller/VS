package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class KategorienVerwaltenController {
    @FXML
    private Button btnBackKategorienVerwalten;
    @FXML
    private AnchorPane KategorienVerwaltenPane;

    /**
     *
     * @param event Wechsel zum GUI "Einstellungen"
     * @throws IOException
     */
    public void handleBtnBackKategorienVerwalten(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Einstellungen.fxml"));
        KategorienVerwaltenPane.getChildren().setAll(newPane);
    }
}
