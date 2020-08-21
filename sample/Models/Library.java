package sample.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Library {
    private final SimpleIntegerProperty id_lib;
    private final SimpleStringProperty name_lib;
    private final SimpleStringProperty address_lib;
    private final SimpleStringProperty email_lib;
    private final SimpleStringProperty phone_lib;

    public Library(Integer id_lib, String name_lib, String address_lib, String email_lib, String phone_lib) {
        this.id_lib = new SimpleIntegerProperty(id_lib);
        this.name_lib = new SimpleStringProperty(name_lib);
        this.address_lib = new SimpleStringProperty(address_lib);
        this.email_lib = new SimpleStringProperty(email_lib);
        this.phone_lib = new SimpleStringProperty(phone_lib);
    }

    public SimpleIntegerProperty id_libProperty() {
        return id_lib;
    }

    public SimpleStringProperty name_libProperty() {
        return name_lib;
    }

    public SimpleStringProperty address_libProperty() {
        return address_lib;
    }

    public SimpleStringProperty email_libProperty() {
        return email_lib;
    }

    public SimpleStringProperty phone_libProperty() {
        return phone_lib;
    }

}
