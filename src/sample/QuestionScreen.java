package sample;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public interface QuestionScreen {

    void back(MouseEvent e) throws Exception;

    void ask(ActionEvent e) throws Exception;
}


