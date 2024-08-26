/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class QuanlyKhachHang {

    ArrayList<KhachHang> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon = 0;
        do {
            System.out.println("1. Nhap xuat danh sach cac hoa don khach hang");
            System.out.println("2. Tinh tong so luong cho tung loai khach hang");
            System.out.println("3. Tinh trung binh thanh tien cua khach hang nguoi nuoc ngoai");
            System.out.println("4. Xuat ra cac hoa don trong thang 9 nam 2023");
            System.out.println("5. Xoa khach hang ra khoi danh sach");
            System.out.println("Moi ban chon : ");
            chon = kb.nextInt();
            switch (chon) {
                case 1:
                    Nhap();
                    Xuat();
                    break;
                case 2:
                    SoLuongTLKH();
                    break;
                case 3:
                    TrungBinhTienNN();
                    break;
            }
        } while (chon != 0);
    }

    void Nhap() {
        System.out.println("Nhap so luong khach hang : ");
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("1. Khach hang Viet Nam");
            System.out.println("2. Khach hang Nuoc Ngoai");
            System.out.println("Moi ban chon loai khach hang : ");
            int luachon = kb.nextInt();
            switch (luachon) {
                case 1:
                    KHVietNam vn = new KHVietNam();
                    vn.Nhap();
                    mang.add(vn);
                    break;
                case 2:
                    KHNuocNgoai nn = new KHNuocNgoai();
                    nn.Nhap();
                    mang.add(nn);
                    break;
                default:
                    System.out.println("Sai. Vui long nhap lai..!");
            }
        }
    }

    void Xuat() {
        for (int i = 0; i < mang.size(); i++) {
            mang.get(i).Xuat();
        }
    }

    void SoLuongTLKH() {
        boolean flag = false;
        int dem = 0, count = 0;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).getSoluong() instanceof KHVietNam) {
                dem++;
            } else {
                count++;
            }
            flag = true;
        }
        System.out.println("Tong so luong loai khach hang Viet Nam : " + dem);
        System.out.println("Tong so luong loai khach hang Nuoc Ngoai : " + count);
        if (flag == false) {
            System.out.println("Khong tim thay");
        }
    }

    void TrungBinhTienNN() {
        double avarage; int count = 0;
        boolean flag = false;
        for(int i = 0; i < mang.size(); i++){
            if (mang.get(i).Thanhtien() instanceof KHNuocNgoai){
                
            }
        }
    }
}
