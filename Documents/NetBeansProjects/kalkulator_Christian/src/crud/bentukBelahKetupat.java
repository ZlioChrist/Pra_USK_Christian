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
public class bentukBelahKetupat extends bentuk {
    protected void setC() {
        c = a * b * 0.5;
    }
    
    protected String cetak() {
        luas = "Luas Belah Ketupat : " + getA() + getB() + " = " + getC();
        return luas;
}
}
