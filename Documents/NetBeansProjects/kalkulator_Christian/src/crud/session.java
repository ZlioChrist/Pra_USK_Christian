/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

/**
 *
 * @author YUDHIS
 */
public class session {
    private static String nik, username, statusLogin, password;

    public static String getNik() {
        return nik;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        session.password = password;
    }

    public static void setNik(String nik) {
        session.nik = nik;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        session.username = username;
    }

    public static String getStatusLogin() {
        return statusLogin;
    }

    public static void setStatusLogin(String statusLogin) {
        session.statusLogin = statusLogin;
    }

    public session() {
    }
    
    
}
