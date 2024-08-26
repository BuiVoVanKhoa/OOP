/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest1;
import java.util.*;
/**
 *
 * @author FPTSHOP
 */
public class Laodong {
    protected String Manv, Hoten;
    protected double LCB = 1505000;
    Scanner kb = new Scanner (System.in);
    public Laodong(){
        
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getLCB() {
        return LCB;
    }

    public void setLCB(double LCB) {
        this.LCB = LCB;
    }
    
    protected double TinhLuong(){
        return 0;
    }
    
    protected void Nhap(){
        System.out.println("Nhap ma nhan vien : ");
        setManv(kb.nextLine());
        System.out.println("Nhap ho ten nhan vien : ");
        setHoten(kb.nextLine());
    }
    
    protected void Xuat(){
        System.out.print(getManv()+" - "+getHoten()+" - ");
    }
}
