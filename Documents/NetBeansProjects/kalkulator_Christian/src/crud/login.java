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
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
public class login {
private Connection koneksi;
private PreparedStatement psmt;
private ResultSet dataUser;
private String query,username,password,pesan;

public login(){
koneksi Connection = new koneksi();
koneksi = Connection.getKoneksi();
 }  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

public String cekLogin(String username, String password) {
    query = "select * from masyarakat where username=? and password=?";
    try {
       psmt = koneksi.prepareCall(query);
       psmt.setString(1, username);
       psmt.setString(2, password);
       dataUser = psmt.executeQuery();
        if(dataUser.next())
        {
                session.setNik(dataUser.getString("nik"));
                session.setUsername(username);
                session.setStatusLogin("Aktif");
                
                query = "insert into log_login(id_user) values (?)";
                
                System.out.println(getUsername());
                try {
                    psmt = koneksi.prepareStatement(query);
                    psmt.setString(1, username);
                    psmt.executeUpdate();
                    psmt.close();
                    pesan = "Berhasil login dan isi login";
                } catch (Exception e){
                    pesan = "Gagal simpan login";
                }
            } else {
                pesan = "Gagal Login, username atau password tidak sesuai";
            }
            
           psmt.close();
//       pesan = dataUser.getString(0);
    } catch (Exception e) {
        pesan = "Gagal login"; 
//        System.out.println(e);
    }
    return pesan;
}

public void Logout(String username, String nik) {
query = "UPDATE log_login SET waktu_logout=CURRENT_TIMESTAMP() WHERE username=? ORDER BY id DESC LIMIT 1";
try { psmt = koneksi.prepareStatement(query);
psmt.setString(1, nik);
psmt.setString(2, username);
psmt.executeUpdate();
psmt.close();
// memutus koneksi database
koneksi.close();
// hapus Session
session.setNik(null);
session.setUsername(null);
session.setStatusLogin(null);
} catch (Exception e) { 
}
}


    public static void main(String[] args) {
        login l = new login();
        System.out.println(l.cekLogin("lio","pass"));
    }
 
}
