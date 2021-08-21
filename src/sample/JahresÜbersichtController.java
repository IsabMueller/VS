package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class JahresÜbersichtController {
    @FXML
    private Button btnBackTagesübersicht;
    @FXML
    private AnchorPane JahresÜbersichtPane;

    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Uebersicht.fxml"));
        JahresÜbersichtPane.getChildren().setAll(newPane);
    }
}
