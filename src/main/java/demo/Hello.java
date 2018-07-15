package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");

        AnchorPane root = new AnchorPane() {{
            Button button1 = new Button("Hello1");
            Button button2 = new Button("Hello2");
            getChildren().addAll(button1, button2);
            AnchorPane.setTopAnchor(button1, 20.0 /* offset to top */);
            AnchorPane.setTopAnchor(button2, 40.0 /* offset to top */);
        }};

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}