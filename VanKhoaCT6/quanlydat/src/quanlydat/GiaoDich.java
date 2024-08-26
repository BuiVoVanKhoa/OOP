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
public abstract class GiaoDich {
    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected double donGia;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public abstract double tinhThanhTien();

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ma gd: ");
        maGiaoDich = scanner.nextLine();
        System.out.print("nhap ngay thang nam (ngày/tháng/năm): ");
        ngayGiaoDich = scanner.nextLine();
        System.out.print("nhap gia: ");
        donGia = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Mã giao dịch: " + maGiaoDich);
        System.out.println("Ngày giao dịch: " + ngayGiaoDich);
        System.out.println("Đơn giá: " + donGia);
    }
}