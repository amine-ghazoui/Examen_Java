package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnexionDB {

    private static Connection connection;

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinet_medical", "root", "");
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection(){

        return connection;
    }
}
