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

    public int getId_reader() {
        return id_reader.get();
    }

    public SimpleIntegerProperty id_readerProperty() {
        return id_reader;
    }

    public void setId_reader(int id_reader) {
        this.id_reader.set(id_reader);
    }

    public String getStatus_reader() {
        return status_reader.get();
    }

    public SimpleStringProperty status_readerProperty() {
        return status_reader;
    }

    public void setStatus_reader(String status_reader) {
        this.status_reader.set(status_reader);
    }

    public int getNumber_ticket_reader() {
        return number_ticket_reader.get();
    }

    public SimpleIntegerProperty number_ticket_readerProperty() {
        return number_ticket_reader;
    }

    public void setNumber_ticket_reader(int number_ticket_reader) {
        this.number_ticket_reader.set(number_ticket_reader);
    }
}
