/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest1;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Bangchonmenu {

    ArrayList<Laodong> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap cong nhan chinh thuc");
            System.out.println("2. Xuat cong nhan chinh thuc");
            System.out.println("3. Co bao nhieu cong nhan chinh thuc co luong thang >= 6500000");
            System.out.println("4. Xoa cong nhan chinh thuc co luong thang it nhat");
            System.out.println("5. Sap xep cong nhan chinh thuc theo ho ten giam dan");
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
        Congnhanchinhthuc cn = new Congnhanchinhthuc();
        cn.Nhap();
        mang.add(cn);
    }

    void Xuat() {
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) instanceof Congnhanchinhthuc) {
                mang.get(i).Xuat();
            }
        }
    }

    void Luongnhanvien() {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).TinhLuong() >= 6500000 && mang.get(i) instanceof Congnhanchinhthuc) {
                count++;
            }
            flag = false;
        }
        System.out.println("So luong cong nhan chinh thuc co luong thang >= 6500000 : " + count);
        if (flag == true) {
            System.out.println("Khong co cong nhan chinh thuc");
        }
    }

    void Xoanhanvien() {
        double min = -1;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) instanceof Congnhanchinhthuc) {
                min = mang.get(i).TinhLuong();
                break;
            }
        }
        if (min != -1) {
            for (int i = 0; i < mang.size(); i++) {
                if (min > mang.get(i).TinhLuong()
                        && mang.get(i) instanceof Congnhanchinhthuc) {
                    min = mang.get(i).TinhLuong();
                }
            }
            for (int i = 0; i < mang.size(); i++) {
                if (min == mang.get(i).TinhLuong()
                        && mang.get(i) instanceof Congnhanchinhthuc) {
                    mang.remove(i);
                    i--;
                }
            }
        } else {
            System.out.println("Khong co cong nhan chinh thuc");
        }
    }

    void Sapxep() {

    }
}
