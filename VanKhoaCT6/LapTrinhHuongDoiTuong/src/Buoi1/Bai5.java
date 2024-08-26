/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi1;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Bai5 {
// Khai báo biến toàn cục

    static Scanner so = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
        int[] mang;
        int n;
        System.out.println("Moi ban nhap so luong cua mang : ");
        n = nhapN();
        mang = new int[n];
        int chon = 0;
        do {
            System.out.println("Moi ban chon : ");
            chon = so.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("NHAP GIA TRI PHAN TU CUA MANG");
                    nhapGTMang(mang);
                    break;
                case 2:
                    System.out.println("XUAT GIA TRI PHAN TU CUA MANG");
                    xuatGTMang(mang);
                    break;
                case 3:
                    System.out.println("TIM GIA TRI LON NHAT VA LON NHI TRONG MANG CUNG VOI VI TRI CUA NO");
                    timLonNhatVaLonNhi(mang);
                    break;
                case 4:
                    System.out.println("SAP XEP MANG THEO THU TU GIAM DAM");
                    mangGiamDan(mang);
                    break;
                case 5:
                    System.out.println("NHAP SO NGUYEN X VA CHEN VAO MANG DAM BAO TINH SAP XEP GIAM DAN");
                    mang = chenXMangGiam(mang);
                    System.out.println("Mang sau khi chen X : ");
                    xuatGTMang(mang);
                    break;
            }
        } while (chon != 0);
    }
// Bảng Menu

    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|                                                                       |");
        System.out.println("| 1. Nhap gia tri phan tu cua mang                                      |");
        System.out.println("| 2. Xuat gia tri phan tu cua mang                                      |");
        System.out.println("| 3. Tim gia tri lon nhat va lon nhi trong mang cung voi vi tri cua no  |");
        System.out.println("| 4. Sap xep mang theo thu tu giam dan                                  |");
        System.out.println("| 5. Nhap so nguyen X va chen vao mang dam bao tinh sap xep giam dan    |");
        System.out.println("| 0. Thoat                                                              |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
    }
// Kiểm tra điều kiện nhập số lượng của mảng và nhập giá trị của mảng

    public static int nhapN() {
        int x = 0;
        boolean flag = true;
        do {
            try {
                x = so.nextInt();
                if (x <= 0 || x >= 100) {
                    System.out.println("Ban phai nhap so lon hon 0 va nho hon 100..!");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so..!");
                so.nextLine();
            }
        } while (flag);
        return x;
    }
// Phương thức nhập giá trị mảng

    public static void nhapGTMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = nhapN();
        }
    }
// Phương thức xuất giá trị của mảng

    public static void xuatGTMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }
        System.out.println("");
    }
// Phương thức tìm giá trị lớn nhất và giá trị lớn nhì

    public static void timLonNhatVaLonNhi(int[] mang) {
        int max = mang[0];
        for (int i = 1; i < mang.length; i++) {
            if (max < mang[i]) {
                max = mang[i];
            }
        }
        System.out.print("Gia tri lon nhat trong mang la " + max + " tai vi tri ");
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == max) {
                System.out.print(i + " ");
            }
        }
        int maxnhi = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] != max) {
                maxnhi = mang[i]; // Giả sử mang[i] là lớn nhì
                break;
            }
        }
        for (int i = 0; i < mang.length; i++) {
            if (maxnhi < mang[i] && mang[i] != max) {
                maxnhi = mang[i]; //Cập nhập lại lớn nhất
            }
        }
        System.out.print("\nGia tri lon nhi trong mang la " + maxnhi + " tai vi tri ");
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == maxnhi) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
// Phương thức xuất mảng giảm dần 

    public static void mangGiamDan(int[] mang) {
        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] < mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
        System.out.println("Mang theo thu tu giam dan la : ");
        xuatGTMang(mang);
    }
// Phương thức chèn tại vị trí

    public static int[] chenTaiViTri(int[] mang, int vtchen, int gtchen) {
        int[] mang1 = new int[mang.length + 1];
        for (int i = 0; i < vtchen; i++) {
            mang1[i] = mang[i];
        }
        mang1[vtchen] = gtchen;
        for (int i = mang.length; i > vtchen; i--) {
            mang1[i] = mang[i - 1];
        }
        mang = new int[mang.length + 1];
        return mang1;
    }
// Phương thức chèn X để mảng giảm

    public static int[] chenXMangGiam(int[] mang) {
        int x, i;
        System.out.println("Nhap gia tri X : ");
        x = so.nextInt();
        //Chèn đầu, chèn giữa
        for (i = 0; i < mang.length; i++) {
            if (x > mang[i]) {
                mang = chenTaiViTri(mang, i, x);
                break;
            }
        }
        // Chèn cuối
        if (i == mang.length) {
            mang = chenTaiViTri(mang, i, x);
        }
        return mang;
    }
}
