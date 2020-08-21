package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;
import sample.Models.ShowBookByTitle;

public class ShowBookByTitleController {

    @FXML
    private TableView<ShowBookByTitle> table_book_by_title;

    @FXML
    private TableColumn<ShowBookByTitle, Integer> tablecolumn_id_bytitle;

    @FXML
    private TableColumn<ShowBookByTitle, String> tablecolumn_title_bytitle;

    @FXML
    private TableColumn<ShowBookByTitle, String> tablecolumn_author_bytitle;

    @FXML
    private TableColumn<ShowBookByTitle, String> tablecolumn_lib_bytitle;

    @FXML
    private TextField tf_enter_title;

    @FXML
    private Button search_by_title_button;

    public ObservableList<ShowBookByTitle> list_by_title = FXCollections.observableArrayList();

    @FXML
    void initialize() {

    search_by_title_button.setOnAction(event->{

        String answer_title= tf_enter_title.getText().trim();

        table_book_by_title.setItems(list_by_title);
        tablecolumn_id_bytitle.setCellValueFactory(cellData->cellData.getValue().id_showtitleProperty().asObject());
        tablecolumn_title_bytitle.setCellValueFactory(cellData->cellData.getValue().title_showtitleProperty());
        tablecolumn_author_bytitle.setCellValueFactory(cellData->cellData.getValue().author_showtitleProperty());
        tablecolumn_lib_bytitle.setCellValueFactory(cellData->cellData.getValue().lib_showtitleProperty());


        list_by_title.clear();
        list_by_title.addAll(new DatabaseHandler().SearchBook(answer_title));
        table_book_by_title.setItems(list_by_title);
        table_book_by_title.getSelectionModel().clearSelection();
    });

    }

}
