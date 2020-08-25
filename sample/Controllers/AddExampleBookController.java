package sample.Controllers;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

public class AddExampleBookController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_ebook_button;

    @FXML
    private TextField tf_flagg_ebook;

    @FXML
    private TextField tf_lib_ebook;

    @FXML
    private TextField tf_date_of_issue;

    @FXML
    private TextField tf_book_ebook;

    @FXML
    private TextField tf_reader_ebook;

    @FXML
    private TextField tf_id_ebook;

    @FXML
    private Button update_ebook_button;

    @FXML
    private Label label_result;

    @FXML
    void initialize() {

        add_ebook_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_flagg = tf_flagg_ebook.getText().trim();
            String answer_date = tf_date_of_issue.getText();
            String answer_lib = tf_lib_ebook.getText().trim();
            String answer_book = tf_book_ebook.getText().trim();
            String answer_reader= tf_reader_ebook.getText().trim();

            if((!answer_flagg.equals("")) && (!answer_date.equals(""))&&(!answer_lib.equals(""))
                    && (!answer_book.equals("")) && (!answer_reader.equals(""))){
                Boolean ansFlagg = Boolean.valueOf(answer_flagg);
                Date ansDate = Date.valueOf(answer_date);
                int ansLib = Integer.valueOf(answer_lib);
                int ansBook = Integer.valueOf(answer_book);
                int ansReader = Integer.valueOf(answer_reader);
                dbHandler.addExampleBook(ansFlagg, ansDate, ansLib, ansBook, ansReader);
                label_result.setText("OK!");
            } else label_result.setText("Empty fields!");

        });

        update_ebook_button.setOnAction( event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_id_exbook = tf_id_ebook.getText().trim();

            String answer_flagg = tf_flagg_ebook.getText().trim();
            String answer_date = tf_date_of_issue.getText();
            String answer_lib = tf_lib_ebook.getText().trim();
            String answer_book = tf_book_ebook.getText().trim();
            String answer_reader= tf_reader_ebook.getText().trim();

            if((!answer_flagg.equals("")) && (!answer_date.equals(""))&&(!answer_lib.equals(""))
                    && (!answer_book.equals("")) && (!answer_reader.equals(""))&& (!answer_id_exbook.equals(""))){
                Boolean ansFlagg = Boolean.valueOf(answer_flagg);
                Date ansDate = Date.valueOf(answer_date);
                int ansLib = Integer.valueOf(answer_lib);
                int ansBook = Integer.valueOf(answer_book);
                int ansReader = Integer.valueOf(answer_reader);
                int ans_id_exbook = Integer.valueOf(answer_id_exbook);
                dbHandler.updateExampleBook(ansFlagg, ansDate, ansLib, ansBook, ansReader,ans_id_exbook);
                label_result.setText("OK!");
            } else label_result.setText("Empty fields!");
        });
    }
}
