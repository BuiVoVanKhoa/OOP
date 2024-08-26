/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlhoadonkhachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Admin
 */
public class QuanLyHoaDon {

    ArrayList<HoaDon> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("1. Nhap thong tin hoa don theo gio");
            System.out.println("2. Xuat hoa don theo gio");
            System.out.println("3. Tinh tong so luong gio thue cho hoa don theo gio");
            System.out.println("4. Tinh trung binh thanh tien cua hoa don thue gio trong thang 1 nam 2024");
            System.out.println("5. Thoat chuong trinh");
            chon = kb.nextInt();
            kb.nextLine();
            switch (chon) {
                case 1:
                    HoaDon ql = new HoaDonTheoGio(); // Down - casting
                    Nhapthongtinchung(ql);
                    HoaDonTheoGio th = (HoaDonTheoGio) ql;
                    th.Nhap();
                    mang.add(ql);
                    break;
                case 2:
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof HoaDonTheoGio) {
                            Xuat();
                        }
                    }
                    break;
                case 3:
                    double Tong_TT = 0;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Nhanvienlaptrinh_305) {
                            Nhanvienlaptrinh_305 tam = (Nhanvienlaptrinh_305) mang.get(i);
                            if (tam.getLoainhanvien().equalsIgnoreCase("Nhan vien KT") && mang.get(i).Hesoluong > 3) {
                                Tong_TT += tam.ThanhTien();
                            }
                        }
                    }
                    System.out.println("Tong thanh tien cua nhan vien KT co he so luong > 3: " + Tong_TT);
                    break;
                    break;
                case 5:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai..!");
            }
        } while (chon != 5);
    }

    void Nhapthongtinchung(HoaDon ql) {
        boolean flag;
        // Nhập mã hóa đơn
        String tam_Mahoadon;
        do {
            flag = false;
            System.out.println("Nhap ma hoa don: ");
            tam_Mahoadon = kb.nextLine();
            // Kiểm tra trống
            if (tam_Mahoadon.length() == 0) {
                System.out.println("Ma hoa don khong duoc de trong..!");
                flag = true;
            }
            // Kiểm tra trùng
            for (int i = 0; i < mang.size(); i++) {
                if (mang.get(i).getMaHoaDon().equalsIgnoreCase(tam_Mahoadon)) {
                    System.out.println("Ma hoa don khong duoc trung..!");
                    flag = true;
                }
            }
        } while (flag == true);
        ql.setMaHoaDon(tam_Mahoadon);
        // Nhập ngày hóa đơn
        SimpleDateFormat DinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");

        DinhDangNgay.setLenient(false);
        Date ngayDate1 = null,
                ngayDate2 = null;

        do {
            flag = false;
            System.out.println("Nhap ngay hoa don: ");
            ql.setNgayHoaDon(kb.nextLine());

            try {
                String ngayString1 = "30/2/2024";
                // Chuyển String qua Date 
                ngayDate1 = DinhDangNgay.parse(ql.getNgayHoaDon());
            } catch (ParseException ex) {
                System.out.println("Ngay khong hop le. Vui long nhap lai..!");
                flag = true;
            }
        } while (flag == true);
        // Nhập mã phòng
        String tam_Maphong;
        do {
            flag = false;
            System.out.println("Nhap ma phong: ");
            tam_Maphong = kb.nextLine();
            // Kiểm tra trống
            if (tam_Mahoadon.length() == 0) {
                System.out.println("Ma phong khong duoc de trong..!");
                flag = true;
            }
            // Kiểm tra trùng
            for (int i = 0; i < mang.size(); i++) {
                if (mang.get(i).getMaHoaDon().equalsIgnoreCase(tam_Maphong)) {
                    System.out.println("Ma phong khong duoc trung..!");
                    flag = true;
                }
            }
        } while (flag == true);
        ql.setMaPhong(tam_Maphong);
        // Nhập tên khách hàng
        String tam_Tenkhachhang;
        do {
            flag = false;
            System.out.println("Nhap ten khach hang: ");
            tam_Tenkhachhang = kb.nextLine();
            // Kiểm tra trống
            if (tam_Tenkhachhang.length() == 0) {
                System.out.println("Ten khach hang khong duoc de trong..!");
                flag = true;
            }
        } while (flag == true);
        ql.setTenKhachHang(tam_Tenkhachhang);

        // Nhập đơn giá
        do {
            flag = false;
            try {
                System.out.println("Nhap don gia: ");
                ql.setDonGia(kb.nextDouble());
                if (ql.getDonGia() < 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                System.out.println("Don gia phai la so thuc");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
    }
}
