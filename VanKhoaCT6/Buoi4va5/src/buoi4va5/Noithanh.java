package buoi4va5;

public class Noithanh extends Xe {

    private int Sotuyen;
    private double Sokm;

    public void setSotuyen(int Sotuyen) {
        this.Sotuyen = Sotuyen;
    }

    public void setSokm(double Sokm) {
        this.Sokm = Sokm;
    }

    public int getSotuyen() {
        return Sotuyen;
    }

    public double getSokm() {
        return Sokm;
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap so tuyen : ");
        setSotuyen(kb.nextInt());
        System.out.println("Nhap so km di duoc : ");
        setSokm(kb.nextDouble());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getSotuyen() + " - " + getSokm());
    }
}
