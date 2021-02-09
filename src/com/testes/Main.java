package com.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void connect() {
        Connection conn = null;
        try {
            //db parameters
            String url = "jdbc:sqlite:D:/Desenvolvimento/JavaPOO/db/dbTest.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    //Create a new table in the test database
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:/Desenvolvimento/JavaPOO/db/dbTest.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
                + "	id integer PRIMARY KEY, \n"
                + "	name text NOT NULL, \n"
                + "	capacity real \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
        createNewTable();
    }

}
