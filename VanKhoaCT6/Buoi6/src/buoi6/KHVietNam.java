/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

/**
 *
 * @author FPTSHOP
 */
public class KHVietNam extends KhachHang {

    private int DTKH;
    private double Dinhmuc;

    public int getDTKH() {
        return DTKH;
    }

    public void setDTKH(int DTKH) {
        this.DTKH = DTKH;
    }

    public double getDinhmuc() {
        return Dinhmuc;
    }

    public void setDinhmuc(double Dinhmuc) {
        this.Dinhmuc = Dinhmuc;
    }

    protected double Thanhtien() {
        if (Soluong <= Dinhmuc) {
            return Soluong * Dongia;
        } else {
            return Soluong * Dongia * Dinhmuc + (Soluong - Dinhmuc) * Dongia * 2.5;
        }
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("1. Sinh hoat");
        System.out.println("2. Kinh doanh");
        System.out.println("3. San xuat");
        System.out.println("Nhap doi tuong khach hang : ");
        setDTKH(kb.nextInt());
        System.out.println("Nhap dinh muc : ");
        setDinhmuc(kb.nextDouble());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getDTKH() + " - " + getDinhmuc() + " - " + Thanhtien());
    }
    void NhapDTKH(){
        
    }
}
