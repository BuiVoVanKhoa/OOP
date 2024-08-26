package buoi4va5;

public class Ngoaithanh extends Xe {

    private String Noiden;
    private int Ngaydi;

    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }

    public void setNgaydi(int Ngaydi) {
        this.Ngaydi = Ngaydi;
    }

    public String getNoiden() {
        return Noiden;
    }

    public int getNgaydi() {
        return Ngaydi;
    }

    protected void Nhap() {
        super.Nhap();
        kb.nextLine();
        System.out.println("Nhap noi den : ");
        setNoiden(kb.nextLine());
        System.out.println("Nhap so ngay di duoc : ");
        setNgaydi(kb.nextInt());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getNoiden() + " - " + getNgaydi());
    }
}
