package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShowDebtors {
    private final SimpleIntegerProperty id_reader_show;
    private final SimpleStringProperty reader_name_show;

    public ShowDebtors( Integer id_reader_show, String reader__name_show) {
        this.id_reader_show = new SimpleIntegerProperty (id_reader_show);
        this.reader_name_show = new SimpleStringProperty(reader__name_show);
    }

    public SimpleIntegerProperty id_reader_showProperty() {
        return id_reader_show;
    }

    public SimpleStringProperty reader_name_showProperty() {
        return reader_name_show;
    }
}
