/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai20;

import java.text.ParseException;

/**
 *
 * @author FPTSHOP
 */
public class SachGiaoKhoa extends Sach {

    private String Tinhtrang;

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    protected void Nhap() throws ParseException {
        super.Nhap();
        do {
            flag = false;
            System.out.println("Nhap tinh trang sach");
            System.out.println("1. Moi");
            System.out.println("2. Cu");
            System.out.println("Moi ban nhap tinh trang sach: ");
            int chon = kb.nextInt();
            switch (chon) {
                case 1:
                    Tinhtrang = "Moi";
                    break;
                case 2:
                    Tinhtrang = "Cu";
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai..!");
                    flag = true;
            }
        } while (flag == true);
    }

    protected double ThanhTien() {
        if (Tinhtrang.equalsIgnoreCase("Moi")) {
            return Soluong * Dongia;
        } else {
            return Soluong * Dongia * 0.5;
        }
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(Tinhtrang + " - " + ThanhTien());
    }
}
