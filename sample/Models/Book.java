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

    public int getId() {
        return id_book.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id_book;
    }

    public void setId(int id) {
        this.id_book.set(id);
    }

    public String getTitle() {
        return title_book.get();
    }

    public SimpleStringProperty titleProperty() {
        return title_book;
    }

    public void setTitle(String title) {
        this.title_book.set(title);
    }

    public String getAuthorId() {
        return author_book.get();
    }

    public SimpleStringProperty authorIdProperty() {
        return author_book;
    }

    public void setAuthorId(String authorId) {
        this.author_book.set(authorId);
    }

    public String getTypeBookId() {
        return tb_book.get();
    }

    public SimpleStringProperty typeBookIdProperty() {
        return tb_book;
    }

    public void setTypeBookId(String typeBookId) {
        this.tb_book.set(typeBookId);
    }

    public int getQuantity() {
        return quantity_book.get();
    }

    public SimpleIntegerProperty quantityProperty() {
        return quantity_book;
    }

    public void setQuantity(int quantity) {
        this.quantity_book.set(quantity);
    }

    public String getPhId() {
        return ph_book.get();
    }

    public SimpleStringProperty phIdProperty() {
        return ph_book;
    }

    public void setPhId(String phId) {
        this.ph_book.set(phId);
    }
}
