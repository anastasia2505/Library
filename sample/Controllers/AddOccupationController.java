package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.source.tree.UsesTree;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddOccupationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_typeoccup_button;

    @FXML
    private TextField tf_type_occupation;

    @FXML
    void initialize() {
        add_typeoccup_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();
            String answer_type_occupation = tf_type_occupation.getText().trim();
            if((!answer_type_occupation.equals(""))){
                dbHandler.addOccupation(answer_type_occupation);
            } else System.out.println("Пустое поле ответа!");
        });

    }
}
