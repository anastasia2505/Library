package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddTypeBookController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_typebook_button;

    @FXML
    private TextField tf_type_book;

    @FXML
    private Button update_typebook_button;

    @FXML
    private TextField tf_id_type_book;

    @FXML
    private Label label_result;

    @FXML
    void initialize() {
        add_typebook_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();
            String answer_type_book = tf_type_book.getText().trim();
            if((!answer_type_book.equals(""))){
                dbHandler.addTypeBook(answer_type_book);
                label_result.setText("OK!");
            } else label_result.setText("Empty fields!");
        });

        update_typebook_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();
            String answer_id_type_book = tf_id_type_book.getText().trim();
            String answer_type_book = tf_type_book.getText().trim();
            if((!answer_type_book.equals(""))&&(!answer_id_type_book.equals(""))){
                int ans_id_typebook = Integer.valueOf(answer_id_type_book);
                dbHandler.updateTypeBook(answer_type_book, ans_id_typebook);
                label_result.setText("OK!");
            } else label_result.setText("Empty fields!");

        });
    }
}

