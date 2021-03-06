package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.DatabaseHandler;
import sample.Models.*;


public class LibraryStartController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane tab_books;

    @FXML
    private Button but_add_book;

    @FXML
    private TableView<Book> table_books;

    @FXML
    private TableColumn<Book, Integer> tc_number;

    @FXML
    private TableColumn<Book, String> tc_title;

    @FXML
    private TableColumn<Book, String> tc_author;

    @FXML
    private TableColumn<Book, String> tc_tp;

    @FXML
    private TableColumn<Book, Integer> tc_quantity;

    @FXML
    private TableColumn<Book, String> tc_ph;

    @FXML
    private Button but_delete_book;

    @FXML
    private Button but_update_book;

    @FXML
    private TextField textfield_id_book;

    @FXML
    private Button but_refresh_books;

    @FXML
    private Label label_delete_book;

    @FXML
    private Tab tab_tp_book;

    @FXML
    private Button but_add_type_book;

    @FXML
    private Button but_search_typebook;

    @FXML
    private TableView<TypeBook> table_type_book;

    @FXML
    private TableColumn<TypeBook, Integer> tc_id_typebook;

    @FXML
    private TableColumn<TypeBook, String> tc_typebook;

    @FXML
    private TextField textfield_idTP_delete;

    @FXML
    private Button but_delete_type_book;

    @FXML
    private Button but_update_type_book;

    @FXML
    private Button but_refresh_typebook;

    @FXML
    private Label label_delete_TP;

    @FXML
    private Tab tab_ex_of_books;

    @FXML
    private Button but_add_example_book;

    @FXML
    private Button but_search_books;

    @FXML
    private Button but_show_books;

    @FXML
    private TableView<ExampleOfBook> table_example_of_book;

    @FXML
    private TableColumn<ExampleOfBook, Integer> tc_id_ebook;

    @FXML
    private TableColumn<ExampleOfBook, String> tc_date_of_issue;

    @FXML
    private TableColumn<ExampleOfBook, String> tc_lib_ebook;

    @FXML
    private TableColumn<ExampleOfBook, String> tc_title_ebook;

    @FXML
    private TableColumn<ExampleOfBook, String> tc_reader_ebook;

    @FXML
    private TextField textField_id_exbook_delete;

    @FXML
    private Button but_delete_example_book;

    @FXML
    private Button but_update_example_book;

    @FXML
    private Button but_refresh_exbook;

    @FXML
    private Label label_delete_exbook;

    @FXML
    private Tab tab_readers;

    @FXML
    private Button but_add_reader;

    @FXML
    private Button but_show_debtors;

    @FXML
    private TableView<Reader> table_readers;

    @FXML
    private TableColumn<Reader, Integer> tc_id_reader;

    @FXML
    private TableColumn<Reader, String> tc_status_reader;

    @FXML
    private TableColumn<Reader, Integer> tc_numberticket_reader;

    @FXML
    private TextField textfield_id_reader;

    @FXML
    private Button but_delete_reader;

    @FXML
    private Button but_update_reader;

    @FXML
    private Button but_refresh_readers;

    @FXML
    private Label label_delete_readers;

    @FXML
    private Tab tab_rtickets;

    @FXML
    private Button but_add_reader_ticket;

    @FXML
    private TableView<ReaderTicket> table_reader_ticket;

    @FXML
    private TableColumn<ReaderTicket, Integer> tc_id_readerticket;

    @FXML
    private TableColumn<ReaderTicket, String> tc_reader_rticket;

    @FXML
    private TableColumn<ReaderTicket, String> tc_date_of_birth;

    @FXML
    private TableColumn<ReaderTicket, String> tc_typeoccup_rticket;

    @FXML
    private TextField textfield_id_rticket_delete;

    @FXML
    private Button but_delete_reader_ticket;

    @FXML
    private Button but_update_reader_ticket;

    @FXML
    private Button but_refresh_rticket;

    @FXML
    private Label label_delete_rticket;

    @FXML
    private Tab tab_occup;

    @FXML
    private Button but_add_occupation;

    @FXML
    private TableView<Occupation> table_occupation;

    @FXML
    private TableColumn<Occupation, Integer> tc_id_occupation;

    @FXML
    private TableColumn<Occupation, String> tc_type_of_occupation;

    @FXML
    private TextField textfield_id_occupation;

    @FXML
    private Button but_delete_occupation;

    @FXML
    private Button but_update_occupation;

    @FXML
    private Button but_refresh_occup;

    @FXML
    private Label label_delete_occupation;

    @FXML
    private Tab tab_libs;

    @FXML
    private Button but_add_library;

    @FXML
    private TableView<Library> table_libraries;

    @FXML
    private TableColumn<Library, Integer> tc_id_library;

    @FXML
    private TableColumn<Library, String> tc_library;

    @FXML
    private TableColumn<Library, String> tc_address_lib;

    @FXML
    private TableColumn<Library, String> tc_email_lib;

    @FXML
    private TableColumn<Library, String> tc_phone_lib;

    @FXML
    private TextField textfield_id_lib;

    @FXML
    private Button but_delete_lib;

    @FXML
    private Button but_update_lib;

    @FXML
    private Button but_refresh_lib;

    @FXML
    private Label label_delete_lib;

    @FXML
    private Tab tab_ph;

    @FXML
    private Button but_add_ph;

    @FXML
    private TableView<PublishingHouse> table_ph;

    @FXML
    private TableColumn<PublishingHouse, Integer> tc_id_ph;

    @FXML
    private TableColumn<PublishingHouse, String> tc_name_ph;

    @FXML
    private TableColumn<PublishingHouse, String> tc_address_ph;

    @FXML
    private TableColumn<PublishingHouse, String> tc_email_ph;

    @FXML
    private TableColumn<PublishingHouse, String> tc_phone_ph;

    @FXML
    private TextField textfield_id_ph;

    @FXML
    private Button but_delete_ph;

    @FXML
    private Button but_update_ph;

    @FXML
    private Button but_refresh_ph;

    @FXML
    private Label label_delete_ph;

    @FXML
    private Tab tab_authors;

    @FXML
    private Button but_add_author;

    @FXML
    private Button but_search_authors;

    @FXML
    private TableView<Author> table_authors;

    @FXML
    private TableColumn<Author, Integer> tc_id_author;

    @FXML
    private TableColumn<Author, String> tc_name_author;

    @FXML
    private TableColumn<Author, String> tc_country_author;

    @FXML
    private TableColumn<Author, String> tc_years_of_life;

    @FXML
    private TextField textfield_id_author;

    @FXML
    private Button but_delete_author;

    @FXML
    private Button but_update_author;

    @FXML
    private Button but_refresh_authors;

    @FXML
    private Label label_delete_author;

    public ObservableList<Book> listbook = FXCollections.observableArrayList();
    public ObservableList<TypeBook> listtypebook = FXCollections.observableArrayList();
    public ObservableList<ExampleOfBook> listexamplebook = FXCollections.observableArrayList();
    public ObservableList<Reader> listreader = FXCollections.observableArrayList();
    public ObservableList<ReaderTicket> listrticket = FXCollections.observableArrayList();
    public ObservableList<Occupation> listoccupation = FXCollections.observableArrayList();
    public ObservableList<Library> listlibrary = FXCollections.observableArrayList();
    public ObservableList<PublishingHouse> listph = FXCollections.observableArrayList();
    public ObservableList<Author> listauthor = FXCollections.observableArrayList();

    @FXML
    void initialize() throws SQLException {
        //заполнение данными всех таблиц
        showTableBook();
        showTableTypeBook();
        showTableExampleBook();
        showTableReader();
        showTableReaderTicket();
        showTableOccupation();
        showTableLibrary();
        showTablePH();
        showTableAuthor();

        //кнопки обновления таблиц
        but_refresh_books.setOnAction(event->{
            showTableBook();
        });
        but_refresh_typebook.setOnAction(event->{
            showTableTypeBook();
        });
        but_refresh_exbook.setOnAction(event->{
            showTableExampleBook();
        });
        but_refresh_readers.setOnAction(event->{
            showTableReader();
        });
        but_refresh_rticket.setOnAction(event->{
            showTableReaderTicket();
        });
        but_refresh_occup.setOnAction(event->{
            showTableOccupation();
        });
        but_refresh_lib.setOnAction(event->{
            showTableLibrary();
        });
        but_refresh_ph.setOnAction(event->{
            showTablePH();
        });
        but_refresh_authors.setOnAction(event->{
            showTableAuthor();
        });

        //кнопки добавления новых записей в таблицы
        but_add_book.setOnAction(event -> {
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("/sample/View/AddBookWindow.fxml"));

           try {
               loader.load();
           } catch (IOException e){
               e.printStackTrace();
           }

           Parent root = loader.getRoot();
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.showAndWait();
       });

        but_add_type_book.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddTypeBookWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_add_example_book.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddExampleBookWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        but_add_reader.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddReaderWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_add_reader_ticket.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddReaderTicketWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_add_occupation.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddOccupationWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_add_library.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddLibraryWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_add_ph.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddPublishingHouseWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        but_add_author.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddAuthorWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        //кнопки удаления записей из таблиц
        but_delete_book.setOnAction(event ->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_book= textfield_id_book.getText().trim();
            if((!answer_delete_book.equals(""))){
                DBhandler.deleteBook(answer_delete_book);
                label_delete_book.setText("OK!");
            } else label_delete_book.setText("Empty field!");
        });

        but_delete_type_book.setOnAction(event ->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_TP= textfield_idTP_delete.getText().trim();
            if((!answer_delete_TP.equals(""))){
                DBhandler.deleteTypeBook(answer_delete_TP);
                label_delete_TP.setText("OK!");
            } else label_delete_TP.setText("Empty field!");
        });

        but_delete_example_book.setOnAction(event ->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_exbook= textField_id_exbook_delete.getText().trim();
            if((!answer_delete_exbook.equals(""))){
                DBhandler.deleteExampleBook(answer_delete_exbook);
                label_delete_exbook.setText("OK!");
            } else label_delete_exbook.setText("Empty field!");
        });

        but_delete_reader.setOnAction(event->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_reader= textfield_id_reader.getText().trim();
            if((!answer_delete_reader.equals(""))){
                DBhandler.deleteReader(answer_delete_reader);
                label_delete_readers.setText("OK!");
            } else label_delete_readers.setText("Empty field!");
        });

        but_delete_occupation.setOnAction(event->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_occupation = textfield_id_occupation.getText().trim();
            if((!answer_delete_occupation.equals(""))){
                DBhandler.deleteOccupation(answer_delete_occupation);
                label_delete_occupation.setText("OK!");
            } else label_delete_occupation.setText("Empty field!");
        });

        but_delete_reader_ticket.setOnAction(event->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_rticket= textfield_id_rticket_delete.getText().trim();
            if((!answer_delete_rticket.equals(""))){
                DBhandler.deleteReaderTicket(answer_delete_rticket);
                label_delete_rticket.setText("OK!");
            } else label_delete_rticket.setText("Empty field!");
        });

        but_delete_lib.setOnAction(event->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_lib = textfield_id_lib.getText().trim();
            if((!answer_delete_lib.equals(""))){
                DBhandler.deleteLibrary(answer_delete_lib);
                label_delete_lib.setText("OK!");
            } else label_delete_lib.setText("Empty field!");
        });

        but_delete_ph.setOnAction(event->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_ph = textfield_id_ph.getText().trim();
            if((!answer_delete_ph.equals(""))){
                DBhandler.deletePublishingHouse(answer_delete_ph);
                label_delete_ph.setText("OK!");
            } else label_delete_ph.setText("Empty field!");
        });

        but_delete_author.setOnAction(event->{
            DatabaseHandler DBhandler = new DatabaseHandler();
            String answer_delete_author = textfield_id_author.getText().trim();
            if((!answer_delete_author.equals(""))){
                DBhandler.deleteAuthor(answer_delete_author);
                label_delete_author.setText("OK!");
            } else label_delete_author.setText("Empty field!");
        });

        // кнопки изменения записей в таблицах
        but_update_book.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddBookWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_update_type_book.setOnAction(event ->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddTypeBookWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_update_example_book.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddExampleBookWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_update_reader.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddReaderWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_update_reader_ticket.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddReaderTicketWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        but_update_occupation.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddOccupationWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_update_lib.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddLibraryWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        but_update_ph.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddPublishingHouseWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        but_update_author.setOnAction(evnt->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/AddAuthorWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        // кнопки дополнительных запросов
        but_show_debtors.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/ShowDebtorsWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        but_show_books.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/ShowBookOnHandsWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_search_books.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/ShowBookByTitleWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        but_search_typebook.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/ShowBookByTypeWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        but_search_authors.setOnAction(event->{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/ShowBookByAuthorWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }


    // вывод всех книг в таблицу на вкладке Book
    private void showTableBook(){

        table_books.setItems(listbook);
        tc_number.setCellValueFactory(cellData->cellData.getValue().idProperty().asObject());
        tc_title.setCellValueFactory(cellData->cellData.getValue().titleProperty());
        tc_author.setCellValueFactory(cellData->cellData.getValue().authorIdProperty());
        tc_tp.setCellValueFactory(cellData->cellData.getValue().typeBookIdProperty());
        tc_quantity.setCellValueFactory(cellData->cellData.getValue().quantityProperty().asObject());
        tc_ph.setCellValueFactory(cellData->cellData.getValue().phIdProperty());

        listbook.clear();
        listbook.addAll(new DatabaseHandler().ViewRecordBook());
        table_books.setItems(listbook);
        table_books.getSelectionModel().clearSelection();
        }

        //вывод всех типов книг на вкладке Type book
    private void showTableTypeBook() {
        table_type_book.setItems(listtypebook);
        tc_id_typebook.setCellValueFactory(cellData->cellData.getValue().id_type_bookProperty().asObject());
        tc_typebook.setCellValueFactory(cellData->cellData.getValue().type_bookProperty());

        listtypebook.clear();
        listtypebook.addAll(new DatabaseHandler().ViewRecordTypeBook());
        table_type_book.setItems(listtypebook);
        table_type_book.getSelectionModel().clearSelection();
    }
    // вывод всех книг в таблицу на вкладке Example of Book
    private void showTableExampleBook(){
        table_example_of_book.setItems(listexamplebook);
        tc_id_ebook.setCellValueFactory(cellData->cellData.getValue().id_exbookProperty().asObject());
        tc_date_of_issue.setCellValueFactory(cellData->cellData.getValue().date_exbookProperty());
        tc_lib_ebook.setCellValueFactory(cellData->cellData.getValue().lib_exbookProperty());
        tc_title_ebook.setCellValueFactory(cellData->cellData.getValue().title_exbookProperty());
        tc_reader_ebook.setCellValueFactory(cellData->cellData.getValue().reader_exbookProperty());

        listexamplebook.clear();
        listexamplebook.addAll(new DatabaseHandler().ViewRecordExBook());
        table_example_of_book.setItems(listexamplebook);
        table_example_of_book.getSelectionModel().clearSelection();
    }
    // вывод всех читателей в таблицу на вкладке Reader
    private void showTableReader() {
        table_readers.setItems(listreader);
        tc_id_reader.setCellValueFactory(cellData->cellData.getValue().id_readerProperty().asObject());
        tc_status_reader.setCellValueFactory(cellData->cellData.getValue().status_readerProperty());
        tc_numberticket_reader.setCellValueFactory(cellData->cellData.getValue().number_ticket_readerProperty().asObject());

        listreader.clear();
        listreader.addAll(new DatabaseHandler().ViewRecordReader());
        table_readers.setItems(listreader);
        table_readers.getSelectionModel().clearSelection();
    }
    //вывод всех читателей на вкладке Reader Ticket
    private void showTableReaderTicket(){
        table_reader_ticket.setItems(listrticket);
        tc_id_readerticket.setCellValueFactory(cellData->cellData.getValue().id_reader_ticketProperty().asObject());
        tc_reader_rticket.setCellValueFactory(cellData->cellData.getValue().reader_rticketProperty());
        tc_date_of_birth.setCellValueFactory(cellData->cellData.getValue().date_of_birth_rticketProperty());
        tc_typeoccup_rticket.setCellValueFactory(cellData->cellData.getValue().type_occup_rticketProperty());

        listrticket.clear();
        listrticket.addAll(new DatabaseHandler().ViewRecordReaderTicket());
        table_reader_ticket.setItems(listrticket);
        table_reader_ticket.getSelectionModel().clearSelection();
    }
    //вывод всех типов книг на вкладке Occupation
    private void showTableOccupation() {
        table_occupation.setItems(listoccupation);
        tc_id_occupation.setCellValueFactory(cellData->cellData.getValue().id_type_occupationProperty().asObject());
        tc_type_of_occupation.setCellValueFactory(cellData->cellData.getValue().type_occupationProperty());

        listoccupation.clear();
        listoccupation.addAll(new DatabaseHandler().ViewRecordOccupation());
        table_occupation.setItems(listoccupation);
        table_occupation.getSelectionModel().clearSelection();
    }
    // вывод всех библиотек в таблицу на вкладке Library
    private void showTableLibrary(){
        table_libraries.setItems(listlibrary);
        tc_id_library.setCellValueFactory(cellData->cellData.getValue().id_libProperty().asObject());
        tc_library.setCellValueFactory(cellData->cellData.getValue().name_libProperty());
        tc_address_lib.setCellValueFactory(cellData->cellData.getValue().address_libProperty());
        tc_email_lib.setCellValueFactory(cellData->cellData.getValue().email_libProperty());
        tc_phone_lib.setCellValueFactory(cellData->cellData.getValue().phone_libProperty());

        listlibrary.clear();
        listlibrary.addAll(new DatabaseHandler().ViewRecordLibrary());
        table_libraries.setItems(listlibrary);
        table_libraries.getSelectionModel().clearSelection();
    }
    // вывод всех издательств в таблицу на вкладке Publishing houses
    private void showTablePH(){
        table_ph.setItems(listph);
        tc_id_ph.setCellValueFactory(cellData->cellData.getValue().id_phProperty().asObject());
        tc_name_ph.setCellValueFactory(cellData->cellData.getValue().name_phProperty());
        tc_address_ph.setCellValueFactory(cellData->cellData.getValue().address_phProperty());
        tc_email_ph.setCellValueFactory(cellData->cellData.getValue().email_phProperty());
        tc_phone_ph.setCellValueFactory(cellData->cellData.getValue().phone_phProperty());

        listph.clear();
        listph.addAll(new DatabaseHandler().ViewRecordPH());
        table_ph.setItems(listph);
        table_ph.getSelectionModel().clearSelection();
    }
    // вывод всех авторов в таблицу на вкладке Author
    private void showTableAuthor(){
        table_authors.setItems(listauthor);
        tc_id_author.setCellValueFactory(cellData->cellData.getValue().id_authorProperty().asObject());
        tc_name_author.setCellValueFactory(cellData->cellData.getValue().name_authorProperty());
        tc_country_author.setCellValueFactory(cellData->cellData.getValue().country_authorProperty());
        tc_years_of_life.setCellValueFactory(cellData->cellData.getValue().years_of_lifeProperty());

        listauthor.clear();
        listauthor.addAll(new DatabaseHandler().ViewRecordAuthor());
        table_authors.setItems(listauthor);
        table_authors.getSelectionModel().clearSelection();
    }

}
