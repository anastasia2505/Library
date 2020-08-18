package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddLibraryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_library_button;

    @FXML
    private TextField tf_lib_name;

    @FXML
    private TextField tf_lib_email;

    @FXML
    private TextField tf_lib_address;

    @FXML
    private TextField tf_lib_phone;

    @FXML
    void initialize() {
      add_library_button.setOnAction(event ->{
          DatabaseHandler dbHandler = new DatabaseHandler();

          String answer_lib_name = tf_lib_name.getText().trim();
          String answer_lib_address = tf_lib_address.getText();
          String answer_lib_email = tf_lib_email.getText().trim();
          String answer_lib_phone = tf_lib_phone.getText().trim();

          if((!answer_lib_name.equals("")) && (!answer_lib_address.equals(""))&&(!answer_lib_email.equals(""))
                  && (!answer_lib_phone.equals(""))){
              dbHandler.addLibrary(answer_lib_name,answer_lib_address,answer_lib_email,answer_lib_phone);
          } else System.out.println("Пустое поле ответа!");
      });

    }
}