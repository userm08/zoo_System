import db.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection conn = DatabaseConnection.connect();

        if (conn == null) {
            System.out.println("Connection failed");
            return;
        }

        System.out.println("Connected to database!");

        try {
            Statement stmt = conn.createStatement();

            // ---------- READ ----------
            System.out.println("READ:");
            ResultSet rs = stmt.executeQuery(
                    "SELECT name, species, age FROM animal"
            );

            while (rs.next()) {
                System.out.println(
                        rs.getString("name") + " | " +
                                rs.getString("species") + " | " +
                                rs.getInt("age")
                );
            }

            // ---------- WRITE (INSERT) ----------
            int inserted = stmt.executeUpdate(
                    "INSERT INTO animal (name, species, age, zoo_id) " +
                            "VALUES ('Nala', 'Lion', 3, 1)"
            );
            System.out.println("Inserted rows: " + inserted);

            // ---------- UPDATE ----------
            int updated = stmt.executeUpdate(
                    "UPDATE animal SET age = age + 1 WHERE name = 'Nala'"
            );
            System.out.println("Updated rows: " + updated);

            // ---------- DELETE ----------
            int deleted = stmt.executeUpdate(
                    "DELETE FROM animal WHERE name = 'Nala'"
            );
            System.out.println("Deleted rows: " + deleted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
