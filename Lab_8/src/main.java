import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application{

    Button submitBtn;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Main Window");
        submitBtn = new Button();
        submitBtn.setText("Submit");
    }
}
