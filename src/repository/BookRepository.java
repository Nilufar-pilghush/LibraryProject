package repository;

import mainclasses.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public BookRepository(Connection connection) {
        this.connection = connection;
    }

    private Connection connection;
    private Book book;
    public Book save(Book book) throws SQLException {
        String query =
                "insert into librarry.book (name , author , status) values ( ? , ? , ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1 , book.getName());
        preparedStatement.setString(2 , book.getAuthor());
        preparedStatement.setBoolean(3 , book.getStatus());
        preparedStatement.executeUpdate();
        return book;

    }
    public void deleteBooks (Integer id) throws SQLException {
        String query =
                "delete from librarry.book where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1 , book.getId());
        preparedStatement.executeUpdate();

    }
//    public Book findById throws SQLException {
//        String query =
//                "select * from librarry.book where id = ?";
//        PreparedStatement preparedStatement = connection.prepareStatement(query);
//        preparedStatement.setInt(1 , book.getId());
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while(resultSet.next()){
//            book = new book(resultSet.getInt(1)), resultSet.getString(2)
//                    ,resultSet.getBoolean(3);
//
//        }
//            return book;
//    }
//






}
//    private Connection connection;
//    private Book book;
//    public List<Book> bookList = new ArrayList<>();
//    public Book insertintoBook() throws SQLException{
//        String query = "";
//
//        PreparedStatement preparedStatement = connection.prepareStatement(query);
//        preparedStatement.setString(1, book.getTitle());
//        preparedStatement.setString(1, book.getGenre());
//        preparedStatement.setBoolean(2, book.getStatus());
//        preparedStatement.executeUpdate();
//        return book;
//    }
