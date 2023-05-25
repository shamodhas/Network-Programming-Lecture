package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/23/2023
 * Time :4:37 PM
 */

public class LogController {

    @FXML
    public TextField txtName;
    public AnchorPane anc;

    @FXML
    public void btn(ActionEvent actionEvent) throws IOException {
        String name = txtName.getText();
        ChatController.name = name;
        anc.getChildren().clear();
        anc.getChildren().add(FXMLLoader.load(this.getClass().getResource("../Chat.fxml")));
    }
}
