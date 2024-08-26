/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lythuyetbuoi6;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Quanlynhanvien {

    protected String Hoten, Diachi, Gioitinh;
    protected int Namsinh, Namcongtac;
    protected double LCB = 9500000;
    Scanner kb = new Scanner(System.in);

    public Quanlynhanvien() {

    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public void setNamsinh(int Namsinh) {
        this.Namsinh = Namsinh;
    }

    public void setNamcongtac(int Namcongtac) {
        this.Namcongtac = Namcongtac;
    }

    public void setLCB(double LCB) {
        this.LCB = LCB;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public int getNamcongtac() {
        return Namcongtac;
    }

    public double getLCB() {
        return LCB;
    }

    protected double tinhLuong() {
        return 0;
    }

    protected void Nhap() {
        System.out.println("Nhap ho va ten : ");
        setHoten(kb.nextLine());
        System.out.println("Nhap dia chi : ");
        setDiachi(kb.nextLine());
        System.out.println("Nhap gioi tinh : ");
        setGioitinh(kb.nextLine());
        System.out.println("Nhap nam sinh : ");
        setNamsinh(kb.nextInt());
        System.out.println("Nhap so nam cong tac : ");
        setNamcongtac(kb.nextInt());
    }

    protected void Xuat() {
        System.out.print(getHoten() + "_" + getDiachi() + "_" + getGioitinh() + "_" + getNamsinh() + "_" + getNamcongtac() + "_");
    }
}
