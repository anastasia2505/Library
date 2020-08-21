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
import sample.Models.ShowBookByType;

public class ShowBookByTypeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<ShowBookByType> table_book_by_type;

    @FXML
    private TableColumn<ShowBookByType, String> tablecolumn_title_bytype;

    @FXML
    private TableColumn<ShowBookByType, String> tablecolumn_type_bytype;

    @FXML
    private TextField tf_enter_type;

    @FXML
    private Button search_by_type_button;

    public ObservableList<ShowBookByType> list_by_type = FXCollections.observableArrayList();
    @FXML
    void initialize() {
        search_by_type_button.setOnAction(event->{
            String answer_type= tf_enter_type.getText().trim();

            table_book_by_type.setItems(list_by_type);
            tablecolumn_title_bytype.setCellValueFactory(cellData->cellData.getValue().title_showtypeProperty());
            tablecolumn_type_bytype.setCellValueFactory(cellData->cellData.getValue().type_showtypeProperty());

            list_by_type.clear();
            list_by_type.addAll(new DatabaseHandler().FindByType(answer_type));
            table_book_by_type.setItems(list_by_type);
            table_book_by_type.getSelectionModel().clearSelection();
        });


    }
}
