package com.testes;

import java.sql.*;

public class DatabaseActions {
    Database dbName;
    Database tableName;

    public Database getDbName() {
        return dbName;
    }

    public void setDbName(Database dbName) {
        this.dbName = dbName;
    }

    public Database getTableName() {
        return tableName;
    }

    public void setTableName(Database tableName) {
        this.tableName = tableName;
    }

    /**
     * Connect to the test.db database
     * @return the Connection object
     */
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:/Desenvolvimento/JavaPOO/db/" + this.dbName.getDbName();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * Insert a new row into the warehouses table
     *
     * @param name
     * @param capacity
     */
    public void insert(String name, double capacity) {
        System.out.println(tableName.getTableName());
        String sql = "INSERT INTO " + tableName.getTableName() + "(name,capacity) VALUES(?,?)";
        System.out.println("SQL Sentence: " + sql);

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectAll(){
        String sql = "SELECT id, name, capacity FROM " + this.tableName.getTableName();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
