package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement st = null;
        //Open the Connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb","root","scaler#abhi19@mysql");
        //System.out.println(con);
        //Prepare SQL Statement
        String SQL = "insert into stud values(1921,'AbhiJaya',100)";
        //Create JDBC statement
        st = con.createStatement();
        //Submit SQL to DB
        int x = st.executeUpdate(SQL);
        //Processing the result
        if(x==1){
            System.out.println("Customer Record is inserted successfully");
        }else{
            System.out.println("Sorry, Customer Record is not Inserted");
        }
    }
}
