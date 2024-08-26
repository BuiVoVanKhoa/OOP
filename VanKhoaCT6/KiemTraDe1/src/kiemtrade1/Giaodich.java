/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade1;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Giaodich {

    protected String Magiaodich, Ngaygiaodich;
    protected double Dongia, Soluong;
    Scanner kb = new Scanner(System.in);

    public Giaodich() {

    }

    public Giaodich(String Magiaodich, String Ngaygiaodich, double Dongia, double Soluong) {
        this.Magiaodich = Magiaodich;
        this.Ngaygiaodich = Ngaygiaodich;
        this.Dongia = Dongia;
        this.Soluong = Soluong;
    }

    public String getMagiaodich() {
        return Magiaodich;
    }

    public void setMagiaodich(String Magiaodich) {
        this.Magiaodich = Magiaodich;
    }

    public String getNgaygiaodich() {
        return Ngaygiaodich;
    }

    public void setNgaygiaodich(String Ngaygiaodich) {
        this.Ngaygiaodich = Ngaygiaodich;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    public double getSoluong() {
        return Soluong;
    }

    public void setSoluong(double Soluong) {
        this.Soluong = Soluong;
    }

    protected double ThanhTien() {
        return 0;
    }

    protected void Nhap() {
        System.out.println("Nhap ma giao dich : ");
        setMagiaodich(kb.nextLine());
        System.out.println("Nhap ngay giao dich : ");
        setNgaygiaodich(kb.nextLine());
        System.out.println("Nhap don gia : ");
        setDongia(kb.nextDouble());
        System.out.println("Nhap so luong : ");
        setSoluong(kb.nextDouble());
    }
    
    protected void Xuat(){
        System.out.print(getMagiaodich()+" - "+getNgaygiaodich()+" - "+getDongia()+" - "+getSoluong()+" - ");
    }
}
