package Bai19;

import java.util.*;

public class Xe {

    protected String Masochuyen, Hoten, Soxe;
    protected double Doanhthu;
    Scanner kb = new Scanner(System.in);

    public void setMasochuyen(String Masochuyen) {
        this.Masochuyen = Masochuyen;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setSoxe(String Soxe) {
        this.Soxe = Soxe;
    }

    public void setDoanhthu(double Doanhthu) {
        this.Doanhthu = Doanhthu;
    }

    public String getMasochuyen() {
        return Masochuyen;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getSoxe() {
        return Soxe;
    }

    public double getDoanhthu() {
        return Doanhthu;
    }

    protected void Nhap() {
        System.out.println("Nhap ma so chuyen : ");
        setMasochuyen(kb.nextLine());
        System.out.println("Nhap ho ten tai xe : ");
        setHoten(kb.nextLine());
        System.out.println("Nhap so xe : ");
        setSoxe(kb.nextLine());
        System.out.println("Nhap doanh thu : ");
        setDoanhthu(kb.nextDouble());
    }

    protected void Xuat() {
        System.out.println(getMasochuyen() + "_" + getHoten() + "_" + getSoxe() + "_" + getDoanhthu());
    }
}
