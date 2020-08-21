package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.DatabaseHandler;
import sample.Models.ShowBookOnHands;

public class ShowBookOnHandsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<ShowBookOnHands> table_book_on_hands;

    @FXML
    private TableColumn<ShowBookOnHands, Integer> tablecolumn_id_book;

    @FXML
    private TableColumn<ShowBookOnHands, String> tablecolumn_date_book;

    @FXML
    private TableColumn<ShowBookOnHands, String> tablecolumn_lib_book;

    @FXML
    private TableColumn<ShowBookOnHands, String> tablecolumn_title_book;

    @FXML
    private TableColumn<ShowBookOnHands, String> tablecolumn_reader_book;

    public ObservableList<ShowBookOnHands> list_book = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        table_book_on_hands.setItems(list_book);
        tablecolumn_id_book.setCellValueFactory(cellData->cellData.getValue().id_showbookProperty().asObject());
        tablecolumn_date_book.setCellValueFactory(cellData->cellData.getValue().date_showbookProperty());
        tablecolumn_lib_book.setCellValueFactory(cellData->cellData.getValue().lib_showbookProperty());
        tablecolumn_title_book.setCellValueFactory(cellData->cellData.getValue().title_showbookProperty());
        tablecolumn_reader_book.setCellValueFactory(cellData->cellData.getValue().reader_showbookProperty());

        list_book.clear();
        list_book.addAll(new DatabaseHandler().ShowBookOnHands());
        table_book_on_hands.setItems(list_book);
        table_book_on_hands.getSelectionModel().clearSelection();

    }
}
