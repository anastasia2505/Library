package sample.Models;

import javafx.beans.property.SimpleStringProperty;

public class ShowBookByAuthor {
    private final SimpleStringProperty title_showauthor;
    private final SimpleStringProperty author_showauthor;

    public ShowBookByAuthor(String title_showauthor, String author_showauthor) {
        this.title_showauthor = new SimpleStringProperty (title_showauthor);
        this.author_showauthor = new SimpleStringProperty(author_showauthor);
    }

    public String getTitle_showauthor() {
        return title_showauthor.get();
    }

    public SimpleStringProperty title_showauthorProperty() {
        return title_showauthor;
    }

    public void setTitle_showauthor(String title_showauthor) {
        this.title_showauthor.set(title_showauthor);
    }

    public String getAuthor_showauthor() {
        return author_showauthor.get();
    }

    public SimpleStringProperty author_showauthorProperty() {
        return author_showauthor;
    }

    public void setAuthor_showauthor(String author_showauthor) {
        this.author_showauthor.set(author_showauthor);
    }
}
