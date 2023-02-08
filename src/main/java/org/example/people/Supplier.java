package org.example.people;

import org.example.Book;

public class Supplier extends User implements Suppliers {

    public Supplier(String name) {
        super(name);
        role = "Поставщик";
    }

    @Override
    public void bringBook(Book book) {
        if (book.getInLibrary()) {
            System.out.println(getRole() + " " + getName() + " ответил, что книга " + book.getTitle() + " уже находится в библиотеке.");
            System.out.println();
        } else {
            System.out.println(getRole() + " " + getName() + " доставил книгу " + book.getTitle() + " в библиотеку.");
            System.out.println();
            book.setInLibrary(true);
        }
    }
}
