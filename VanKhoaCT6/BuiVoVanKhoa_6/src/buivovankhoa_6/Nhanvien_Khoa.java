/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_6;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */  
public class Nhanvien_Khoa {

    protected String Manv, Hotennv;
    protected double LCB = 1035000;
    protected int ThamnienCT;
    Scanner kb = new Scanner(System.in);

    public Nhanvien_Khoa() {

    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHotennv() { 
        return Hotennv;
    } 

    public void setHotennv(String Hotennv) {
        this.Hotennv = Hotennv;
    }

    public int getThamnienCT() {
        return ThamnienCT;
    }

    public void setThamnienCT(int ThamnienCT) {
        this.ThamnienCT = ThamnienCT;
    }

    protected double TinhLuong() {
        return 0;
    }

    protected void Nhap() {
        System.out.println("Nhap ma nhan vien : ");
        setManv(kb.nextLine());
        System.out.println("Nhap ho ten nhan vien : ");
        setHotennv(kb.nextLine());
        System.out.println("Nhap so nam tham nien cong tac : ");
        setThamnienCT(kb.nextInt());
    }

    protected void Xuat() {
        System.out.print(getManv() + " - " + getHotennv() + " - ");
    }

}
