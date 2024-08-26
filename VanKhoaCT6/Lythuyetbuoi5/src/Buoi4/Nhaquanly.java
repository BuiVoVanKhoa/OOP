package Buoi4;

public class Nhaquanly extends Vien {

    protected int Songaycong;
    protected double Bacluong;

    public Nhaquanly(int Songaycong, double Bacluong) {
        this.Songaycong = Songaycong;
        this.Bacluong = Bacluong;
    }

    public void setSongaycong(int Songaycong) {
        this.Songaycong = Songaycong;
    }

    public void setBacluong(double Bacluong) {
        this.Bacluong = Bacluong;
    }

    public int getSongaycong() {
        return Songaycong;
    }

    public double getBacluong() {
        return Bacluong;
    }

    void Nhap() {
        super.Nhap();
        System.out.println("Nhap so ngay cong : ");
        this.setSongaycong(kb.nextInt());
        System.out.println("Nhap bac luong : ");
        this.setBacluong(kb.nextDouble());
    }

    double TinhLuong() {
        return Songaycong * Bacluong * 400000;
    }

}
