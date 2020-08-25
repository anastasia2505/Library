package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private TextField tf_id_lib;

    @FXML
    private Button update_library_button;

    @FXML
    private Label label_result;

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
              label_result.setText("OK!");
          } else label_result.setText("Empty fields!");
      });

      update_library_button.setOnAction(event->{
          DatabaseHandler dbHandler = new DatabaseHandler();

          String answer_id_lib = tf_id_lib.getText().trim();
          String answer_lib_name = tf_lib_name.getText().trim();
          String answer_lib_address = tf_lib_address.getText();
          String answer_lib_email = tf_lib_email.getText().trim();
          String answer_lib_phone = tf_lib_phone.getText().trim();

          if((!answer_lib_name.equals("")) && (!answer_lib_address.equals(""))&&(!answer_lib_email.equals(""))
                  && (!answer_lib_phone.equals(""))&& (!answer_id_lib.equals(""))){
              int ans_id_lib = Integer.valueOf(answer_id_lib);
              dbHandler.updateLibrary(answer_lib_name,answer_lib_address,answer_lib_email,answer_lib_phone,ans_id_lib);
              label_result.setText("OK!");
          } else label_result.setText("Empty fields!");
      });
    }
}
