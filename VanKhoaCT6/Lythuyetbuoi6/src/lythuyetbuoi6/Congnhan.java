/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lythuyetbuoi6;

/**
 *
 * @author FPTSHOP
 */
public class Congnhan extends Quanlynhanvien {

    private int sanLuong;
    private double heSoLuong;

    public Congnhan() {

    }

    public void setSanLuong(int sanLuong) {
        this.sanLuong = sanLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSanLuong() {
        return sanLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    private double tinhThuong() {
        if (sanLuong < 1000) {
            return 1 * LCB;
        } else {
            return 1.5 * LCB;
        }
    }

    protected double tinhLuong() {
        return heSoLuong * LCB + tinhThuong();
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap san luong : ");
        setSanLuong(kb.nextInt());
        System.out.println("Nhap he so luong : ");
        setHeSoLuong(kb.nextDouble());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(tinhLuong());
    }
}
