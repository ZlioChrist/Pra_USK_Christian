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
public class koneksi {
    private Connection connect;
    private String jdbcUrl = "jdbc:mysql://localhost:3306/pengaduan_masyarakat";
    private String username = "root";
    private String password = "";
    
    
    public Connection getKoneksi() {
        if (connect == null) {
            try {
                connect = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("Koneksi berhasil");
            } catch (SQLException ex) {
                System.out.println("Koneksi gagal:" + ex);
            }
        }

       return connect;
    }

    public static void main(String[] args) {
        koneksi k = new koneksi();
        Connection c = k.getKoneksi();
        
    } 
}