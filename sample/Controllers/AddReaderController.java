package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddReaderController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_reader_button;

    @FXML
    private TextField tf_status;

    @FXML
    private TextField tf_nticket_reader;

    @FXML
    void initialize() {

        add_reader_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_status = tf_status.getText().trim();
            String answer_nticket_reader = tf_nticket_reader.getText().trim();

            if((!answer_status.equals("")) && (!answer_nticket_reader.equals(""))){
                Boolean ans_status = Boolean.valueOf(answer_status);
                int ans_nticket = Integer.valueOf(answer_nticket_reader);
                dbHandler.addReader(ans_status,ans_nticket);
            } else System.out.println("Пустое поле ответа!");
        });

    }
}
