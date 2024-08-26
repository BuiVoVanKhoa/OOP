/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest;

/**
 *
 * @author FPTSHOP
 */
public class Nhanvienlaptrinh extends Nhanvien{
    private double Hesoluong;
    private int ThamnienCT;
    public Nhanvienlaptrinh(){
        
    }

    public double getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(double Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public int getThamnienCT() {
        return ThamnienCT;
    }

    public void setThamnienCT(int ThamnienCT) {
        this.ThamnienCT = ThamnienCT;
    }


    private double Overtime(){
        if (ThamnienCT > 4){
            return LCB * 1.1;
        } else{
            return LCB * 1.0;
        }
    }
    
    protected double TinhLuong(){
        return LCB * Hesoluong + Overtime();
    }
    protected void Nhap(){
    super.Nhap();
        System.out.println("Nhap he so luong : ");
        setHesoluong(kb.nextDouble());
        System.out.println("Nhap tham nien cong tac : ");
        setThamnienCT(kb.nextInt());
    }
    protected void Xuat(){
        System.out.println(TinhLuong());
    }
}
