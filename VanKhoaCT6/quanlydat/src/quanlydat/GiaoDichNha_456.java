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
public class GiaoDichNha_456 extends GiaoDich {
    private String loaiNha;
    private String diaChi;
    private double dienTich;

    public GiaoDichNha_456() {
    }

    public GiaoDichNha_456(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiNha, String diaChi, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cấp")) {
            return dienTich * donGia;
        } else if (loaiNha.equalsIgnoreCase("thường")) {
            return dienTich * donGia * 0.9;
        }
        return 0;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại nhà (cao cấp/thường): ");
        loaiNha = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập diện tích: ");
        dienTich = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loại nhà: " + loaiNha);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}
