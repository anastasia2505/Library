package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShowBookOnHands {
    private final SimpleIntegerProperty id_showbook;
    private final SimpleStringProperty date_showbook;
    private final SimpleStringProperty lib_showbook;
    private final SimpleStringProperty title_showbook;
    private final SimpleStringProperty reader_showbook;

    public ShowBookOnHands( Integer id_showbook, String date_showbook, String  lib_showbook, String  title_showbook, String  reader_showbook) {
        this.id_showbook = new SimpleIntegerProperty(id_showbook);
        this.date_showbook = new SimpleStringProperty (date_showbook);
        this.lib_showbook = new SimpleStringProperty (lib_showbook);
        this.title_showbook = new SimpleStringProperty (title_showbook);
        this.reader_showbook = new SimpleStringProperty (reader_showbook);
    }

    public int getId_showbook() {
        return id_showbook.get();
    }

    public SimpleIntegerProperty id_showbookProperty() {
        return id_showbook;
    }

    public void setId_showbook(int id_showbook) {
        this.id_showbook.set(id_showbook);
    }

    public String getDate_showbook() {
        return date_showbook.get();
    }

    public SimpleStringProperty date_showbookProperty() {
        return date_showbook;
    }

    public void setDate_showbook(String date_showbook) {
        this.date_showbook.set(date_showbook);
    }

    public String getLib_showbook() {
        return lib_showbook.get();
    }

    public SimpleStringProperty lib_showbookProperty() {
        return lib_showbook;
    }

    public void setLib_showbook(String lib_showbook) {
        this.lib_showbook.set(lib_showbook);
    }

    public String getTitle_showbook() {
        return title_showbook.get();
    }

    public SimpleStringProperty title_showbookProperty() {
        return title_showbook;
    }

    public void setTitle_showbook(String title_showbook) {
        this.title_showbook.set(title_showbook);
    }

    public String getReader_showbook() {
        return reader_showbook.get();
    }

    public SimpleStringProperty reader_showbookProperty() {
        return reader_showbook;
    }

    public void setReader_showbook(String reader_showbook) {
        this.reader_showbook.set(reader_showbook);
    }
}
