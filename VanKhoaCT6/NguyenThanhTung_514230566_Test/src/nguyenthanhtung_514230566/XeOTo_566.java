/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenthanhtung_514230566;

/**
 *
 * @author FPTSHOP
 */
public class XeOTo_566 extends Xe_566 {

    private String Loai;
    private double Dongia;

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public int Soluong() {
        return Soluong;
    }

    protected void Nhap() {
        boolean flag;
        do {
            flag = false;
            System.out.println("Nhap loai xe o to");
            System.out.println("1. 4 cho");
            System.out.println("2. 5 cho");
            System.out.println("Moi ban nhap loai xe o to: ");
            int chon = kb.nextInt();
            switch (chon) {
                case 1:
                    Loai = "4 cho";
                    System.out.println("Nhap don gia: ");
                    Dongia = kb.nextDouble();
                    break;
                case 2:
                    Loai = "5 cho";
                    System.out.println("Nhap don gia: ");
                    Dongia = kb.nextDouble();
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai..!");
                    flag = true;
            }
        } while (flag == true);

    }

    protected double ThanhTien() {
        if (Loai.equalsIgnoreCase("4 cho")) {
            return Soluong * Dongia;
        } else {
            return Soluong * Dongia * 1.1;
        }
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(Loai + " - " + ThanhTien());
    }
}
