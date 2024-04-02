/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author YUDHIS
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class App {
    konversi a = new konversi();

    public static void main(String[] args) {
        
        konversiForm kv = new konversiForm();
        kv.setLocationRelativeTo(null);
        kv.setVisible(true);
    }
    
    
     public static void tb_konversi (Double angka1, String operator1, String operator2, Double hasil) {
     Connection connect;
     PreparedStatement pst;
     
     String url = "jdbc:mysql://localhost:3306/konversi";
     String username = "root";
     String password = "";
     String query ="INSERT INTO konversi (angka1, operator1, operator2, hasil) values (?, ?, ?, ?)";
//      System.out.print("Masukkan nilai: ");
      
   try {
    connect = DriverManager.getConnection(url, username, password);
    pst = connect.prepareStatement(query);
    pst.setDouble(1, angka1);
    pst.setString(2, operator1);
    pst.setString(3, operator2);
    pst.setDouble(4,hasil);
    pst.executeUpdate();
    pst.close();
    } catch (SQLException ex) {
            System.out.println("insert gagal:" + ex);
        }

     }
   public static Double hitung (Double angka1, String operator1, String operator2) {
         Double hasil = null;
         
             if (operator1.equalsIgnoreCase("kilometer") && operator2.equalsIgnoreCase("meter")) {
        hasil = angka1 * 1000; // 1 kilometer = 1000 meter
    } else if (operator1.equalsIgnoreCase("kilometer") && operator2.equalsIgnoreCase("centimeter")) {
        hasil = angka1 * 100000; // 1 kilometer = 100000 centimeter
        } else if (operator1.equalsIgnoreCase("kilometer") && operator2.equalsIgnoreCase("hektometer")) {
        hasil = angka1 * 10; 
        } else if (operator1.equalsIgnoreCase("kilometer") && operator2.equalsIgnoreCase("dekameter")) {
        hasil = angka1 * 10; 
         } else if (operator1.equalsIgnoreCase("meter") && operator2.equalsIgnoreCase("dekameter")) {
        hasil = angka1 / 10; // 1 meter = 10 dekameter
        } else if (operator1.equalsIgnoreCase("meter") && operator2.equalsIgnoreCase("hektometer")) {
        hasil = angka1 / 100; 
        } else if (operator1.equalsIgnoreCase("meter") && operator2.equalsIgnoreCase("kilometer")) {
        hasil = angka1 / 1000; 
        } else if (operator1.equalsIgnoreCase("centimeter") && operator2.equalsIgnoreCase("kilometer")) {
        hasil = angka1 / 100000; 
    } else if (operator1.equalsIgnoreCase("kilometer") && operator2.equalsIgnoreCase("kilometer")) {
        hasil = angka1; // Jika mengonversi kilometer ke kilometer, hasil tetap sama
    } else {
        System.out.println("Konversi tidak valid.");
    }

 return hasil;
 
}
   
   

   }
   
   
   
    
    

