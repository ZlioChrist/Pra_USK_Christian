/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author YUDHIS
 */
public class kalkulator {
    private String angka1, angka2, oepartor;
    private Double hasil;

    public kalkulator(String angka1, String angka2, String oepartor, Double hasil) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.oepartor = oepartor;
        this.hasil = hasil;
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

    public String getOepartor() {
        return oepartor;
    }

    public void setOepartor(String oepartor) {
        this.oepartor = oepartor;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }

    
    public kalkulator() {
    }
    
   
    
    
}
