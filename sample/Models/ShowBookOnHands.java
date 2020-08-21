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

    public SimpleIntegerProperty id_showbookProperty() {
        return id_showbook;
    }

    public SimpleStringProperty date_showbookProperty() {
        return date_showbook;
    }

    public SimpleStringProperty lib_showbookProperty() {
        return lib_showbook;
    }

    public SimpleStringProperty title_showbookProperty() {
        return title_showbook;
    }

    public SimpleStringProperty reader_showbookProperty() {
        return reader_showbook;
    }
}
