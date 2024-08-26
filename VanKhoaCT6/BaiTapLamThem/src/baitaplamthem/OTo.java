/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplamthem;

/**
 *
 * @author FPTSHOP
 */
public class OTo extends Xe {

    private int SoChoNgoi;
    private String Kieudongco;

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int SoChoNgoi) {
        this.SoChoNgoi = SoChoNgoi;
    }

    public String getKieudongco() {
        return Kieudongco;
    }

    public void setKieudongco(String Kieudongco) {
        this.Kieudongco = Kieudongco;
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getSoChoNgoi() + " - " + getKieudongco());
    }
}
