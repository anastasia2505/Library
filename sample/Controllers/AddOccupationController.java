package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.source.tree.UsesTree;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private TextField tf_id_occupation;

    @FXML
    private Button update_typeoccup_button;

    @FXML
    private Label label_result;

    @FXML
    void initialize() {
        add_typeoccup_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();
            String answer_type_occupation = tf_type_occupation.getText().trim();
            if((!answer_type_occupation.equals(""))){
                dbHandler.addOccupation(answer_type_occupation);
                label_result.setText("OK!");
            } else label_result.setText("Empty fields!");
        });

        update_typeoccup_button.setOnAction(event->{
            DatabaseHandler dbHandler = new DatabaseHandler();
            String answer_id_occupation = tf_id_occupation.getText().trim();
            String answer_type_occupation = tf_type_occupation.getText().trim();
            if((!answer_type_occupation.equals(""))&&(!answer_id_occupation.equals(""))){
                int ans_id_occupation = Integer.valueOf(answer_id_occupation);
                dbHandler.updateOccupation(answer_type_occupation,ans_id_occupation);
                label_result.setText("OK!");
            } else label_result.setText("Empty fields!");
        });

    }
}
