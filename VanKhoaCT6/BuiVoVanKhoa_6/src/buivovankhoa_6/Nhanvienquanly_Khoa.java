/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_6;

/**
 *
 * @author FPTSHOP
 */
public class Nhanvienquanly_Khoa extends Nhanvien_Khoa {

    private double Hesoluong;
    private int Songaycong;

    public Nhanvienquanly_Khoa() {

    }

    public double getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(double Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public int getSongaycong() {
        return Songaycong;
    }

    public void setSongaycong(int Songaycong) {
        this.Songaycong = Songaycong;
    }

    protected double Thuong() {
        if (Songaycong >= 25) {
            return 2055000;
        } else {
            return 0;
        }
    }

    protected double TinhLuong() {
        return LCB * Hesoluong + Thuong();
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap so ngay cong : ");
        setSongaycong(kb.nextInt());
        System.out.println("Nhap he so luong : ");
        setHesoluong(kb.nextDouble());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(TinhLuong());
    }
}
