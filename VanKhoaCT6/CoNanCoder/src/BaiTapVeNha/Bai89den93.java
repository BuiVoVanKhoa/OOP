/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapVeNha;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Bai89den93 {
// Khai báo các biến toàn cục

    static Scanner so = new Scanner(System.in);
    static int n;
    static final int MAX = 100;
    static int mang[] = new int[MAX];
// Nhập số lượng phần tử của mảng

    public static int nhapN() {
        int x = 0;
        boolean flag = true;
        do {
            try {
                x = so.nextInt();
                if (x <= 0 || x > 100) {
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
// Nhập giá trị phần tử của mảng

    public static void nhapGTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = so.nextInt();
        }
    }
// Số lần xuất hiện phần tử X trong mảng

    public static void soLanXHPTX() {
        int gtX = 0, count = 0;
        System.out.println("Nhap gia tri phan tu : ");
        gtX = so.nextInt();
        for (int i = 0; i < n; i++) {
            if (mang[i] == gtX) {
                count++;
            }
        }
        System.out.println("So lan xuat hien phan tu " + gtX + " trong mang la : " + count);
    }
// Đếm các phần tử nhỏ hơn X trong mảng

    public static void phanTuNHX() {
        int gtX = 0, count = 0;
        System.out.println("Nhap gia tri phan tu : ");
        gtX = so.nextInt();
        for (int i = 0; i < n; i++) {
            if (mang[i] < gtX) {
                count++;
            }
        }
        System.out.println("Cac phan tu nho hon " + gtX + " trong mang la : " + count);
    }
// Đếm các phần tử là số nguyên tố trong mảng

    public static boolean demSoNT() {
        int dem = 0;
        boolean nguyento = true;
        for (int i = 0; i <= n; i++) {
            if (mang[i] <= 1) {
                nguyento = false;
            }
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    nguyento = false;
                    break;
                }
                dem++;
            }
        }
        System.out.println("Cac phan tu la so nguyen to trong mang la : " + dem);
        return nguyento;
    }
// Đếm các phần tử là số hoàn thiện trong mảng

    public static void soHT() {
        int tong, dem = 0;
        for (int j = 0; j < n; j++) {
            tong = 0;
            for (int i = 1; i < mang[j]; i++) {
                if (mang[j] % i == 0) {
                    tong += i;                
                }
            }
            if (tong == mang[j]){
                dem++;
            }
        }
        System.out.println("Cac phan tu la so hoan thien trong mang la : " + dem);
    }
// Đếm các phần tử là bội của 3 hoặc 5 trong mảng các số nguyên

    public static void boiCua3Hoac5() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0 || mang[i] % 5 == 0) {
                count++;
            }
        }
        System.out.println("Cac phan tu la boi cua 3 hoac 5 trong mang la : " + count);
    }
// Thanh Menu

    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("|                                                   |");
        System.out.println("| 1. Nhap so luong phan tu cua mang                 |");
        System.out.println("| 2. Nhap gia tri phan tu cua mang                  |");
        System.out.println("| 3. So lan xuat hien phan tu X trong mang          |");
        System.out.println("| 4. Dem cac phan tu nho hon X trong mang           |");
        System.out.println("| 5. Dem cac phan tu la so nguyen to trong mang     |");
        System.out.println("| 6. Dem cac phan tu la so hoan thien trong mang    |");
        System.out.println("| 7. Dem cac phan tu la boi cua 3 hoac 5 trong mang |");
        System.out.println("| 0. Thoat                                          |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
    }
// Nhập các lựa chọn trong Menu

    public static void main(String[] args) {
        int chon = 0;
        do {
            Menu();
            System.out.println("MOI BAN CHON : ");
            chon = so.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("NHAP SO LUONG PHAN TU CUA MANG : ");
                    n = nhapN();
                    break;
                case 2:
                    System.out.println("NHAP GIA TRI PHAN TU CUA MANG");
                    nhapGTMang();
                    break;
                case 3:
                    System.out.println("SO LAN XUAT HIEN PHAN TU X TRONG MANG");
                    soLanXHPTX();
                    break;
                case 4:
                    System.out.println("DEM CAC PHAN TU NHO HON X TRONG MANG");
                    phanTuNHX();
                    break;
                case 5:
                    System.out.println("DEM CAC PHAN TU LA SO NGUYEN TO TRONG MANG");
                    demSoNT();
                    break;
                case 6:
                    System.out.println("DEM CAC PHAN TU LA SO HOAN THIEN TRONG MANG");
                    soHT();
                    break;
                case 7:
                    System.out.println("DEM CAC PHAN TU LA BOI CUA 3 HOAC 5 TRONG MANG");
                    boiCua3Hoac5();
                    break;
            }
        } while (chon != 0);
    }
}
