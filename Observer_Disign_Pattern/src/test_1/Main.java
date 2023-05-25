package test_1;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/23/2023
 * Time :4:22 PM
 */

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        Client client1 = new Client("1");
        Client client2 = new Client("2");
        Client client3 = new Client("3");

        server.addObserver(client1);
        server.addObserver(client2);
        server.addObserver(client3);
//
//        client1.notifyMe();
//        client2.notifyMe();
//        client3.notifyMe();

        server.notification();
    }
}
