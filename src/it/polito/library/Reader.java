package it.polito.library;

import java.util.TreeMap;

public class Reader {
    String id;
    String name;
    String surname;
    TreeMap<String,Rental> rented;

    public Reader(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.rented = new TreeMap<>();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void newRentedBook(Book book, Rental rental) {
        rented.put(book.getId(), rental);
        book.setAvailable(false);
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    


}
