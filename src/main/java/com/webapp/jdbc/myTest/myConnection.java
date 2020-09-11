package com.webapp.jdbc.myTest;

import java.sql.*;

public class myConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false";
        String user = "hbstudent";
        String password = "hbstudent";
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from student";
            ResultSet myRs = myStmt.executeQuery(sql);

            while (myRs.next()) {
                System.out.println(myRs.getString("email") + " - " + myRs.getString("first_name"));
            }
            myConn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
