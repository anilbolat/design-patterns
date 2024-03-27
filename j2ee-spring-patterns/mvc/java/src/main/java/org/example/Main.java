package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(10, "Dune", "Frank");
        BookView view = new BookView();
        BookController controller = new BookController(book, view);
        
        controller.updateView(book);
        
        controller.setName("Dune 2");
        
        controller.updateView(book);
    }
}