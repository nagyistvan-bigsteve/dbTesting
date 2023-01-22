package dbTest.Insert;

import dbTest.dbHelper;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert extends dbHelper{

    @Test(description = "Insert to db customer table", enabled = false)
    public void insertCustomer1() {
        try {
            String query = "INSERT INTO `classicmodels`.`customers`\n" +
                    "(`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`addressLine2`,\n" +
                    "`city`,`state`,`postalCode`,`country`,`salesRepEmployeeNumber`,`creditLimit`) VALUES\n" +
                    "(2, 'Nagy Istvan', 'Istvan', 'Nagy','0789456465', 'Nusfalau', ' ', ' ', ' ', ' ', ' ', null, 1.1);";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was inserted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Insert to db customer table", enabled = false)
    public void insertCustomer2() {
        try {
            String query = "INSERT INTO `classicmodels`.`customers`\n" +
                    "(`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`addressLine2`,\n" +
                    "`city`,`state`,`postalCode`,`country`,`salesRepEmployeeNumber`,`creditLimit`) VALUES\n" +
                    "(3, 'Nagy Ruben', 'Ruben', 'Nagy',' ', ' ', ' ', 'New York', ' ', ' ', ' ', null, 1.1);";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was inserted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Insert to db customer table", enabled = false)
    public void insertCustomer3() {
        try {
            String query = "INSERT INTO `classicmodels`.`customers`\n" +
                    "(`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`addressLine2`,\n" +
                    "`city`,`state`,`postalCode`,`country`,`salesRepEmployeeNumber`,`creditLimit`) VALUES\n" +
                    "(5, 'Alexandru Kiss', 'Sanyi', 'Kiss','0736608004', 'Ciganyi', ' ', 'Salaj', 'Romania', ' ', ' ', null, 1.1);";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was inserted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Insert to db customer table", enabled = false)
    public void insertCustomer4() {
        try {
            String query = "INSERT INTO `classicmodels`.`customers`\n" +
                    "(`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`addressLine2`,\n" +
                    "`city`,`state`,`postalCode`,`country`,`salesRepEmployeeNumber`,`creditLimit`) VALUES\n" +
                    "(6, ' ', ' ', ' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', null, 1.1);";
            int results = stmt.executeUpdate(query);
            if(results!=0){
                System.out.println("Customer was inserted with succesfuly");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
