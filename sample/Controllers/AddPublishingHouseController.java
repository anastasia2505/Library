package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddPublishingHouseController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_ph_button;

    @FXML
    private TextField tf_ph_name;

    @FXML
    private TextField tf_ph_email;

    @FXML
    private TextField tf_ph_address;

    @FXML
    private TextField tf_ph_phone;

    @FXML
    private TextField tf_ph_id;

    @FXML
    private Button update_ph_button;

    @FXML
    void initialize() {
        add_ph_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_ph_name = tf_ph_name.getText().trim();
            String answer_ph_address = tf_ph_address.getText();
            String answer_ph_email = tf_ph_email.getText().trim();
            String answer_ph_phone = tf_ph_phone.getText().trim();

            if((!answer_ph_name.equals("")) && (!answer_ph_address.equals(""))&&(!answer_ph_email.equals(""))
                    && (!answer_ph_phone.equals(""))){
                dbHandler.addPublishingHouse(answer_ph_name,answer_ph_address,answer_ph_email,answer_ph_phone);
            } else System.out.println("Пустое поле ответа!");
        });

        update_ph_button.setOnAction(event->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_id_ph = tf_ph_id.getText().trim();
            String answer_ph_name = tf_ph_name.getText().trim();
            String answer_ph_address = tf_ph_address.getText();
            String answer_ph_email = tf_ph_email.getText().trim();
            String answer_ph_phone = tf_ph_phone.getText().trim();

            if((!answer_ph_name.equals("")) && (!answer_ph_address.equals(""))&&(!answer_ph_email.equals(""))
                    && (!answer_ph_phone.equals(""))&& (!answer_id_ph.equals(""))){
                int ans_id_ph = Integer.valueOf(answer_id_ph);
                dbHandler.updatePublishingHouse(answer_ph_name,answer_ph_address,answer_ph_email,answer_ph_phone,ans_id_ph);
            } else System.out.println("Пустое поле ответа!");
        });
    }
}
