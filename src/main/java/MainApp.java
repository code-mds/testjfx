import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        MainApp.launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/Root.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("TITLE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
