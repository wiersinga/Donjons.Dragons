package fr.campus.donjons.dragons.db;

import java.sql.*;

public class DataBaseClass {
    public DataBaseClass() {

    }
    public void dataBaseClass() {
        Connection conn;
        {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "root", "password");
                Statement stm = conn.createStatement();
                ResultSet res = stm.executeQuery("SELECT `ID` FROM `Character`");
                while (res.next()) {
                    System.out.println("id:" + res.getString(1));
                    //System.out.println("-------------------");
                }
                conn.close();
            } catch (Exception e) {
                System.out.println("ERROR :" + e.getMessage());
            }
        }

    }
//    public void insertIntoDb(){
//        try {
//            String sql1 = "INSERT INTO `Character`"+"VALUES ("
//
//        }
//    }









    public static void main(String[] args) {
        DataBaseClass dbConnexion = new DataBaseClass();
        dbConnexion.dataBaseClass();
        System.out.println(dbConnexion);
    }
}



