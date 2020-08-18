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

    public int getId_lib() {
        return id_lib.get();
    }

    public SimpleIntegerProperty id_libProperty() {
        return id_lib;
    }

    public void setId_lib(int id_lib) {
        this.id_lib.set(id_lib);
    }

    public String getName_lib() {
        return name_lib.get();
    }

    public SimpleStringProperty name_libProperty() {
        return name_lib;
    }

    public void setName_lib(String name_lib) {
        this.name_lib.set(name_lib);
    }

    public String getAddress_lib() {
        return address_lib.get();
    }

    public SimpleStringProperty address_libProperty() {
        return address_lib;
    }

    public void setAddress_lib(String address_lib) {
        this.address_lib.set(address_lib);
    }

    public String getEmail_lib() {
        return email_lib.get();
    }

    public SimpleStringProperty email_libProperty() {
        return email_lib;
    }

    public void setEmail_lib(String email_lib) {
        this.email_lib.set(email_lib);
    }

    public String getPhone_lib() {
        return phone_lib.get();
    }

    public SimpleStringProperty phone_libProperty() {
        return phone_lib;
    }

    public void setPhone_lib(String phone_lib) {
        this.phone_lib.set(phone_lib);
    }
}
