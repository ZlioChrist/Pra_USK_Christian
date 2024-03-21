/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

/**
 *
 * @author YUDHIS
 */
import java.sql.*;

public class CRUD {

    private Connection CRUDkoneksi;
    private Statement CRUDstat;
    private PreparedStatement CRUDpsmt;
    private ResultSet CRUDhasil;
    private String CRUDquery;

    public CRUD() {
        koneksi Connection = new koneksi();
        CRUDkoneksi = Connection.getKoneksi();

    }

    public ResultSet tampilData() {
        CRUDquery = "select * from masyarakat";

        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return CRUDhasil;
    }

    public void simpanData(String nik, String nama, String username, String password, String telp) {
        CRUDquery = "insert into masyarakat values (?, ?, ?, ?, ?)";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nik);
            CRUDpsmt.setString(2, nama);
            CRUDpsmt.setString(3, username);
            CRUDpsmt.setString(4, password);
            CRUDpsmt.setString(5, telp);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public void ubahData(String nik, String nama, String telp) {
        CRUDquery = "update masyarakat set nama=?, telp=? where nik=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.setString(2, telp);
            CRUDpsmt.setString(3, nik);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (SQLException ex) {
            System.out.println("Ubah data gagal" + ex);
        }

    }

    public void hapusData(String nik) {
        CRUDquery = "delete from masyarakat where nik=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nik);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (SQLException ex) {
            System.out.println("Hapus data gagal" + ex);
        }
    }
}
