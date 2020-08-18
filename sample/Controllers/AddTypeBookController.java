package sample.Controllers;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    void initialize() {
        add_typebook_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();
            String answer_type_book = tf_type_book.getText().trim();
            if((!answer_type_book.equals(""))){
                dbHandler.addTypeBook(answer_type_book);
            } else System.out.println("Пустое поле ответа!");
        });

    }
}

