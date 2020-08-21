package sample.Models;

import javafx.beans.property.SimpleStringProperty;

public class ShowBookByType {
    private final SimpleStringProperty title_showtype;
    private final SimpleStringProperty type_showtype;

    public ShowBookByType(String title_showtype, String type_showtype) {
        this.title_showtype =new SimpleStringProperty(title_showtype);
        this.type_showtype = new SimpleStringProperty(type_showtype);
    }

    public SimpleStringProperty title_showtypeProperty() {
        return title_showtype;
    }

    public SimpleStringProperty type_showtypeProperty() {
        return type_showtype;
    }
}
