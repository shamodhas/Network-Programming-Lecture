import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/23/2023
 * Time :4:38 PM
 */

public class AppInitializer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("Log.fxml"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
