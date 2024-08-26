/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydat;

import java.util.Scanner;

/**
 *
 * @author Mia9X
 */
public class GiaoDichDat_456 extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat_456() {
    }

    public GiaoDichDat_456(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiDat.equalsIgnoreCase("B") || loaiDat.equalsIgnoreCase("C")) {
            return donGia * 1.2;
        } else if (loaiDat.equalsIgnoreCase("A")) {
            return donGia * 1.5;
        }
        return 0;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại đất (A/B/C): ");
        loaiDat = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loại đất: " + loaiDat);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}
