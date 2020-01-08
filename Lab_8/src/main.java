import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application{

    Button submitBtn;
    TextArea textArea;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Main Window");
        submitBtn = new Button();
        submitBtn.setText("Submit");
        textArea = new TextArea();
        textArea.setMaxWidth(200);
        textArea.setMaxHeight(20);
        textArea.setLayoutX(20);

        StackPane layout = new StackPane();
        layout.getChildren().add(submitBtn);
        layout.getChildren().add(textArea);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
