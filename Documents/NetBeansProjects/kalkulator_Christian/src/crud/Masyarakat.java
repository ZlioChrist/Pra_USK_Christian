/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

/**
 *
 * @author YUDHIS
 */
public class Masyarakat {
    private String angka1, angka2, operator;
    private Double hasil;

   

    public Masyarakat(String angka1, String angka2, String operator, Double hasil) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }
    
   public Masyarakat() {
       
   }
}
    