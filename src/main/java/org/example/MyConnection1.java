package org.example;

import java.sql.*;

public class MyConnection1 {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","5671341");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ogrenciler");
           while (rs.next()) {
               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
               // System.out.println(rs.getInt("id")+" "+rs.getString("Isim")+" "+rs.getString("adress")+" "+rs.getInt("sinav_notu"));
           }
            connection.close();

/*
while (!rs.isLast()){
rs.next();
System.out.println(rs.getInt(1)
        +" "+rs.getString(2)+
        " "+rs.getString(3)+
        " "+ rs.getInt(4));
}
con.close();
 */

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
