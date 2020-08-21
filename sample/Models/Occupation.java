package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Occupation {
    private final SimpleIntegerProperty id_type_occupation;
    private final SimpleStringProperty type_occupation;

    public Occupation( Integer id_type_occupation, String type_occupation) {
        this.id_type_occupation = new SimpleIntegerProperty(id_type_occupation);
        this.type_occupation = new SimpleStringProperty(type_occupation);
    }


    public SimpleIntegerProperty id_type_occupationProperty() {
        return id_type_occupation;
    }

    public SimpleStringProperty type_occupationProperty() {
        return type_occupation;
    }

}
