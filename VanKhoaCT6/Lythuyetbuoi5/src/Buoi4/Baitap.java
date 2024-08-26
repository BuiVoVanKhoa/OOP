package Buoi4;
public class Baitap{
    public static void main(String[] args) {
        NhanvienPTN nv = new NhanvienPTN();
        Nhaquanly ql = new Nhaquanly();
        Nhakhoahoc kh = new Nhakhoahoc();
        nv.Nhap();
        ql.Nhap();
        kh.Nhap();
        inTongLuong(nv, ql, kh);
    }
    public static void inTongLuong(NhanvienPTN nv, Nhaquanly ql, Nhakhoahoc kh ){
        System.out.println(nv.getLuongtrongthang());
        System.out.println(ql.TinhLuong());
        System.out.println(kh.TinhLuong());
    }
}