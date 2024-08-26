/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlhoadonkhachsan;

/**
 *
 * @author Admin
 */
public class HoaDonTheoGio extends HoaDon {

    private int SoGio;

    public int getSoGio() {
        return SoGio;
    }

    public void setSoGio(int SoGio) {
        this.SoGio = SoGio;
    }
    

    public double DonGia() {
        return DonGia;
    }
    
    protected void Nhap(){
        System.out.println("Nhap so gio: ");
        SoGio = kb.nextInt();
    }

    protected double ThanhTien() {
        if (SoGio > 24 && SoGio < 30) {
            return 24 * DonGia;
        } else {
            return SoGio * DonGia;
        }
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(SoGio+" - "+ThanhTien());
    }
}
