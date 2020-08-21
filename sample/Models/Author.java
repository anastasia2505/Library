package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Author {
    private final SimpleIntegerProperty id_author;
    private final SimpleStringProperty name_author;
    private final SimpleStringProperty country_author;
    private final SimpleStringProperty years_of_life;

    public Author(Integer id_author, String name_author, String  country_author, String years_of_life) {
        this.id_author = new SimpleIntegerProperty (id_author);
        this.name_author = new SimpleStringProperty (name_author);
        this.country_author = new SimpleStringProperty (country_author);
        this.years_of_life = new SimpleStringProperty (years_of_life);
    }

    public SimpleIntegerProperty id_authorProperty() {
        return id_author;
    }

    public SimpleStringProperty name_authorProperty() {
        return name_author;
    }

    public SimpleStringProperty country_authorProperty() {
        return country_author;
    }

    public SimpleStringProperty years_of_lifeProperty() {
        return years_of_life;
    }
}
