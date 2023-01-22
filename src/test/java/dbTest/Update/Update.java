package dbTest.Update;

import dbTest.dbHelper;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Update extends dbHelper{
    @Test(description = "Update to db customer table")
    public void updateEmployeeName() {
        try {
            String query = "UPDATE `classicmodels`.`employees`\n" +
                    "SET\n" +
                    "`employeeNumber` = null,\n" +
                    "`lastName` = '',\n" +
                    "`firstName` =''\n" +
                    "WHERE `employeeNumber` = 958;";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was updated with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Update to db customer table", enabled = false)
    public void updateCustomerPhoneNumber() {
        try {
            String query = "UPDATE `classicmodels`.`customers`\n" +
                    "SET\n" +
                    "`phone` = '0736608004'\n" +
                    "WHERE `customerNumber` = 5;";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was updated with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Update to db customer table", enabled = false)
    public void updateCustomerName() {
        try {
            String query = "UPDATE `classicmodels`.`customers`\n" +
                    "SET\n" +
                    "`customerName` = 'Second customer'\n" +
                    "WHERE `customerNumber` = 2;";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was updated with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Update to db customer table", enabled = false)
    public void updateCustomersName() {
        try {
            String query = "UPDATE `classicmodels`.`customers`\n" +
                    "SET\n" +
                    "`contactFirstName` = 'null:))'\n" +
                    "WHERE `customerNumber` = 8;";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was updated with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
