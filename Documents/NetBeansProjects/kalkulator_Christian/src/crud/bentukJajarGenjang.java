/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import crud.bentuk;

/**
 *
 * @author YUDHIS
 */
public class bentukJajarGenjang extends bentuk {
    protected void setC() {
        c = a * b;
    }
    
    protected String cetak() {
        luas = "Luas Jajar Genjang : " + getA() + getB() + " = " + getC();
        return luas;
    
}
}
