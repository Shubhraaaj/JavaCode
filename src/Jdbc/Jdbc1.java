package Jdbc;

/*Java JDBC API:-
It is defined in the following Packages: java.sql, javax.sql
1. java.sql.DriverManager
2. java.sql.Connection
3. java.sql.Statement
4. java.sql.ResultSet
5. java.sql.DataSource (For Connection Pooling)*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {
    public static void main(String args[]) {
        /* Steps to SetUp JDBC Program:-
        1. Get a Connection to DataBase. Syntax: jdbc:- <Driver Protocol>:<Driver Connection Details>
        2. Create a Statement Object
        3. Execute SQL Query
        4. Process Result Set*/

        /*Failure to Connect Exceptions:-
        1. java.sql.SQLException : Bad URL
        2. java.lang.ClassNotFoundException : JDBC driver not in ClassPath*/

        /*Steps with Code Snipets
        1. String dbUrl = "jdbc:mysql://localhost:3306/demo";
            String user = "student";
            String pass = "student";
        2. Connection myConn = DriverManager.getConnection(dbUrl,user,pass);
        3. Statement myStat=myConn.createStatement();
        4. ResultSet myRs=myStmt.executeQuery("select * from employees");
        5. while(myRs.next())
            {
                S.o.pln(myRs.getString("first_name");
                S.o.pln(myRs.getString("last_name");
             }*/
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:DataBase.accdb");
            Statement st = con.createStatement();
            st.execute("CREATE TABLE EMPLOY(EMPID INTEGER,EMPNAME VARCHAR(50))");
            System.out.println("TABLE CREATED");
            st.close();
            con.close();
        } catch (Exception err) {
            System.out.println("ERROR:" + err);
        }
    }
}
