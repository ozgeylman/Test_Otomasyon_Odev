package org.example;

import org.jdbi.v3.core.Jdbi;

    public class RemoteDatabaseSetup {

        // Uzak veritabanı bağlantı bilgileri
        private static final String REMOTE_DB_URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/data";
        private static final String REMOTE_USER = "ozge";
        private static final String REMOTE_PASS = "123";

        public static void main(String[] args) {
            setupRemoteDatabase();
        }

        private static <Jdbi> void setupRemoteDatabase() {
            Jdbi jdbi = Jdbi.create(REMOTE_DB_URL, REMOTE_USER, REMOTE_PASS);

            jdbi.hashCode(handle -> {
                handle.execute("CREATE TABLE IF NOT EXISTS ad_soyad ("
                        + "id INT AUTO_INCREMENT PRIMARY KEY, "
                        + "isim VARCHAR(100), "
                        + "soyisim VARCHAR(100), "
                        + "departman VARCHAR(100))");
            });
        }
    }