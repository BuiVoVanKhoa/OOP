/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplamthem;


/**
 *
 * @author FPTSHOP
 */
public class XeMay extends Xe {

    private double Congsuat;

    public double getCongsuat() {
        return Congsuat;
    }

    public void setCongsuat(double Congsuat) {
        this.Congsuat = Congsuat;
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getCongsuat());
    }
}
