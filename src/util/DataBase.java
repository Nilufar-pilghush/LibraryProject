package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private Connection connection;
    private String databaseUrl;
    private String databaseUserName;
    private String databasePassword;

    public DataBase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.databaseUrl = "jdbc:mysql://localhost:3306/librarry";
        this.databaseUserName = "root";
        this.databasePassword = "Tec88646*";
        this.connection = DriverManager.getConnection(
                databaseUrl, databaseUserName, databasePassword
        );
    }


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
