/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_6;

/**
 *
 * @author FPTSHOP
 */
public class Nhanvienlaptrinh_Khoa extends Nhanvien_Khoa {

    private double Hesoluong;

    public Nhanvienlaptrinh_Khoa() {

    }

    public double getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(double Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    protected double Overtime() {
        if (ThamnienCT >= 3) {
            return LCB * 1.3;
        } else {
            return LCB * 1.0;
        }
    }

    protected double TinhLuong() {
        return LCB * Hesoluong + Overtime();
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap he so luong : ");
        setHesoluong(kb.nextDouble());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(TinhLuong());
    }
}
