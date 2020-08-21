package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.DatabaseHandler;
import sample.Models.ShowDebtors;

public class ShowDebtorsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<ShowDebtors> table_debtors;

    @FXML
    private TableColumn<ShowDebtors, Integer> tablecolumn_id_debtors;

    @FXML
    private TableColumn<ShowDebtors, String> tablecolumn_name_debtors;

    public ObservableList<ShowDebtors> listdebtors = FXCollections.observableArrayList();

    @FXML
    void initialize() {
            table_debtors.setItems(listdebtors);
            tablecolumn_id_debtors.setCellValueFactory(cellData->cellData.getValue().id_reader_showProperty().asObject());
            tablecolumn_name_debtors.setCellValueFactory(cellData->cellData.getValue().reader_name_showProperty());

            listdebtors.clear();
            listdebtors.addAll(new DatabaseHandler().ShowDebtors());
            table_debtors.setItems(listdebtors);
            table_debtors.getSelectionModel().clearSelection();

    }

}
