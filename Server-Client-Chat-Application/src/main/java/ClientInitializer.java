import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/17/2023
 * Time :10:55 AM
 */

public class ClientInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/views/client/ClientForm.fxml"))));
        stage.show();
    }
}
