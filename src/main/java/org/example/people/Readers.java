package org.example.people;

import org.example.Book;

public interface Readers {
    Book getBook();

    String getName();

    void haveNotBook();

    void takeBook(Book book);

    void giveAwayBook();

    void reed();

    String getRole();
}
