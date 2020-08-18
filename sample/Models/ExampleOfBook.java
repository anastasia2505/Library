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

    public int getId_exbook() {
        return id_exbook.get();
    }

    public SimpleIntegerProperty id_exbookProperty() {
        return id_exbook;
    }

    public void setId_exbook(int id_exbook) {
        this.id_exbook.set(id_exbook);
    }

    public String getDate_exbook() {
        return date_exbook.get();
    }

    public SimpleStringProperty date_exbookProperty() {
        return date_exbook;
    }

    public void setDate_exbook(String date_exbook) {
        this.date_exbook.set(date_exbook);
    }

    public String getLib_exbook() {
        return lib_exbook.get();
    }

    public SimpleStringProperty lib_exbookProperty() {
        return lib_exbook;
    }

    public void setLib_exbook(String lib_exbook) {
        this.lib_exbook.set(lib_exbook);
    }

    public String getTitle_exbook() {
        return title_exbook.get();
    }

    public SimpleStringProperty title_exbookProperty() {
        return title_exbook;
    }

    public void setTitle_exbook(String title_exbook) {
        this.title_exbook.set(title_exbook);
    }

    public String getReader_exbook() {
        return reader_exbook.get();
    }

    public SimpleStringProperty reader_exbookProperty() {
        return reader_exbook;
    }

    public void setReader_exbook(String reader_exbook) {
        this.reader_exbook.set(reader_exbook);
    }
}
