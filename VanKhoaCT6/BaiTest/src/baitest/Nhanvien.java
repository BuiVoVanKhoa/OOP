/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Nhanvien {

    protected String Manhanvien, Hotennv;
    protected double LCB = 1005000;
    Scanner kb = new Scanner(System.in);

    public Nhanvien() {

    }

    public String getManhanvien() {
        return Manhanvien;
    }

    public void setManhanvien(String Manhanvien) {
        this.Manhanvien = Manhanvien;
    }

    public String getHotennv() {
        return Hotennv;
    }

    public void setHotennv(String Hotennv) {
        this.Hotennv = Hotennv;
    }

    public double getLCB() {
        return LCB;
    }

    public void setLCB(double LCB) {
        this.LCB = LCB;
    }
    
    protected double TinhLuong() {
        return 0;
    }

    protected void Nhap(){
        System.out.println("Nhap ma nhan vien : ");
        setManhanvien(kb.nextLine());
        System.out.println("Nhap ho ten nhan vien : ");
        setHotennv(kb.nextLine());
    }
    protected void Xuat(){
        System.out.print(getManhanvien()+" - "+getHotennv()+" - ");
    }

    int getThamnienCT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
