package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StartController {

    @FXML
    private AnchorPane startPane;

    @FXML
    private Button btnTerminNew;

    public void handleBtnTerminNew(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("TerminNeu.fxml"));
        startPane.getChildren().setAll(newPane);
    }
}
