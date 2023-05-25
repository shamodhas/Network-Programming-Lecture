package controller.client;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/17/2023
 * Time :10:34 AM
 */

public class ClientFormController {
    public JFXTextField txtSendingMessage;
    public JFXTextArea txtReservedMessage;
    Socket socket;
    DataOutputStream dataOutputStream;
    DataInputStream dataInputStream;
    public void initialize(){
        new Thread(() -> {
            try {
                socket = new Socket("localhost", 3125);
                txtReservedMessage.appendText("Client started..!");
                dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataInputStream = new DataInputStream(socket.getInputStream());
                String message = "";
                String reply = "";

                while (!message.equals("close")){
                    message = dataInputStream.readUTF();
                    txtReservedMessage.appendText("\n"+message);
                }
                dataInputStream.close();
                dataOutputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
    public void btnSendOnAction(ActionEvent actionEvent) {
        try {
            dataOutputStream.writeUTF(txtSendingMessage.getText());
            dataOutputStream.flush();
            txtSendingMessage.clear();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
