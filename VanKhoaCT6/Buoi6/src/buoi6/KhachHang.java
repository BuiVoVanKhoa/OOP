/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;
import java.util.*;
/**
 *
 * @author FPTSHOP
 */
public class KhachHang {

    protected String MaKH, Hoten, NRHD;
    protected double Soluong, Dongia;
    Scanner kb = new Scanner (System.in);

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNRHD() {
        return NRHD;
    }

    public void setNRHD(String NRHD) {
        this.NRHD = NRHD;
    }

    public double getSoluong() {
        return Soluong;
    }

    public void setSoluong(double Soluong) {
        this.Soluong = Soluong;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    protected double Thanhtien() {
        return 0;
    }
    protected void Nhap(){
        System.out.println("Nhap ma khach hang : ");
        setMaKH(kb.nextLine());
        System.out.println("Nhap ho ten khach hang : ");
        setHoten(kb.nextLine());
        System.out.println("Nhap ngay ra hoa don : ");
        setNRHD(kb.nextLine());
        System.out.println("Nhap so luong : ");
        setSoluong(kb.nextDouble());
        System.out.println("Nhap don gia : ");
        setDongia(kb.nextDouble());
    }
    protected void Xuat(){
        System.out.println(getMaKH()+" - "+getHoten()+" - "+getNRHD()+" - "+getSoluong()+" - "+getDongia()+" - ");
    }
}
