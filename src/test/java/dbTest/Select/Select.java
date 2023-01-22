package dbTest.Select;

import dbTest.dbHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends dbHelper {

    @Test(description = "Select from db customer table")
    public void selectCustomersNumber() {
        try {
            String query = "SELECT * FROM classicmodels.customers WHERE customerNumber=119;";
            ResultSet results = stmt.executeQuery(query);
            while (results.next()) {
                System.out.println(results.getString(1));
                System.out.println(results.getString("city"));
                System.out.println(results.getString("city").contains("Nantes"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db customer table", enabled = false)
    public void selectCustomersName() {
        try {
            String query = "SELECT * FROM classicmodels.customers;";
            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db customer table" , enabled = false)
    public void selectContactLastName() {
        try {
            String query = "SELECT * FROM classicmodels.customers;";
            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Select from db customer table" , enabled = false)
    public void selectOfiice() {
        try {
            String query = "SELECT * FROM classicmodels.offices;";
            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
