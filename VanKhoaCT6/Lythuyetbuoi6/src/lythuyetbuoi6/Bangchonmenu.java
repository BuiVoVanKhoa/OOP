/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lythuyetbuoi6;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Bangchonmenu {

    ArrayList<Quanlynhanvien> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap so luong nhan vien");
            System.out.println("2. Xuat tat ca nhan vien");
            System.out.println("3. Tim kiem theo ho ten");
            System.out.println("4. Nhung nhan vien sinh nam 1975");
            System.out.println("5. Dem cac nhan vien sinh nam 1975 va que o Thai Nguyen");
            System.out.println("6. Nhung nhan vien co tong luong duoi 5.000.000");
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
                    timKiemTheoHoTen();
                    break;
                case 4:
                    nhanVien1975();
                    break;
                case 5:
                    nhanVien1975ThaiNguyen();
                    break;
                case 6:
                    LuongDuoi5M();
                    break;
                default:
                    System.out.println("Sai. Vui long nhap lai..!");
            }
        } while (chon != 0);
    }

    void Nhap() {
        System.out.println("Nhap so luong nhan vien : ");
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("1. Nhan vien van phong");
            System.out.println("2. Nhan vien kinh doanh");
            System.out.println("3. Cong nhan");
            System.out.println("Moi ban chon loai nhan vien : ");
            int luachon = kb.nextInt();
            switch (luachon) {
                case 1:
                    Nhanvienvanphong vp = new Nhanvienvanphong();
                    vp.Nhap();
                    mang.add(vp);
                    break;
                case 2:
                    Nhanvienkinhdoanh kd = new Nhanvienkinhdoanh();
                    kd.Nhap();
                    mang.add(kd);
                    break;
                case 3:
                    Congnhan cn = new Congnhan();
                    cn.Nhap();
                    mang.add(cn);
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

    void timKiemTheoHoTen() {
        boolean flag = false;
        kb.nextLine();
        System.out.println("Nhap ho ten can tim : ");
        String temp = kb.nextLine();
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).getHoten().equalsIgnoreCase(temp)) {
                mang.get(i).Xuat();
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Khong tim thay");
        }
    }

    void nhanVien1975() {
        boolean flag = false;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).getNamsinh() == 1975) {
                mang.get(i).Xuat();
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Khong tim thay");
        }
    }

    void nhanVien1975ThaiNguyen() {
        int dem = 0;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).getNamsinh() == 1975 && mang.get(i).getDiachi().toUpperCase().contains("THAI NGUYEN")) {
                dem++;
            }
        }
        System.out.println("So luong nhan vien sinh nam 1975 que Thai Nguyen : " + dem);
    }

    void LuongDuoi5M() {
        boolean flag = false;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).tinhLuong() < 5000000) {
                mang.get(i).Xuat();
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Khong tim thay");
        }
    }
}
