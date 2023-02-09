package org.example.people;

import org.example.Book;

public class Administrator extends User implements Administrators, Librarians {

    public Administrator(String name) {
        super(name);
        role = "Администратор";
    }

    @Override
    public void orderBook(Book book, Suppliers suppliers) {
        System.out.println(getRole() + " " + getName() + " заказал у " + suppliers.getRole() + " " +
                suppliers.getName() + " книгу " + book.getTitle());
        suppliers.bringBook(book);
    }

    @Override
    public void overdueNotification(Readers readers, int day) {       //администратор вводит количество дней со дня взятия юзером книги
        if (readers.getBook() == null) {
            readers.haveNotBook();
        } else {
            Book book = readers.getBook();
            if (day > book.getMaxDeadline()) {
                System.out.println(readers.getName() + "! Вы превысили время, на которое была выдана книга " +
                        book.getTitle() + " на " +
                        "" + (day - book.getMaxDeadline()) +
                        " дней. Прошу Вас в кратчайшие сроки вернуть ее в библиотеку!");
            } else {
                System.out.println(readers.getName() + ", напоминаю, что у Вас осталось " +
                        (book.getMaxDeadline() - day) + " дней до истечения срока. " +
                        "Не забудте вовремя вернуть книгу " + book.getTitle() + " в библиотеку.");
            }
        }
    }
}
