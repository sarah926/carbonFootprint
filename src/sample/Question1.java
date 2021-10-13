package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

import javafx.scene.paint.Color;

public class Question1 extends Parent {
    @FXML
    Button vegan;
    @FXML
    Button vegetarian;
    @FXML
    Button meat;
    @FXML
    Button back;

    @FXML
    public void initialize() throws Exception {
        
    }
    public void askDiet(ActionEvent e) throws Exception {

       if(e.getSource()==vegan){
           CarbonCalculator.setDiet(CarbonCalculator.DietType.VEGAN);
       }
       else if(e.getSource()==vegetarian){
           CarbonCalculator.setDiet(CarbonCalculator.DietType.VEGETARIAN);
       }
       else{
           CarbonCalculator.setDiet(CarbonCalculator.DietType.MEAT);
       }

       Main.switchScreens("question2",vegan);

    }
    public void back(ActionEvent e) throws Exception{
        if(e.getSource()==back){
            Main.switchScreens("startScreen",back);
        }
    }




}
