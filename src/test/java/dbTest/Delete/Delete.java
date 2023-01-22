package dbTest.Delete;

import dbTest.dbHelper;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete extends dbHelper{

    @Test(description = "Delete from table",enabled = false)
    public void deleteMethod1() {
        try {
            String query = "DELETE FROM `classicmodels`.`customers`\n" +
                    "WHERE phone = '';";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was deleted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Delete from table", enabled = false)
    public void deleteMethod2() {
        try {
            String query = "DELETE FROM `classicmodels`.`customers`\n" +
                    "WHERE contactFirstName = 'Gabriel';";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was deleted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Test(description = "Delete from table", enabled = false)
    public void deleteMethod3() {
        try {
            String query = "DELETE FROM `classicmodels`.`customers`\n" +
                    "WHERE contacustomarName = 'Cheni Stefan';";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was deleted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Delete from table")
    public void deleteMethod4() {
        try {
            String query = "DELETE FROM `classicmodels`.`customers`\n" +
                    "WHERE city = 'New York';";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was deleted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
