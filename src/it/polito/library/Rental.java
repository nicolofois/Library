package it.polito.library;

public class Rental {
    int id;
    Book book;
    Reader reader;
    String starting;
    String ending;
    
    public Rental(int id, Book book, Reader reader, String starting) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.starting = starting;
        this.ending = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public String getStarting() {
        return starting;
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String end) {
        this.ending = end;
    }

    public String toString() {
        return this.starting + " " + this.ending;
    }


}
