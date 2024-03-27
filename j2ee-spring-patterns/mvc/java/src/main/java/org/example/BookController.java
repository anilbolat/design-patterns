package org.example;

public class BookController {
    
    private final Book book;
    private final BookView view;
    
    public BookController(Book book, BookView view) {
        this.book = book;
        this.view = view;
    }
    
    public int getID() {
        return this.book.getID();
    }
    
    public String getName() {
        return this.book.getName();
    }
    
    public String getAuthor() {
        return this.book.getAuthor();
    }
    
    public void setName(String name) {
        this.book.setName(name);
    }
    
    public void setAuthor(String author) {
        this.book.setAuthor(author);
    }
    
    public void updateView(Book book) {
        view.print(book);
    }
    
}
