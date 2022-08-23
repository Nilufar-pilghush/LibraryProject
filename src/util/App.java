package util;

import mainclasses.Book;
import mainclasses.Status;
import repository.BookRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Status status = Status.RETURN;
       Menu menu = new Menu();
       menu.welcomToLibrary();
        Scanner scanner = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        BookRepository bookRepository = new BookRepository(dataBase.getConnection());
        Book book = new Book();
        book.setName("divanehafez");
        book.setAuthor("hafez");
        book.setStatus(true);

        bookRepository.save(book);
        }
}
