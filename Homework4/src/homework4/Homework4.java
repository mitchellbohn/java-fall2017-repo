package homework4;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * @author Mitchell
 */
public class Homework4 {
    public static void createDatabase(String file) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/" + file)) {
            if (connection != null) {
                DatabaseMetaData metaData = connection.getMetaData();
                System.out.println("The driver name is " + metaData.getDriverName());
                System.out.println("A new database has been created.");
            }
        }
        catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
    }
    
    public static void createTable(String file) {
        String exe = "CREATE TABLE IF NOT EXISTS warehouses (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	capacity real\n"
                + ");";
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/" + file);
                Statement statement = connection.createStatement()) {
            statement.execute(exe);
        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
    }
    
    public static void main(String[] args) {
        createDatabase("data.db");
        createTable("data.db");
    }
    
}
