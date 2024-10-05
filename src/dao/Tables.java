/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CODE
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection Con = ConnectionProvider.getCon();
            Statement st = Con.createStatement();
//            st.executeUpdate("create  table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole Varchar(200),name Varchar(200),DOB Varchar(50),mobileNumber Varchar(50),email Varchar (200), userName Varchar (200),password Varchar(50),address Varchar(200))");
//          st.executeUpdate("insert into appuser(userRole,name,DOB,mobileNumber,email,userName,password,address)values ('Admin','Admin','30-11-2003','0241385701','shadrackappiah250@gmail.com','Shady','Admin','JM0552')");
//           st.executeUpdate("Create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
//           st.executeUpdate("Create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(200),totalPaid bigint,generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null, "Table Created Successfuly");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
