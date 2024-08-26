/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest;

/**
 *
 * @author FPTSHOP
 */
public class Nhanvienquanly extends Nhanvien {

    private double Hesoluong;
    private int Songaycong, ThamnienCT;

    public Nhanvienquanly() { 

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

    public int getThamnienCT() {
        return ThamnienCT;
    }

    public void setThamnienCT(int ThamnienCT) {
        this.ThamnienCT = ThamnienCT;
    }

    private double Thuong() {
        if (Songaycong >= 24) {
            return 1500000;
        } else {
            return 0;
        }
    }

    protected double TinhLuong() {
        return LCB * Hesoluong + Thuong();
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap he so luong : ");
        setHesoluong(kb.nextDouble());
        System.out.println("Nhap so ngay cong : ");
        setSongaycong(kb.nextInt());
        System.out.println("Nhap tham nien cong tac : ");
        setThamnienCT(kb.nextInt());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(TinhLuong());
    }
}
