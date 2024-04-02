/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author YUDHIS
 */
public class konversi {
    private static Double angka1, angka2, hasil;
    private static String operator1, operator2;
    private PreparedStatement pst;
    private String query;
    private Connection koneksi;

    public konversi() {
        koneksi conn = new koneksi();
        koneksi = conn.getKoneksi();
    }

    public static Double getAngka1() {
        return angka1;
    }

    public static void setAngka1(Double angka1) {
        konversi.angka1 = angka1;
    }

    public static Double getAngka2() {
        return angka2;
    }

    public static void setAngka2(Double angka2) {
        konversi.angka2 = angka2;
    }

    public static Double getHasil() {
        return hasil;
    }

    public static void setHasil(Double hasil) {
        konversi.hasil = hasil;
    }

    public static String getOperator1() {
        return operator1;
    }

    public static void setOperator1(String operator1) {
        konversi.operator1 = operator1;
    }

    public static String getOperator2() {
        return operator2;
    }

    public static void setOperator2(String operator2) {
        konversi.operator2 = operator2;
    }
  
    public void simpanData(Double angka1, String operator1, String operator2, Double hasil) {
        query = "insert into konversi (angka1, operator1, operator2, hasil) values (?,?,?,?)";
        try {
             pst = koneksi.prepareStatement(query);
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
    }
    
    

