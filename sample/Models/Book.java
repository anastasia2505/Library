package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {

    private final SimpleIntegerProperty id_book;
    private final SimpleStringProperty title_book;
    private final SimpleStringProperty author_book;
    private final SimpleStringProperty tb_book;
    private final SimpleIntegerProperty quantity_book;
    private final SimpleStringProperty ph_book;


    public Book(Integer id, String title, String authorId, String typeBookId,Integer quantity, String phId) {
        this.id_book = new SimpleIntegerProperty(id);
        this.title_book = new SimpleStringProperty(title);
        this.author_book = new SimpleStringProperty(authorId);
        this.tb_book = new SimpleStringProperty(typeBookId);
        this.quantity_book = new SimpleIntegerProperty(quantity);
        this.ph_book = new SimpleStringProperty(phId);

    }

    public int getId() { return id_book.get(); }

    public SimpleIntegerProperty idProperty() {
        return id_book;
    }

    public void setId(int id) {
        this.id_book.set(id);
    }

    public SimpleStringProperty titleProperty() {
        return title_book;
    }

    public SimpleStringProperty authorIdProperty() {
        return author_book;
    }

    public SimpleStringProperty typeBookIdProperty() {
        return tb_book;
    }

    public SimpleIntegerProperty quantityProperty() {
        return quantity_book;
    }

    public SimpleStringProperty phIdProperty() {
        return ph_book;
    }
}
