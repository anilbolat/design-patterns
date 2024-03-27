package org.example;

public class Book {
    
    private final int ID;
    private String name;
    private String author;
    
    public Book(int ID, String name, String author) {
        this.ID = ID;
        this.name = name;
        this.author = author;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
