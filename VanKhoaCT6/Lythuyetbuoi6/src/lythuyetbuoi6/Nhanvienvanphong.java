package lythuyetbuoi6;

public class Nhanvienvanphong extends Quanlynhanvien {

    private double Hesoluong;

    public Nhanvienvanphong() {

    }

    public void setHesoluong(double Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public double getHesoluong() {
        return Hesoluong;
    }

    private double tinhPhuCap() {
        if (Namcongtac < 10) {
            return LCB;
        } else {
            return 1.2 * LCB;
        }
    }

    protected double tinhLuong() {
        return Hesoluong * LCB + tinhPhuCap();
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap he so luong : ");
        setHesoluong(kb.nextDouble());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(tinhLuong());
    }
}
