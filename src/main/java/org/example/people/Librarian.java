package org.example.people;

import org.example.Book;

public class Librarian extends User implements Librarians {
    public Librarian(String name) {
        super(name);
        role = "Библиотекарь";
    }

    @Override
    public void orderBook(Book book, Suppliers suppliers) {
        System.out.println(getRole() + " " + getName() + " заказал у " + suppliers.getRole() + " " + suppliers.getName() + " книгу " + book.getTitle());
        suppliers.bringBook(book);
    }
}
