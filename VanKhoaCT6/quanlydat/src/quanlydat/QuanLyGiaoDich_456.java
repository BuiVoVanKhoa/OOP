/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mia9X
 */

public class QuanLyGiaoDich_456 {
    private ArrayList<GiaoDichDat_456> danhSachGiaoDichDat;
    private ArrayList<GiaoDichNha_456> danhSachGiaoDichNha;
    private Scanner scanner;

    public QuanLyGiaoDich_456() {
        danhSachGiaoDichDat = new ArrayList<>();
        danhSachGiaoDichNha = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        QuanLyGiaoDich_456 abc = new QuanLyGiaoDich_456();
        abc.menu();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. nhap thong tin gd dat");
            System.out.println("2. xuat thong tin gd dat");
            System.out.println("3. tinh trung binh tien gd dat a hoac c");
            System.out.println("4. xoa gd dat vao thang 9 năm 2013");
            System.out.println("5. thoat");
            System.out.print("nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (choice) {
                case 1:
                    nhapGiaoDichDat();
                    break;
                case 2:
                    xuatGiaoDichDat();
                    break;
                case 3:
                    tinhTrungBinhThanhTienGiaoDichDatBC();
                    break;
                case 4:
                    xoaGiaoDichDatThang9Nam2013();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        } while (choice != 5);
    }

    private void nhapGiaoDichDat() {
        System.out.println("nhap thong tin gd dat:");
        GiaoDichDat_456 giaoDichDat = new GiaoDichDat_456();
        giaoDichDat.nhap();
        if (kiemTraTrungMaGiaoDich(giaoDichDat.getMaGiaoDich())) {
            System.out.println("Mã giao dịch đã tồn tại. Không thể thêm giao dịch.");
        } else if (giaoDichDat.getDonGia() <= 0) {
            System.out.println("Đơn giá phải lớn hơn 0. Không thể thêm giao dịch.");
        } else {
            danhSachGiaoDichDat.add(giaoDichDat);
            System.out.println("Thêm giao dịch đất thành công.");
        }
    }

    private void xuatGiaoDichDat() {
        System.out.println("Danh sách giao dịch đất:");
        for (GiaoDichDat_456 giaoDichDat : danhSachGiaoDichDat) {
            giaoDichDat.xuat();
            System.out.println("------------------------");
        }
    }

    private void tinhTrungBinhThanhTienGiaoDichDatBC() {
        double tongThanhTien = 0;
        int soGiaoDichDatBC = 0;
        for (GiaoDichDat_456 giaoDichDat : danhSachGiaoDichDat) {
            if (giaoDichDat.getLoaiDat().equalsIgnoreCase("B") || giaoDichDat.getLoaiDat().equalsIgnoreCase("C")) {
                tongThanhTien += giaoDichDat.tinhThanhTien();
                soGiaoDichDatBC++;
            }
        }
        if (soGiaoDichDatBC > 0) {
            double trungBinhThanhTien = tongThanhTien / soGiaoDichDatBC;
            System.out.println("Trung bình thành tiền của giao dịch đất loại B hoặc C: " + trungBinhThanhTien);
        } else {
            System.out.println("Không có giao dịch đất loại B hoặc C.");
        }
    }

    private void xoaGiaoDichDatThang9Nam2013() {
        ArrayList<GiaoDichDat_456> giaoDichDatCanXoa = new ArrayList<>();
        for (GiaoDichDat_456 giaoDichDat : danhSachGiaoDichDat) {
            String[] ngayGiaoDich = giaoDichDat.getNgayGiaoDich().split("/");
            int thang = Integer.parseInt(ngayGiaoDich[1]);
            int nam = Integer.parseInt(ngayGiaoDich[2]);
            if (thang == 9 && nam == 2013) {
                giaoDichDatCanXoa.add(giaoDichDat);
            }
        }
        if (giaoDichDatCanXoa.size() > 0) {
            danhSachGiaoDichDat.removeAll(giaoDichDatCanXoa);
            System.out.println("Đã xóa " + giaoDichDatCanXoa.size() + " giao dịch đất vào tháng 9 năm 2013.");
        } else {
            System.out.println("Không có giao dịch đất nào vào tháng 9 năm 2013.");
        }
    }

    private boolean kiemTraTrungMaGiaoDich(String maGiaoDich) {
        for (GiaoDichDat_456 giaoDichDat : danhSachGiaoDichDat) {
            if (giaoDichDat.getMaGiaoDich().equals(maGiaoDich)) {
                return true;
            }
        }
        return false;
    }
}
