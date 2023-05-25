import java.io.*;
import java.net.Socket;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/25/2023
 * Time :3:50 PM
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("--------- client ---------");
        try {
            Socket socket = new Socket("localhost", 3125);

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String message = "";
            String reply = "";

            while (!message.equals("close")){
                reply = bufferedReader.readLine();
                dataOutputStream.writeUTF(reply);
                message = dataInputStream.readUTF();
                System.out.println("Server : "+message);
                dataOutputStream.flush();
            }
            dataInputStream.close();
            dataOutputStream.close();
            bufferedReader.close();
            socket.close();

            System.out.println("chat end..!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
