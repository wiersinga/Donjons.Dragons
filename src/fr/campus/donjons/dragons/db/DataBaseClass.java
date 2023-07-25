package fr.campus.donjons.dragons.db;

import java.sql.*;

public class DataBaseClass {
    public DataBaseClass() {
        //Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons","root","password");
        Connection con;
        {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "root", "password");
                Statement stm = con.createStatement();
                ResultSet res = stm.executeQuery("select ID, Type from Character");
                while (res.next()) {
                    System.out.println("id:" + res.getString(1) + ", type:" + res.getString(2));
                    System.out.println("-------------------");
                }
                con.close();
            } catch (Exception e) {
                System.out.println("ERROR :" + e.getMessage());
            }
        }

    }
    @Override
    public String toString () {
        return "DataBaseClass{}";
    }
}