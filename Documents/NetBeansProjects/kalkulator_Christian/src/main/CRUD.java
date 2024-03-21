/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author YUDHIS
 */
import crud.*;
import java.sql.*;

public class CRUD {

    private Connection CRUDkoneksi;
    private Statement CRUDstat;
    private PreparedStatement CRUDpsmt;
    private ResultSet CRUDhasil;
    private String CRUDquery;
    private String operator, status;
    private String angka1, angka2;
    private Double hasil;

    public CRUD() {
        Koneksi Connection = new Koneksi();
        CRUDkoneksi = Connection.getKoneksi();

    }

    public ResultSet tampilData() {
        CRUDquery = "select * from kalkulator";

        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return CRUDhasil;
    }

    public void simpanData(String angka1, String angka2, String operator, Double hasil) {
        CRUDquery = "insert into kalkulator (angka1. angka2, operator, hasil values (?, ?, ?, ?)";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, angka1);
            CRUDpsmt.setString(2, angka2);
            CRUDpsmt.setString(3, operator);
            CRUDpsmt.setDouble(4, hasil);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        
    }

    public CRUD(String status, String angka1, String angka2, Double hasil) {
        this.status = status;
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.hasil = hasil;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAngka1() {
        return angka1;
    }

    public void setAngka1(String angka1) {
        this.angka1 = angka1;
    }

    public String getAngka2() {
        return angka2;
    }

    public void setAngka2(String angka2) {
        this.angka2 = angka2;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }

    public void simpanData(String angka1, String angka2, String operator) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
