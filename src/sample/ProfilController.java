package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ProfilController {
    @FXML
    private AnchorPane profilPane;
    @FXML
    private Button btnBackProfil;

    public void handleBtnBackProfil(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Start.fxml"));
        profilPane.getChildren().setAll(newPane);
    }
}
