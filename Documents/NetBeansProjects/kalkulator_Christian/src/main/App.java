/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

//import static main.KalkulatorForm.pembagian;
//import static main.KalkulatorForm.pengurangan;
//import static main.KalkulatorForm.penjumlahan;
//import static main.KalkulatorForm.perkalian;
/**
 *
 * @author YUDHIS
 */

public class App {
    
 
    public static Double hitung(Double angka1, Double angka2, String operator) {
        Double hasil = null;
        if (operator.equals("+")) {
            hasil = penjumlahan(angka1, angka2);
        } else if (operator.equals("-")) {
            hasil = pengurangan(angka1, angka2);
        } else if (operator.equals(":")) {
            hasil = pembagian(angka1, angka2);
        } else if (operator.equals("x")) {
            hasil = perkalian(angka1, angka2);
        }
        return hasil;
    }

    public static void main(String[] args) {
        KalkulatorForm kf = new KalkulatorForm();
        kf.setLocationRelativeTo(null);
        kf.setVisible(true);
        
        
    }
    
    
   
//    private static boolean isValidOperator(String operator) {
//    return operator.equals("+") || operator.equals("-") || operator.equals(":") || operator.equals("x");
//}   

   
    public static Double penjumlahan(Double angka1, Double angka2) {
        Double hasil = angka1 + angka2;
        return hasil;
    }

    public static Double pengurangan(Double angka1, Double angka2) {
        Double hasil = angka1 - angka2;
        return hasil;
    }

    public static Double pembagian(Double angka1, Double angka2) {
//        Double hasil = angka1 / angka2;

 if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            JOptionPane.showMessageDialog(null, "Pembagian dengan nol tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
//        return hasil;
    }

    public static Double perkalian(Double angka1, Double angka2) {
        Double hasil = angka1 * angka2;
        return hasil;
    }
    
    public static void kalkulator(Double angka1, Double angka2, String operator, Double hasil) {
        Connection connect;
        PreparedStatement pst;
        
        
        String url = "jdbc:mysql://localhost:3306/kalkulator";
        String username = "root";
        String password = "";
        String query = "INSERT INTO kalkulator (angka1, angka2, operator, hasil) values (?, ?, ?, ?)";
        try {
            connect = DriverManager.getConnection(url, username, password);
         pst = connect.prepareStatement(query);
            pst.setDouble(1, angka1);
            pst.setDouble(2, angka2);
            pst.setString(3, operator);
            pst.setDouble(4, hasil);
            pst.executeUpdate();
            pst.close();
    }catch (Exception e) {
            System.out.println("Gagal" + e); 
    
}
    
        
        
        
        
    }
}

   

