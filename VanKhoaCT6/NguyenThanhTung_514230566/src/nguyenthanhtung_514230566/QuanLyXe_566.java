/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenthanhtung_514230566;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FPTSHOP
 */
public class QuanLyXe_566 {

    ArrayList<Xe_566> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("1. Nhap thong xe o to");
            System.out.println("2. Xuat thong tin cac xe o to 4 cho");
            System.out.println("3. Tinh tong thanh tien cua cac xe o to");
            System.out.println("4. Xoa xe o to co thanh tien nho nhat");
            System.out.println("5. Thoat khoi chuong trinh");
            System.out.println("Moi ban chon: ");
            chon = kb.nextInt();
            kb.nextLine();
            switch (chon) {
                case 1:
                    Xe_566 xe = new XeOTo_566(); // Down - casting
                    Nhapthongtinchung(xe);
                    XeOTo_566 oto = (XeOTo_566) xe;
                    oto.Nhap();
                    mang.add(xe);
                    break;
                case 2:
                    for (int i = 0; i < mang.size(); i++) {
                         XeOTo_566 tam = (XeOTo_566) mang.get(i);
                        if (mang.get(i) instanceof XeOTo_566) {                    
                            if (tam.getLoai().equalsIgnoreCase("4 cho")) {
                                Xuat();
                            }
                        }
                    }
                    break;
                case 3:
                    double TT_oto = 0;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof XeOTo_566) {
                            TT_oto += mang.get(i).ThanhTien();
                        }
                    }
                    System.out.println("Tong thanh tien cua cac xe o to : " + TT_oto);
                    break;
                case 4:
                    double min = -1;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof XeOTo_566) {
                            min = mang.get(i).ThanhTien();
                            break;
                        }
                    }
                    if (min != -1) {
                        for (int i = 0; i < mang.size(); i++) {
                            if (min > mang.get(i).ThanhTien()
                                    && mang.get(i) instanceof XeOTo_566) {
                                min = mang.get(i).ThanhTien();
                            }
                        }
                        for (int i = 0; i < mang.size(); i++) {
                            if (min == mang.get(i).ThanhTien()
                                    && mang.get(i) instanceof XeOTo_566) {
                                mang.remove(i);
                                i--;
                            }
                        }
                    } else {
                        System.out.println("Khong co xe o to");
                    }
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

    void Nhapthongtinchung(Xe_566 xe) {
        boolean flag;
        String tam_Masanpham;
        do {
            flag = false;
            System.out.println("Nhap ma san pham: ");
            tam_Masanpham = kb.nextLine();
            // Kiểm tra trống
            if (tam_Masanpham.length() == 0) {
                System.out.println("Ma san pham khong duoc de trong..!");
                flag = true;
            }
            // Kiểm tra trùng
            for (int i = 0; i < mang.size(); i++) {
                if (mang.get(i).getMasanpham().equalsIgnoreCase(tam_Masanpham)) {
                    System.out.println("Ma san pham khong duoc trung..!");
                    flag = true;
                }
            }
        } while (flag == true);
        xe.setMasanpham(tam_Masanpham);

        String tam_Ngaynhap;
        do {
            flag = false;
            System.out.println("Nhap ngay nhap: ");
            tam_Ngaynhap = kb.nextLine();
            // Kiểm tra trống
            if (tam_Ngaynhap.length() == 0) {
                System.out.println("Ngay khong duoc de trong..!");
                flag = true;
            }
        } while (flag == true);
        xe.setNgaynhap(tam_Ngaynhap);

        String tam_Hangsanxuat;
        do {
            flag = false;
            System.out.println("Nhap hang san xuat: ");
            tam_Hangsanxuat = kb.nextLine();
            // Kiểm tra trống
            if (tam_Hangsanxuat.length() == 0) {
                System.out.println("Hang san xuat khong duoc de trong..!");
                flag = true;
            }
        } while (flag == true);
        xe.setHangsanxuat(tam_Hangsanxuat);

        do {
            flag = false;
            try {
                System.out.println("Nhap so luong: ");
                xe.setSoluong(kb.nextInt());
                if (xe.getSoluong() < 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                System.out.println("So luong phai la so nguyen");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
    }

    void Xuat() {
        for (int i = 0; i < mang.size(); i++) {
            mang.get(i).Xuat();
        }
    }
}
