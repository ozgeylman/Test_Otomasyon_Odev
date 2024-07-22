package org.example;

import java.sql.*;

public class LocalCRUDOperations {

    // Yerel veritabanı bağlantı bilgileri
    private static final String LOCAL_DB_URL = "jdbc:mysql://localhost:3306/localdb";
    private static final String LOCAL_USER = "root";
    private static final String LOCAL_PASS = "root";

    public static void main(String[] args) {
        performLocalCRUDOperations();
    }

    private static void performLocalCRUDOperations() {
        try (Connection conn = DriverManager.getConnection(LOCAL_DB_URL, LOCAL_USER, LOCAL_PASS)) {
            // Insert
            String insertSQL = "INSERT INTO personel (isim, soyisim, departman) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setString(1, "Ali");
                pstmt.setString(2, "Veli");
                pstmt.setString(3, "IT");
                pstmt.executeUpdate();
            }

            // Select
            String selectSQL = "SELECT * FROM personel";
            try (PreparedStatement pstmt = conn.prepareStatement(selectSQL);
                 ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ", " + rs.getString("isim") + ", " + rs.getString("soyisim") + ", " + rs.getString("departman"));
                }
            }

            // Update
            String updateSQL = "UPDATE personel SET departman = ? WHERE isim = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
                pstmt.setString(1, "HR");
                pstmt.setString(2, "Ali");
                pstmt.executeUpdate();
            }

            // Delete
            String deleteSQL = "DELETE FROM personel WHERE isim = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
                pstmt.setString(1, "Ali");
                pstmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}