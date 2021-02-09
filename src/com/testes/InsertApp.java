package com.testes;

import java.sql.*;

public class InsertApp {


    //Connect to the test.db database
    //Return the Connection object
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:/Desenvolvimento/JavaPOO/db/dbTest.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    //Insert a new row into the warehouses table
    public void insert(String name, double capacity) {
        String sql = "INSERT INTO warehouses(name,capacity) VALUES(?,?)";

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
        String sql = "SELECT id, name, capacity FROM warehouses";

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


    public static void main(String[] args) {

        InsertApp insertTest = new InsertApp();
        // insert three new rows
        insertTest.insert("Raw Materials", 3000);
        insertTest.insert("Semifinished Goods", 4000);
        insertTest.insert("Finished Goods", 5000);

        insertTest.selectAll();
    }

}
