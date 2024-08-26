package lythuyetbuoi6;

public class Nhanvienkinhdoanh extends Quanlynhanvien {

    private double doanhThu, hoaHong;

    public Nhanvienkinhdoanh() {

    }

    public void setdoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void sethoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public double getdoanhThu() {
        return doanhThu;
    }

    public double gethoaHong() {
        return hoaHong;
    }

    private double tinhThuong() {
        return doanhThu * hoaHong;
    }

    protected double tinhLuong() {
        return LCB + tinhThuong();
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap doanh thu : ");
        setdoanhThu(kb.nextDouble());
        System.out.println("Nhap hoa hong : ");
        sethoaHong(kb.nextDouble());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(tinhLuong());
    }
}
