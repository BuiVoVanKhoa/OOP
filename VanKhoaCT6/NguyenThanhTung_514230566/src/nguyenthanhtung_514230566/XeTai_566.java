/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenthanhtung_514230566;

/**
 *
 * @author FPTSHOP
 */
public class XeTai_566 extends Xe_566 {

    private double Taitrongtoida, Dongia;

    public int Soluong() {
        return Soluong;
    }

    protected void Nhap() {
        System.out.println("Nhap tai trong toi da: ");
        Dongia = kb.nextDouble();
        System.out.println("Nhap don gia: ");
        Dongia = kb.nextDouble();
    }

    protected double ThanhTien() {
        return Soluong * Dongia;
    }

    protected void Xuat() {
        System.out.println(ThanhTien());
    }
}
