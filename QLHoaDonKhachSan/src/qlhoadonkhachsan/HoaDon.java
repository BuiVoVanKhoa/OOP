/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlhoadonkhachsan;

import java.util.*;

/**
 *
 * @author Admin
 */
public abstract class HoaDon {

    protected String MaHoaDon, NgayHoaDon, TenKhachHang, MaPhong;
    protected double DonGia;

    abstract double DonGia();

    Scanner kb = new Scanner(System.in);

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getNgayHoaDon() {
        return NgayHoaDon;
    }

    public void setNgayHoaDon(String NgayHoaDon) {
        this.NgayHoaDon = NgayHoaDon;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    protected double ThanhTien() {
        return 0;
    }

    protected void Xuat() {
        System.out.print(getMaHoaDon() + " - " + getMaPhong() + " - " + getTenKhachHang() + " - " + getDonGia() + " - ");
    }
}
