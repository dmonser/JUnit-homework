package org.example;

import org.example.people.*;

class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "Л.Н. Толстой", 30, true);
        Book book2 = new Book("1984", "Дж. Оруэлл", 14, false);
        Book book3 = new Book("Метро 2033", "Дмитрий Глуховский", 20, false);
        Book book4 = new Book("Метро 2034", "Дмитрий Глуховский", 20, false);

        Reader reader = new Reader("Fedor");
        Librarian librarian = new Librarian("Svetlana Vasilyevna");
        Supplier supplier = new Supplier("Kirill Vladimirovich");
        Administrator administrator = new Administrator("Natalya");

        librarian.orderBook(book2, supplier);
        librarian.orderBook(book1, supplier);
        administrator.orderBook(book3, supplier);
        administrator.orderBook(book4, supplier);
        System.out.println();

        reader.takeBook(book3);
        reader.reed();
        supplier.takeBook(book3);
        supplier.takeBook(book2);
        System.out.println();

        book2.getUserName();
        book3.getUserName();
        administrator.overdueNotification(reader, 15);
        administrator.overdueNotification(supplier, 21);
        supplier.giveAwayBook();
        administrator.overdueNotification(librarian, 3);
    }
}