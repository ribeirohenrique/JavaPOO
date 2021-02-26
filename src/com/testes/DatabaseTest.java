package com.testes;

public class DatabaseTest {
    public static void main(String[] args) {

        Database bancoDados = new Database();
        DatabaseActions insertTest = new DatabaseActions();

        //Connect and create the table
        bancoDados.connect();
        bancoDados.createNewTable("Teste");

        // insert three new rows
        insertTest.insert("Rango", 100.00);
        insertTest.insert("Asa", 200.00);
        insertTest.insert("Sopa", 12.00);
        insertTest.selectAll();
    }
}
