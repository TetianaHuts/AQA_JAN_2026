package org.prog.session18.HomeWork18.DB;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.prog.session18.HomeWork18.DB.dto.PhonesDto;
import org.testng.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBTests {
    private Connection conn;
   public static List<PhonesDto> phonesList= new ArrayList<>();

    @Before
    public void beforeSuite() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "root",
                "password"
        );
    }

    @After
    public void afterSuite() throws SQLException {
        if(conn != null && !conn.isClosed()){
            conn.close();
        }
    }


   @Then("I synchronize the received data into the DB")
    public void testSQLConnect (DataTable dataTable) throws SQLException {
       PreparedStatement selectStmt = conn.prepareStatement("SELECT Price FROM Phones WHERE Model_Name = ?");
       PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO Phones(Model_Name, Price) VALUES (?,?)");
       for (PhonesDto phone : phonesList){
           selectStmt.setString(1, phone.getModelName());
           ResultSet rs = selectStmt.executeQuery();

           if (rs.next()){
               String dbPrice = rs.getString("Price");
               Assert.assertEquals(phone.getPrice(), dbPrice, "The price didn't match");
           }
           else {
               insertStmt.setString(1, phone.getModelName());
               insertStmt.setString(2, phone.getPrice());
               insertStmt.execute();
               System.out.println("New phone:"+ phone.getModelName());
           }
       }
    }
}
