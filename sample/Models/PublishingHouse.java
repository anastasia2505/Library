package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PublishingHouse {
    private final SimpleIntegerProperty id_ph;
    private final SimpleStringProperty name_ph;
    private final SimpleStringProperty address_ph;
    private final SimpleStringProperty email_ph;
    private final SimpleStringProperty phone_ph;

    public PublishingHouse(Integer id_ph, String name_ph, String address_ph, String email_ph, String phone_ph) {
        this.id_ph =new SimpleIntegerProperty(id_ph);
        this.name_ph = new SimpleStringProperty(name_ph);
        this.address_ph = new SimpleStringProperty(address_ph);
        this.email_ph = new SimpleStringProperty(email_ph);
        this.phone_ph = new SimpleStringProperty(phone_ph);
    }

    public SimpleIntegerProperty id_phProperty() {
        return id_ph;
    }

    public SimpleStringProperty name_phProperty() {
        return name_ph;
    }

    public SimpleStringProperty address_phProperty() {
        return address_ph;
    }

    public SimpleStringProperty email_phProperty() {
        return email_ph;
    }

    public SimpleStringProperty phone_phProperty() {
        return phone_ph;
    }

}
