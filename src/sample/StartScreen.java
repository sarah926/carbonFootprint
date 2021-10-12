package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartScreen {
    @FXML
    Button startGame;


    public void started(ActionEvent event) throws Exception{
        Stage stage;

        Parent root = FXMLLoader.load(getClass().getResource("question1.fxml"));

        if(event.getSource()== startGame){

            System.out.println("clicked");
            stage = (Stage) startGame.getScene().getWindow();
            Scene scene = new Scene(root,500,400);
            stage.setScene(scene);
            stage.show();
        }


    }
}
