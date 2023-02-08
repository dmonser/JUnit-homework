package org.example.people;

import org.example.Book;

public abstract class User implements Readers {
    private String name;
    private Book book;
    protected String role;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(Book book) {
        if (book.getInLibrary()) {
            this.book = book;
            System.out.println(role + " " + name + " взял книгу " + this.book.getTitle() + " в библиотеке на " + this.book.getMaxDeadline() + " дней.");
            book.setInLibrary(false);
            book.setUser(name);
        } else {
            System.out.println(role + " " + name + " не смог взять книгу " + book.getTitle() + " из-за того, что она отсутствует в библиотеке.");
        }
    }

    @Override
    public void giveAwayBook() {
        if (book == null) {
            haveNotBook();
        } else {
            System.out.println(role + " " + name + " вернул книгу " + book.getTitle() + " в библиотеку.");
            book.setInLibrary(true);
            book.setUser(null);
            this.book = null;
        }
    }

    ;

    @Override
    public void reed() {
        if (book == null) {
            haveNotBook();
        } else {
            System.out.println(role + " " + name + " читает книгу " + book.getTitle());
        }
    }

    @Override
    public void haveNotBook() {
        System.out.println("У " + role + " " + name + " нет книги.");
    }

    @Override
    public String toString() {
        return "Здравствуйте! Меня зовут " + name + ". Я " + role + " в этой библиотеке.";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Book getBook() {
        return book;
    }

    @Override
    public String getRole() {
        return role;
    }
}
