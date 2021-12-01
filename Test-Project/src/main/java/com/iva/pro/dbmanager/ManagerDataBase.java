package com.iva.pro.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManagerDataBase {


    public void conectDB() throws SQLException {
//        java.sql.Connection
        String urlDB = "";
        Connection cn = DriverManager.getConnection(urlDB);
        System.out.println("Conectados");


    }


}
