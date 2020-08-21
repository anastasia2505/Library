package sample.Models;

import javafx.beans.property.SimpleStringProperty;

public class ShowBookByAuthor {
    private final SimpleStringProperty title_showauthor;
    private final SimpleStringProperty author_showauthor;

    public ShowBookByAuthor(String title_showauthor, String author_showauthor) {
        this.title_showauthor = new SimpleStringProperty (title_showauthor);
        this.author_showauthor = new SimpleStringProperty(author_showauthor);
    }

    public SimpleStringProperty title_showauthorProperty() {
        return title_showauthor;
    }

    public SimpleStringProperty author_showauthorProperty() {
        return author_showauthor;
    }
}
