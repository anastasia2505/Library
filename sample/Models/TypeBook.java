package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TypeBook {
    private final SimpleIntegerProperty id_type_book;
    private final SimpleStringProperty type_book;

    public TypeBook(Integer id_type_book, String type_book) {
        this.id_type_book = new SimpleIntegerProperty(id_type_book);
        this.type_book = new SimpleStringProperty(type_book);
    }

    public SimpleIntegerProperty id_type_bookProperty() {
        return id_type_book;
    }

    public SimpleStringProperty type_bookProperty() {
        return type_book;
    }
}
