package org.example;

public class Book {
    private final String title;
    private final String author;
    private int maxDeadline;
    private boolean isInLibrary;
    private String userName;

    public Book(String title, String author, int maxDeadline, boolean isInLibrary) {
        this.title = title;
        this.author = author;
        this.maxDeadline = maxDeadline;
        this.isInLibrary = isInLibrary;
    }

    @Override
    public String toString() {
        return author + ", " + title + ". Книга выдается на " + maxDeadline + " дней.";
    }

    public void setUser(String userName) {
        this.userName = userName;
    }

    public void getUserName() {
        if (userName == null) {
            System.out.println("У книги " + title + " нет читателя.");
        } else {
            System.out.println("Книга " + title + " выдана читателю " + userName);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setMaxDeadline(int maxDeadline) {
        this.maxDeadline = maxDeadline;
    }

    public int getMaxDeadline() {
        return maxDeadline;
    }

    public void setInLibrary(boolean isInLibrary) {
        this.isInLibrary = isInLibrary;
    }

    public boolean getInLibrary() {
        return this.isInLibrary;
    }

    public void isBookInLibrary() {
        if (isInLibrary) {
            System.out.println("Книга " + title + " находится в билиотеке.");
        } else {
            System.out.println("Книги " + title + " нет в библиотеке.");
        }
    }
}
