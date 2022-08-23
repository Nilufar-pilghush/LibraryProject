package repository;

import mainclasses.Borrow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BorrowRepository {
    private Connection connection;
    private Borrow borrow;

    public BorrowRepository(Connection connection) {
        this.connection = connection;
    }
    public Borrow insertIntoBorrowTable() throws SQLException{
        String query = "insert into librarry.borrow (status , book_id , member_id ) values (? , ? , ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1 ,borrow.getStatus().ordinal());
        preparedStatement.setInt(2 , borrow.getBookId());
        preparedStatement.setInt(3 , borrow.getus);

    }

}
