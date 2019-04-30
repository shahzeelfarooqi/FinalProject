/**
 * Created by 305 team on 4/30/2019.
 */
package sample;

import java.sql.*;
import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        String url = "jdbc:mysql://" + "localhost:3306" + "/" + "mipsmazon";
      //  String driverName = "org.gjt.mm.mysql.Driver";
       // String driverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /*try {
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }*/

        try {
            Connection conn = (Connection) DriverManager.getConnection(url, "admin","password");
        }catch (SQLException e){
            System.out.println("Connection to the database failed: " + e.getMessage());
        }
    }

}