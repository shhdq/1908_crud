import java.sql.*;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/preset";
    String USER = "root";
    String PASS = "biskviits";

    // crud - create - register
    public void register() {
        try {
            // create connection and statemnt
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            // sql - insert
            String register = "INSERT INTO users (username, password) VALUES ('ezis', 'mežš')";

            stmt.executeUpdate(register);

            System.out.println("Dati tika ievadīti");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // delete
    public void delete() {
        try {
            // create connection and statemnt
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            // sql - insert
            String delete = "DELETE FROM users WHERE id = 1";

            stmt.executeUpdate(delete);

            System.out.println("Dati tika izdzēsti");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // udpate
    public void update() {
        try {
            // create connection and statemnt
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            // sql - insert
            String update = "UPDATE users SET username = 'mainits' WHERE username = '1908'";

            stmt.executeUpdate(update);

            System.out.println("Dati tika atjaunoti");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // udpate
    public void select() {
        try {
            // create connection and statemnt
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, username, password FROM users");

            while(rs.next()) {
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("username: " + rs.getString("username"));
                System.out.println("pasword: " + rs.getString("password"));
                System.out.println(" ");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
