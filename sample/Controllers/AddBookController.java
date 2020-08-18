package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;


public class AddBookController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_book_button;

    @FXML
    private TextField tf_title;

    @FXML
    private TextField tf_tp_book;

    @FXML
    private TextField tf_quantity;

    @FXML
    private TextField tf_ph;

    @FXML
    private TextField tf_author;

    @FXML
    private TextField textfield_id_book;

    @FXML
    private Button update_book_button;

    @FXML
    void initialize() {

        add_book_button.setOnAction(event ->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_title = tf_title.getText().trim();
            String answer_quantity = tf_quantity.getText().trim();
            String answer_tp_book = tf_tp_book.getText().trim();
            String answer_ph = tf_ph.getText().trim();
            String answer_author= tf_author.getText().trim();

            if((!answer_title.equals("")) && (!answer_quantity.equals(""))&&(!answer_tp_book.equals(""))
                    && (!answer_ph.equals("")) && (!answer_author.equals(""))){
                int ansQuantity = Integer.valueOf(answer_quantity);
                int ansTPBOOK = Integer.valueOf(answer_tp_book);
                int ansPH = Integer.valueOf(answer_ph);
                int ansAuthor = Integer.valueOf(answer_author);
                dbHandler.addBook(answer_title, ansQuantity, ansTPBOOK, ansPH, ansAuthor);
            } else System.out.println("Пустое поле ответа!");
        });

        update_book_button.setOnAction(event->{
            DatabaseHandler dbHandler = new DatabaseHandler();

            String answer_update_book= textfield_id_book.getText().trim();

            String answer_title = tf_title.getText().trim();
            String answer_quantity = tf_quantity.getText().trim();
            String answer_tp_book = tf_tp_book.getText().trim();
            String answer_ph = tf_ph.getText().trim();
            String answer_author= tf_author.getText().trim();

            if((!answer_title.equals("")) && (!answer_quantity.equals(""))&&(!answer_tp_book.equals(""))
                    && (!answer_ph.equals("")) && (!answer_author.equals(""))&& (!answer_update_book.equals(""))){
                int ans_id_book = Integer.valueOf(answer_update_book);
                int ansQuantity = Integer.valueOf(answer_quantity);
                int ansTPBOOK = Integer.valueOf(answer_tp_book);
                int ansPH = Integer.valueOf(answer_ph);
                int ansAuthor = Integer.valueOf(answer_author);
                dbHandler.updateBook(answer_title, ansQuantity, ansTPBOOK, ansPH, ansAuthor, ans_id_book);
            } else System.out.println("Пустое поле ответа!");

        });


    }
}
