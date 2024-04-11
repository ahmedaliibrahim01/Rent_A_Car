package core;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/rentacar";
    private static final String DB_USER = "postgres";
    private static final String DB_PASS = "ahmed0615592573";


    public static Connection connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection is successful");
        } catch (Exception e){
            System.out.println("Connection is not successful");
            System.out.println(e.getMessage());
        }

        return connection;
    }
}
