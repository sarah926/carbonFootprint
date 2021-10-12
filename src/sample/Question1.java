package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Question1 extends Parent {
    @FXML
    Button vegan;
    @FXML
    Button vegetarian;
    @FXML
    Button meat;


    public void askDiet(ActionEvent e) throws Exception {
        Eat d = new Eat();
       if(e.getSource()==vegan){
           CarbonCalculator.setDiet(CarbonCalculator.DietType.VEGAN);
       }
       else if(e.getSource()==vegetarian){
           CarbonCalculator.setDiet(CarbonCalculator.DietType.VEGETARIAN);
       }
       else{
           CarbonCalculator.setDiet(CarbonCalculator.DietType.MEAT);
       }

        Stage stage;

        Parent root = FXMLLoader.load(getClass().getResource("question2.fxml"));

        stage = (Stage) vegan.getScene().getWindow();
        Scene scene = new Scene(root,500,400);
        stage.setScene(scene);
        stage.show();
    }


}
