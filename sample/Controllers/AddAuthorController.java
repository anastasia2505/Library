package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddAuthorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_author_button;

    @FXML
    private TextField tf_fname_author;

    @FXML
    private TextField tf_country_author;

    @FXML
    private TextField tf_years_of_life;

    @FXML
    void initialize() {
        add_author_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_fname_author = tf_fname_author.getText().trim();
            String answer_country = tf_country_author.getText().trim();
            String answer_years_of_life = tf_years_of_life.getText().trim();

            if((!answer_fname_author.equals("")) && (!answer_country.equals(""))&&(!answer_years_of_life.equals(""))){
                dbHandler.addAuthor(answer_fname_author,answer_country,answer_years_of_life);
            } else System.out.println("Пустое поле ответа!");
        });

    }
}
