package it.polito.library;

import java.util.LinkedList;
import java.util.TreeMap;

public class Book {
    String id;
    String title;
    int number;
    boolean available;
    LinkedList<Book> duplicated;
    TreeMap<String,String> renters;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.number = 1;
        this.available = true;
        this.renters = new TreeMap<>();
        this.duplicated = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void newRenter(Reader reader, Rental rental) {
        renters.put(reader.getId(), rental.toString());
    }

    public TreeMap<String, String> getRenters() {
        return renters;
    }

    public void addDuplicated(Book b) {
        this.duplicated.add(b);
    }

    public Integer getDuplicatedNumber() {
        return this.duplicated.size() + 1;
    }

    
}
