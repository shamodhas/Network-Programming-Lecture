import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/25/2023
 * Time :3:50 PM
 */

public class Server {
    public static void main(String[] args) {
        System.out.println("--------- server ---------");
        try {
            ServerSocket serverSocket = new ServerSocket(3125);
            Socket socket = serverSocket.accept();

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String message = "";
            String reply = "";

            while (!message.equals("close")){
                message = dataInputStream.readUTF();
                System.out.println("Client : "+message);
                reply = bufferedReader.readLine();
                dataOutputStream.writeUTF(reply);
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
