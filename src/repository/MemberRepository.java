package repository;

import mainclasses.Members;

import java.lang.reflect.Member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    public MemberRepository(Connection connection) {
        this.connection = connection;
    }

    Connection connection;
    private Members member;
    List<Members> members = new ArrayList<>();

    public Members save(Connection connection) throws SQLException {
        String query = "insert into librarry.book (firstName , lastName , username) values ( ? , ? , ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, member.getFullName());
        preparedStatement.setString(1, member.getUsername());
        preparedStatement.setString(1, member.getPassword());
        preparedStatement.executeUpdate();
        member.setId(getMaxId());
        return member;

    }


    public Integer getMaxId() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("select Max(id) from Librarry.book");
        if (resultSet.next()) {
            return resultSet.getInt(1);

        }
        return 0;
    }

    public void removeMember(int id) throws SQLException {
        String query = "delete from Librarry.book where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
//    PreparedStatement.setInt(1 , member.getId());
        preparedStatement.setInt(1, member.getId());
        preparedStatement.executeUpdate();
    }

    public List<Members> findAll() throws SQLException {
        String query = "select * from Librarry.book";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            member = new Members(resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4));
            members.add(member);
        }
        return members;
    }

    public Members findById() throws SQLException {
        String query = "select * from Librarry.book where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, member.getId());
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            member = new Members(resultSet.getInt(1),
                    resultSet.getString(2), resultSet.getString(3),
                    resultSet.getString(4));
        }
        return member;
    }
}
