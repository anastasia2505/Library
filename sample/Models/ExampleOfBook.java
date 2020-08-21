package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ExampleOfBook {
    private final SimpleIntegerProperty id_exbook;
    private final SimpleStringProperty date_exbook;
    private final SimpleStringProperty lib_exbook;
    private final SimpleStringProperty title_exbook;
    private final SimpleStringProperty reader_exbook;

    public ExampleOfBook( Integer id_exbook, String date_exbook, String  lib_exbook, String  title_exbook, String  reader_exbook) {
        this.id_exbook = new SimpleIntegerProperty(id_exbook);
        this.date_exbook = new SimpleStringProperty (date_exbook);
        this.lib_exbook = new SimpleStringProperty (lib_exbook);
        this.title_exbook = new SimpleStringProperty (title_exbook);
        this.reader_exbook = new SimpleStringProperty (reader_exbook);
    }

    public SimpleIntegerProperty id_exbookProperty() {
        return id_exbook;
    }

    public SimpleStringProperty date_exbookProperty() {
        return date_exbook;
    }

    public SimpleStringProperty lib_exbookProperty() {
        return lib_exbook;
    }

    public SimpleStringProperty title_exbookProperty() {
        return title_exbook;
    }

    public SimpleStringProperty reader_exbookProperty() {
        return reader_exbook;
    }

}
