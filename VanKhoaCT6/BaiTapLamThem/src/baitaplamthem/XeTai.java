/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplamthem;

/**
 *
 * @author FPTSHOP
 */
public class XeTai extends Xe {

    private double Trongtai;

    public double getTrongtai() {
        return Trongtai;
    }

    public void setTrongtai(double Trongtai) {
        this.Trongtai = Trongtai;
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getTrongtai());
    }
}
