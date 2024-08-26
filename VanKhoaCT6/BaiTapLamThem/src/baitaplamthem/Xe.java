/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplamthem;

/**
 *
 * @author FPTSHOP
 */
public class Xe {

    protected String ID, HangSX, NamSX, Mauxe;
    protected double Giaban;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String HangSX) {
        this.HangSX = HangSX;
    }

    public String getNamSX() {
        return NamSX;
    }

    public void setNamSX(String NamSX) {
        this.NamSX = NamSX;
    }

    public String getMauxe() {
        return Mauxe;
    }

    public void setMauxe(String Mauxe) {
        this.Mauxe = Mauxe;
    }

    public double getGiaban() {
        return Giaban;
    }

    public void setGiaban(double Giaban) {
        this.Giaban = Giaban;
    }

    protected void Xuat() {
        System.out.print(getID() + " - " + getHangSX() + " - " + getNamSX() + " - " + getGiaban() + " - " + getMauxe() + " - ");
    }
}
