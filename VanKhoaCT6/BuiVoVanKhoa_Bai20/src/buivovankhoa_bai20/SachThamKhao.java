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
public class SachThamKhao extends Sach {

    private double Thue;

    protected void Nhap() throws ParseException {
        super.Nhap();
        do {
            flag = false; // Chưa sai
            try {
                System.out.println("Nhap thue: ");
                Thue = kb.nextInt();
                if (Thue < 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                kb.nextLine();
                flag = true; // Đã sai
                System.out.println("Thue phai la so duong..!");
            }
        } while (flag == true);
    }

    protected double ThanhTien() {
        return Soluong * Dongia + Thue;
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(ThanhTien());
    }
}
