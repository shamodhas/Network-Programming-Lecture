package controller; /**
 * Created By shamodha_s_rathnamalala
 * Date : 5/23/2023
 * Time :4:37 PM
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatController {
    @FXML
    private TextArea txtArea;
    @FXML
    private TextField txtMessage;

    public static String name;
    DataOutputStream dataOutputStream;

    public void initialize() throws IOException {
        Socket socket = new Socket("localhost", 1234);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
         dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(name);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()){
                    try {
                        String message = dataInputStream.readUTF();
                        txtArea.appendText("\n"+name+" : "+message);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @FXML
    void btn(ActionEvent event) throws IOException {
        dataOutputStream.writeUTF(txtMessage.getText());
        dataOutputStream.flush();
        txtMessage.clear();
    }

}

