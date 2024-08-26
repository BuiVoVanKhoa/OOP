/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade2;
import java.util.*;
/**
 *
 * @author FPTSHOP
 */
public class Bangchonmenu {
    ArrayList<Xe> mang = new ArrayList<>();
    Scanner kb = new Scanner (System.in);
    void Menu(){
        int chon;
        do{
            System.out.println("0. Thoat");
            System.out.println("1. Nhap thong tin xe oto khach");
            System.out.println("2. Xuat xe oto khach co don gia lon hon 50");
            System.out.println("3. Sap xep thue giam dan cua xe oto khach");
            System.out.println("4. Tinh trung binh thue cua xe oto khach");
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
        }while(chon != 0);
    }
    void Nhap() {
        XeOToKhach otokhach = new XeOToKhach();
        otokhach.Nhap();
        mang.add(otokhach);
    }

    void Xuat() {
        boolean flag = false;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i).getDongia() > 50 && mang.get(i) instanceof Xe ){
                mang.get(i).Xuat();
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("Khong tim thay");
        }
    }

    void Sapxep() {
        for (int i = 0; i < mang.size() - 1; i++) {
            for (int j = i + 1; j < mang.size(); j++) {
                if (mang.get(i).TinhThue() < (mang.get(j).TinhThue()) && (mang.get(i) instanceof XeOToKhach && mang.get(j) instanceof XeOToKhach)) {
                    XeOToKhach otokhach = new XeOToKhach();
                    otokhach = (XeOToKhach) mang.get(i);
                    mang.set(i, mang.get(j));
                    mang.set(j, otokhach);
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep thue giam dan cua xe oto khach : ");
        for (int i = 0; i < mang.size(); i++) {
            mang.get(i).Xuat();
        }
    }

    void TinhTrungBinh() {
        double sum = 0, count = 0, avarage;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) instanceof XeOToKhach) {
                sum += mang.get(i).TinhThue();
                count++;
            }
        }
        avarage = sum / count;
        System.out.println("Trung binh thue cua xe oto khach : " + avarage);
    }
}
