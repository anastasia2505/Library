package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ReaderTicket {
    private final SimpleIntegerProperty id_reader_ticket;
    private final SimpleStringProperty reader_rticket;
    private final SimpleStringProperty date_of_birth_rticket;
    private final SimpleStringProperty type_occup_rticket;

    public ReaderTicket( Integer id_reader_ticket, String reader_rticket, String date_of_birth_rticket, String type_occup_rticket) {
        this.id_reader_ticket = new SimpleIntegerProperty(id_reader_ticket);
        this.reader_rticket = new SimpleStringProperty(reader_rticket);
        this.date_of_birth_rticket = new SimpleStringProperty(date_of_birth_rticket);
        this.type_occup_rticket = new SimpleStringProperty(type_occup_rticket);
    }

    public int getId_reader_ticket() {
        return id_reader_ticket.get();
    }

    public SimpleIntegerProperty id_reader_ticketProperty() {
        return id_reader_ticket;
    }

    public void setId_reader_ticket(int id_reader_ticket) {
        this.id_reader_ticket.set(id_reader_ticket);
    }

    public String getReader_rticket() {
        return reader_rticket.get();
    }

    public SimpleStringProperty reader_rticketProperty() {
        return reader_rticket;
    }

    public void setReader_rticket(String reader_rticket) {
        this.reader_rticket.set(reader_rticket);
    }

    public String getDate_of_birth_rticket() {
        return date_of_birth_rticket.get();
    }

    public SimpleStringProperty date_of_birth_rticketProperty() {
        return date_of_birth_rticket;
    }

    public void setDate_of_birth_rticket(String date_of_birth_rticket) {
        this.date_of_birth_rticket.set(date_of_birth_rticket);
    }

    public String getType_occup_rticket() {
        return type_occup_rticket.get();
    }

    public SimpleStringProperty type_occup_rticketProperty() {
        return type_occup_rticket;
    }

    public void setType_occup_rticket(String type_occup_rticket) {
        this.type_occup_rticket.set(type_occup_rticket);
    }
}
