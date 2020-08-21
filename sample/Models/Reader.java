package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Reader {
    private final SimpleIntegerProperty id_reader;
    private final SimpleStringProperty status_reader;
    private final SimpleIntegerProperty number_ticket_reader;

    public Reader( Integer id_reader, String status_reader, Integer number_ticket_reader) {
        this.id_reader = new SimpleIntegerProperty (id_reader);
        this.status_reader =new SimpleStringProperty(status_reader);
        this.number_ticket_reader = new SimpleIntegerProperty (number_ticket_reader);
    }

    public SimpleIntegerProperty id_readerProperty() {
        return id_reader;
    }

    public SimpleStringProperty status_readerProperty() {
        return status_reader;
    }

    public SimpleIntegerProperty number_ticket_readerProperty() {
        return number_ticket_reader;
    }
}
