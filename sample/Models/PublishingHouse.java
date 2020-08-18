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

    public int getId_ph() {
        return id_ph.get();
    }

    public SimpleIntegerProperty id_phProperty() {
        return id_ph;
    }

    public void setId_ph(int id_ph) {
        this.id_ph.set(id_ph);
    }

    public String getName_ph() {
        return name_ph.get();
    }

    public SimpleStringProperty name_phProperty() {
        return name_ph;
    }

    public void setName_ph(String name_ph) {
        this.name_ph.set(name_ph);
    }

    public String getAddress_ph() {
        return address_ph.get();
    }

    public SimpleStringProperty address_phProperty() {
        return address_ph;
    }

    public void setAddress_ph(String address_ph) {
        this.address_ph.set(address_ph);
    }

    public String getEmail_ph() {
        return email_ph.get();
    }

    public SimpleStringProperty email_phProperty() {
        return email_ph;
    }

    public void setEmail_ph(String email_ph) {
        this.email_ph.set(email_ph);
    }

    public String getPhone_ph() {
        return phone_ph.get();
    }

    public SimpleStringProperty phone_phProperty() {
        return phone_ph;
    }

    public void setPhone_ph(String phone_ph) {
        this.phone_ph.set(phone_ph);
    }
}
