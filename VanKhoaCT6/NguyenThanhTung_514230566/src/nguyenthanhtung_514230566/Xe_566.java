/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenthanhtung_514230566;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public abstract class Xe_566 {

    protected String Masanpham, Ngaynhap, Hangsanxuat;
    protected double Gia;
    protected int Soluong;
    Scanner kb = new Scanner(System.in);
    abstract int Soluong();

    public String getMasanpham() {
        return Masanpham;
    }

    public void setMasanpham(String Masanpham) {
        this.Masanpham = Masanpham;
    }

    public String getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(String Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    public String getHangsanxuat() {
        return Hangsanxuat;
    }

    public void setHangsanxuat(String Hangsanxuat) {
        this.Hangsanxuat = Hangsanxuat;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    protected double ThanhTien() {
        return 0;
    }
    
    protected void Xuat(){
        System.out.print(getMasanpham()+" - "+getNgaynhap()+" - "+getHangsanxuat()+" - "+getGia()+" - "+getSoluong()+" - ");
    }

}
