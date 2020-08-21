package sample.Models;

import javafx.beans.property.SimpleStringProperty;

public class ShowBookByType {
    private final SimpleStringProperty title_showtype;
    private final SimpleStringProperty type_showtype;

    public ShowBookByType(String title_showtype, String type_showtype) {
        this.title_showtype =new SimpleStringProperty(title_showtype);
        this.type_showtype = new SimpleStringProperty(type_showtype);
    }

    public String getTitle_showtype() {
        return title_showtype.get();
    }

    public SimpleStringProperty title_showtypeProperty() {
        return title_showtype;
    }

    public void setTitle_showtype(String title_showtype) {
        this.title_showtype.set(title_showtype);
    }

    public String getType_showtype() {
        return type_showtype.get();
    }

    public SimpleStringProperty type_showtypeProperty() {
        return type_showtype;
    }

    public void setType_showtype(String type_showtype) {
        this.type_showtype.set(type_showtype);
    }
}
