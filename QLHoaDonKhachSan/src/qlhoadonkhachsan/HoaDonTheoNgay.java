/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlhoadonkhachsan;

/**
 *
 * @author Admin
 */
public class HoaDonTheoNgay extends HoaDon {

    private int SoNgayThue;

    public int getSoNgayThue() {
        return SoNgayThue;
    }

    public void setSoNgayThue(int SoNgayThue) {
        this.SoNgayThue = SoNgayThue;
    }

    protected double DonGia() {
        return DonGia;
    }

    protected void Nhap() {
        System.out.println("Nhap so ngay thue: ");
        SoNgayThue = kb.nextInt();
    }

    protected double ThanhTien() {
        if (SoNgayThue > 7) {
            return (7 * DonGia) + ((SoNgayThue - 7) * DonGia * 0.8);
        } else {
            return SoNgayThue * DonGia;
        }
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getSoNgayThue() + " - " + ThanhTien());
    }
}
