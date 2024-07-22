package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LocalDatabaseSetup {

    // Yerel veritabanı bağlantı bilgileri
    private static final String LOCAL_DB_URL = "jdbc:mysql://localhost:3306/localdb";
    private static final String LOCAL_USER = "root";
    private static final String LOCAL_PASS = "root";

    public static void main(String[] args) {
        setupLocalDatabase();
    }

    private static void setupLocalDatabase() {
        try (Connection conn = DriverManager.getConnection(LOCAL_DB_URL, LOCAL_USER, LOCAL_PASS)) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS personel ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "isim VARCHAR(100), "
                    + "soyisim VARCHAR(100), "
                    + "departman VARCHAR(100))";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQL);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
