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

    public int getId_author() {
        return id_author.get();
    }

    public SimpleIntegerProperty id_authorProperty() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author.set(id_author);
    }

    public String getName_author() {
        return name_author.get();
    }

    public SimpleStringProperty name_authorProperty() {
        return name_author;
    }

    public void setName_author(String name_author) {
        this.name_author.set(name_author);
    }

    public String getCountry_author() {
        return country_author.get();
    }

    public SimpleStringProperty country_authorProperty() {
        return country_author;
    }

    public void setCountry_author(String country_author) {
        this.country_author.set(country_author);
    }

    public String getYears_of_life() {
        return years_of_life.get();
    }

    public SimpleStringProperty years_of_lifeProperty() {
        return years_of_life;
    }

    public void setYears_of_life(String years_of_life) {
        this.years_of_life.set(years_of_life);
    }
}
