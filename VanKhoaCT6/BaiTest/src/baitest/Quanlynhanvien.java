/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Quanlynhanvien {

    ArrayList<Nhanvien> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap nhan vien quan ly");
            System.out.println("2. Xuat nhan vien quan ly");
            System.out.println("3. Tong luong cua nhan vien quan ly co tham nien cong tac <= 5 nam");
            System.out.println("4. Xoa nhan vien quan ly co luong it nhat");
            System.out.println("5. Sap xep nhan vien quan ly theo ho ten tang dan");
            System.out.println("Moi ban chon : ");
            chon = kb.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    Luongnhanvien();
                    break;
                case 4:
                    Xoanhanvien();
                    Xuat();
                    break;
                case 5:
                    Sapxep();
                    break;
                default:
                    System.out.println("Sai. Vui long nhap lai..!");
            }
        } while (chon != 0);
    }

    void Nhap() {
        Nhanvienquanly ql = new Nhanvienquanly();
        ql.Nhap();
        mang.add(ql);
    }

    void Xuat() {
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) instanceof Nhanvienquanly) {
                mang.get(i).Xuat();
            }
        }
    }

    void Luongnhanvien() {
        double sum = 0;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).getThamnienCT() <= 5 && mang.get(i) instanceof Nhanvienquanly) {
                sum += mang.get(i).TinhLuong();
            }
        }
        System.out.println("Tong luong cua nhan vien quan ly co tham nien cong tac <= 5 nam : " + sum);
    }

    void Xoanhanvien() {
        double min = -1;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) instanceof Nhanvienquanly) {
                min = mang.get(i).TinhLuong();
                break;
            }
        }
        if (min != -1) {
            for (int i = 0; i < mang.size(); i++) {
                if (min > mang.get(i).TinhLuong()
                        && mang.get(i) instanceof Nhanvienquanly) {
                    min = mang.get(i).TinhLuong();
                }
            }
            for (int i = 0; i < mang.size(); i++) {
                if (min == mang.get(i).TinhLuong()
                        && mang.get(i) instanceof Nhanvienquanly) {
                    mang.remove(i);
                    i--;
                }
            }
        } else {
            System.out.println("Khong co nhan vien quan ly");
        }
    }

    void Sapxep() {
        System.out.println("Sap xep nhan vien quan ly theo ho ten tang dan : ");
        Collections.sort(mang, new Comparator<Nhanvien>() {
            public int compare(Nhanvien nhanvien1, Nhanvien nhanvien2) {
                // So sánh theo họ tên tài xế giảm dần
                return nhanvien2.Hotennv.compareTo(nhanvien1.Hotennv);
            }
        });
        for (Nhanvien nhanvien : mang) {
            if (nhanvien instanceof Nhanvienquanly) {
                System.out.println(nhanvien.Hotennv);
            }
        }
    }

}
