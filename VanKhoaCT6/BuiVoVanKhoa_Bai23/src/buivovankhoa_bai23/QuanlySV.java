/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai23;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class QuanlySV {

    ArrayList<Sinhvien> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Xuat thong tin sinh vien");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. Sinh vien co diem toan lon nhat");
            System.out.println("6. Sap xep sinh vien theo ma sinh vien tang dan");
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
//                case 3:
//                    Luongnhanvien();
//                    break;
//                case 4:
//                    Xoanhanvien();
//                    Xuat();
//                    break;
//                case 5:
//                    Sapxep();
//                    Xuat();
//                    break;
                case 6:
                    
                    break;
                default:
                    System.out.println("Sai. Vui long nhap lai..!");
            }
        } while (chon != 0);
    }

    void Nhap() {
        int n;
        do {
            System.out.println("Nhap so luong sinh vien : ");
            n = kb.nextInt();
            if (n < 1 || n > 5) {
                System.out.println("Vui long nhap so luong lon hon 0 va nho hon 5..!");
            }
        } while (n < 1 || n > 5);
        for (int i = 0; i < n; i++) {
            SinhvienCNTT sv = new SinhvienCNTT();
            sv.setSVCNTT();
            mang.add(sv);
        }
    }

    void Xuat() {
        for (int i = 0; i < mang.size(); i++) {
            SinhvienCNTT tam = new SinhvienCNTT();
            tam = (SinhvienCNTT) mang.get(i);
            tam.viewSVCNTT();
        }
    }
}
