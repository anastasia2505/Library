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

    public SimpleIntegerProperty id_showtitleProperty() {
        return id_showtitle;
    }
    public SimpleStringProperty author_showtitleProperty() {
        return author_showtitle;
    }
    public SimpleStringProperty lib_showtitleProperty() {
        return lib_showtitle;
    }
    public SimpleStringProperty title_showtitleProperty() {
        return title_showtitle;
    }
}
