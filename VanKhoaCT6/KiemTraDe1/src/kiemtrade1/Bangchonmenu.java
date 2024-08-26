/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade1;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Bangchonmenu {

    ArrayList<Giaodich> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap thong tin giao dich vang");
            System.out.println("2. Xuat giao dich vang co so luong nho hon 10");
            System.out.println("3. Sap xep thanh tien tang dan cua giao dich vang");
            System.out.println("4. Tinh trung binh thanh tien cua giao dich vang");
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
                    Sapxep();
                    break;
                case 4:
                    TinhTrungBinh();
                    break;
                default:
                    System.out.println("Sai. Vui long nhap lai..!");
            }
        } while (chon != 0);
    }

    void Nhap() {
        Giaodichvang gdv = new Giaodichvang();
        gdv.Nhap();
        mang.add(gdv);
    }

    void Xuat() {
        System.out.println("Giao dich vang co so luong nho hon 10 : ");
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).getSoluong() < 10 && mang.get(i) instanceof Giaodichvang) {
                mang.get(i).Xuat();
            }
        }
    }

    void Sapxep() {
        for (int i = 0; i < mang.size() - 1; i++) {
            for (int j = i + 1; j < mang.size(); j++) {
                if (mang.get(i).ThanhTien() > (mang.get(j).ThanhTien()) && (mang.get(i) instanceof Giaodichvang && mang.get(j) instanceof Giaodichvang)) {
                    Giaodichvang gdvang = new Giaodichvang();
                    gdvang = (Giaodichvang) mang.get(i);
                    mang.set(i, mang.get(j));
                    mang.set(j, gdvang);
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep thanh tien tang dan cua giao dich vang : ");
        for (int i = 0; i < mang.size(); i++) {
            mang.get(i).Xuat();
        }
    }

    void TinhTrungBinh() {
        double sum = 0, count = 0, avarage;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) instanceof Giaodichvang) {
                sum += mang.get(i).ThanhTien();
                count++;
            }
        }
        avarage = sum / count;
        System.out.println("Trung binh thanh tien cua giao dich vang : " + avarage);
    }
}
