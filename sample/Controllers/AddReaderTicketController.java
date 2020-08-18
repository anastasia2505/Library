package sample.Controllers;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddReaderTicketController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_rticket_button;

    @FXML
    private TextField tf_fname_reader;

    @FXML
    private TextField tf_date_of_birth;

    @FXML
    private TextField tf_occup_id;

    @FXML
    private TextField tf_id_rticket;

    @FXML
    private Button update_rticket_button;

    @FXML
    void initialize() {
        add_rticket_button.setOnAction(event ->{

            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_fname_reader = tf_fname_reader.getText().trim();
            String answer_dateofbirth = tf_date_of_birth.getText().trim();
            String answer_type_occup = tf_occup_id.getText().trim();

            if((!answer_fname_reader.equals("")) && (!answer_dateofbirth.equals(""))&&(!answer_type_occup.equals(""))){
                Date ans_date = Date.valueOf(answer_dateofbirth);
                int ans_occup_id = Integer.valueOf(answer_type_occup);
                dbHandler.addReaderTicket(answer_fname_reader,ans_date,ans_occup_id);
            } else System.out.println("Пустое поле ответа!");
        });
        update_rticket_button.setOnAction(event->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_id_rticket = tf_id_rticket.getText().trim();
            String answer_fname_reader = tf_fname_reader.getText().trim();
            String answer_dateofbirth = tf_date_of_birth.getText().trim();
            String answer_type_occup = tf_occup_id.getText().trim();

            if((!answer_fname_reader.equals("")) && (!answer_dateofbirth.equals(""))&&(!answer_type_occup.equals(""))
                    && (!answer_id_rticket.equals(""))){
                Date ans_date = Date.valueOf(answer_dateofbirth);
                int ans_occup_id = Integer.valueOf(answer_type_occup);
                int ans_id_rticket = Integer.valueOf(answer_id_rticket);
                dbHandler.updateReaderTicket(answer_fname_reader,ans_date,ans_occup_id,ans_id_rticket);
            } else System.out.println("Пустое поле ответа!");
        });

    }
}
