package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShowBookByTitle {
    private final SimpleIntegerProperty id_showtitle;
    private final SimpleStringProperty title_showtitle;
    private final SimpleStringProperty author_showtitle;
    private final SimpleStringProperty lib_showtitle;


    public ShowBookByTitle( Integer id_showtitle, String author_showtitle, String lib_showtitle, String title_showtitle) {
        this.id_showtitle = new SimpleIntegerProperty(id_showtitle);
        this.title_showtitle = new SimpleStringProperty(title_showtitle);
        this.author_showtitle = new SimpleStringProperty(author_showtitle);
        this.lib_showtitle = new SimpleStringProperty(lib_showtitle);
    }

    public int getId_showtitle() {
        return id_showtitle.get();
    }

    public SimpleIntegerProperty id_showtitleProperty() {
        return id_showtitle;
    }

    public void setId_showtitle(int id_showtitle) {
        this.id_showtitle.set(id_showtitle);
    }

    public String getAuthor_showtitle() {
        return author_showtitle.get();
    }

    public SimpleStringProperty author_showtitleProperty() {
        return author_showtitle;
    }

    public void setAuthor_showtitle(String date_showtitle) {
        this.author_showtitle.set(date_showtitle);
    }

    public String getLib_showtitle() {
        return lib_showtitle.get();
    }

    public SimpleStringProperty lib_showtitleProperty() {
        return lib_showtitle;
    }

    public void setLib_showtitle(String lib_showtitle) {
        this.lib_showtitle.set(lib_showtitle);
    }

    public String getTitle_showtitle() {
        return title_showtitle.get();
    }

    public SimpleStringProperty title_showtitleProperty() {
        return title_showtitle;
    }

    public void setTitle_showtitle(String title_showtitle) {
        this.title_showtitle.set(title_showtitle);
    }
}
