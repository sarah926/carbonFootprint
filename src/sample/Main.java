package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public double total;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
        primaryStage.setTitle("Carbon Calculator");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
    public static void switchScreens(String fxml, Button button) throws Exception {
        Stage stage;
        Parent root = FXMLLoader.load(Main.class.getResource(fxml +".fxml"));
        stage = (Stage) button.getScene().getWindow();
        Scene scene = new Scene(root,500,400);
        stage.setScene(scene);
        stage.show();
    }
}
