package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;
import sample.Models.ShowBookByAuthor;

public class ShowBookByAuthorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<ShowBookByAuthor> table_book_by_author;

    @FXML
    private TableColumn<ShowBookByAuthor, String> tablecolumn_title_byauthor;

    @FXML
    private TableColumn<ShowBookByAuthor, String> tablecolumn_author_byauthor;

    @FXML
    private TextField tf_enter_author;

    @FXML
    private Button search_by_author_button;

    public ObservableList<ShowBookByAuthor> list_by_author = FXCollections.observableArrayList();

    @FXML
    void initialize() {
       search_by_author_button.setOnAction(event->{
           String answer_author= tf_enter_author.getText().trim();

           table_book_by_author.setItems(list_by_author);
           tablecolumn_title_byauthor.setCellValueFactory(cellData->cellData.getValue().title_showauthorProperty());
           tablecolumn_author_byauthor.setCellValueFactory(cellData->cellData.getValue().author_showauthorProperty());

           list_by_author.clear();
           list_by_author.addAll(new DatabaseHandler().FindByAuthor(answer_author));
           table_book_by_author.setItems(list_by_author);
           table_book_by_author.getSelectionModel().clearSelection();
       });

    }
}
