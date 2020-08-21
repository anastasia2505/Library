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


    public int getId_reader_show() {
        return id_reader_show.get();
    }

    public SimpleIntegerProperty id_reader_showProperty() {
        return id_reader_show;
    }

    public void setId_reader_show(int id_reader_show) {
        this.id_reader_show.set(id_reader_show);
    }

    public String getReader__name_show() {
        return reader_name_show.get();
    }

    public SimpleStringProperty reader_name_showProperty() {
        return reader_name_show;
    }

    public void setReader__name_show(String reader__name_show) {
        this.reader_name_show.set(reader__name_show);
    }
}
