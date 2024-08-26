package Buoi4;
public class NhanvienPTN extends Vien{
    private double Luongtrongthang;
    
    public NhanvienPTN(double Luongtrongthang) {
        this.Luongtrongthang = Luongtrongthang;
    }

    public void setLuongtrongthang(double Luongtrongthang) {
        this.Luongtrongthang = Luongtrongthang;
    }

    public double getLuongtrongthang() {
        return Luongtrongthang;
    }
    void Nhap(){
        super.Nhap();
        System.out.println("Nhap luong trong thang : ");
        this.setLuongtrongthang(kb.nextDouble());
    }
    void Xuat(){
        super.Xuat();
        System.out.println(this.getLuongtrongthang());
    }
}