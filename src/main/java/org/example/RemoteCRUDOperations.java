package org.example;

import org.jdbi.v3.core.Jdbi;

public class RemoteCRUDOperations {

    // Uzak veritabanı bağlantı bilgileri
    private static final String REMOTE_DB_URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/data";
    private static final String REMOTE_USER = "ozge";
    private static final String REMOTE_PASS = "123";

    public static void main(String[] args) {
        performRemoteCRUDOperations();
    }

    private static void performRemoteCRUDOperations() {
        Jdbi jdbi = Jdbi.create(REMOTE_DB_URL, REMOTE_USER, REMOTE_PASS);

        // Insert
        jdbi.useHandle(handle -> {
            handle.createUpdate("INSERT INTO ad_soyad (isim, soyisim, departman) VALUES (?, ?, ?)")
                    .bind(0, "Ahmet")
                    .bind(1, "Kaya")
                    .bind(2, "Finance")
                    .execute();
        });

        // Select
        jdbi.useHandle(handle ->
                handle.createQuery("SELECT * FROM ad_soyad")
                        .mapToMap()
                        .list()
                        .forEach(System.out::println)
        );

        // Update
        jdbi.useHandle(handle -> {
            handle.createUpdate("UPDATE ad_soyad SET departman = ? WHERE isim = ?")
                    .bind(0, "IT")
                    .bind(1, "Ahmet")
                    .execute();
        });

        // Delete
        jdbi.useHandle(handle -> {
            handle.createUpdate("DELETE FROM ad_soyad WHERE isim = ?")
                    .bind(0, "Ahmet")
                    .execute();
        });
    }
}