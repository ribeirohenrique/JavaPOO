package com.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Database {
    String dbName;
    String tableName;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName + ".db";
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void connect() {
        Connection conn = null;
        try {
            //Name to the database
            Scanner nameDatabase = new Scanner(System.in);
            System.out.print("Write the name of the new Database: ");
            this.setDbName(nameDatabase.nextLine());

            //db parameters
            String url = "jdbc:sqlite:D:/Desenvolvimento/JavaPOO/db/" + this.getDbName();

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

    //Create a new table in the database
    public void createNewTable(String tableName) {
        //Name to the Table
        this.setTableName(tableName);

        // SQLite connection string
        String url = "jdbc:sqlite:D:/Desenvolvimento/JavaPOO/db/" + this.getDbName();


        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS " + this.getTableName() + "(\n"
                + "	id integer PRIMARY KEY, \n"
                + "	name text NOT NULL, \n"
                + "	capacity real \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // Command to execute the create new table above
            stmt.execute(sql);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
