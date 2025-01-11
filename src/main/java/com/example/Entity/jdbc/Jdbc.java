package com.example.Entity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/entity";
        String root = "root";
        String pass = "shkoder2023";

        try {
            Connection connection = DriverManager.getConnection(url, root, pass);
            Statement statement = connection.createStatement();

            String a="SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(a);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Long namepass = resultSet.getLong("passport_id");
                System.out.println("EMER PERSONI > " + name + " EMER PASS > " + namepass);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
