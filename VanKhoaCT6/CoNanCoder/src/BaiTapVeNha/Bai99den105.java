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
public class Bai99den105 {
// Khai báo biến toàn cục 

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
// Nhập giá trị cho từng phần tử của mảng

    public static void nhapGTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = so.nextInt();
        }
    }
// Tính tổng các phần tử cực đại trong mảng

    public static void tongCD() {
        int tong = 0;
        int mang1[] = new int[n + 2];
        for (int i = 0; i < n; i++) {
            mang1[i + 1] = mang[i];
        }
        for (int i = 1; i < n + 1; i++) {
            if (mang1[i] > mang1[i - 1] && mang1[i] > mang1[i + 1]) {
                tong += mang1[i];
            }
        }
        System.out.println("Tong cac phan tu cuc dai trong mang la : " + tong);
    }
// Tính tổng các phần tử cực tiểu trong mảng

    public static void tongCT() {
        int tong = 0;
        int mang1[] = new int[n + 2];
        for (int i = 0; i < n; i++) {
            mang1[i + 1] = mang[i];
        }
        for (int i = 1; i < n + 1; i++) {
            if (mang1[i] < mang1[i - 1] && mang1[i] < mang1[i + 1]) {
                tong += mang1[i];
            }
        }
        System.out.println("Tong cac phan tu cuc tieu trong mang la : " + tong);
    }
// Tính tổng các phần tử là bội của 3 hoặc 5 trong mảng

    public static void tongBoi3Hoac5() {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0 || mang[i] % 5 == 0) {
                tong += mang[i];
            }
        }
        System.out.println("Tong cac phan tu la boi cua 3 hoac 5 trong mang la : " + tong);
    }
// Tính tổng các phần tử là số hoàn thiện trong mảng

    public static void tongSHT() {
        int sht, tong = 0;
        for (int j = 0; j < n; j++) {
            sht = 0;
            for (int i = 1; i < mang[j]; i++) {
                if (mang[j] % i == 0) {
                    sht += i;
                }
            }
            if (sht == mang[j]) {
                tong += mang[j];
            }
        }
        System.out.println("Tong cac phan tu la so hoan thien trong mang la : " + tong);
    }
// Tính giá trị trung bình các số hoàn thiện trong mảng

    public static void gttbSHT() {
        int sht, tong = 0, count = 0;
        for (int j = 0; j < n; j++) {
            sht = 0;
            for (int i = 1; i < mang[j]; i++) {
                if (mang[j] % i == 0) {
                    sht += i;
                }
            }
            if (sht == mang[j]) {
                tong += mang[j];
                count++;
            }
        }
        double average = tong / count;
        System.out.println("Gia tri trung binh cac so hoan thien trong mang la : " + average);
    }
// Tính giá trị trung bình các phần tử có giá trị lẻ trong mảng

    public static void gtriLe() {
        int tong = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0) {
                tong += mang[i];
                dem++;
            }
        }
        double average = tong / dem;
        System.out.println("Trung binh cac phan tu co gia tri le trong mang la : " + average);
    }
// Tính giá mảngtrị trung bình các phần tử có giá trị là ước số của X trong 

    public static void gttbUocSoX() {
        int tong = 0, dem = 0;
        System.out.println("Nhap gia tri X : ");
        int x = so.nextInt();
        for (int i = 0; i < n; i++) {
            if (x % mang[i] == 0) {
                tong += mang[i];
                dem++;
            }
        }
        double average = tong / dem;
        System.out.println("Gia tri trung binh cac phan tu co gia tri la uoc so cua " + x + " trong mang la : " + average);
    }
// Thanh Menu 

    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("|                                                                               |");
        System.out.println("| 1. Nhap so luong phan tu cua mang                                             |");
        System.out.println("| 2. Nhap gia tri phan tu cua mang                                              |");
        System.out.println("| 3. Tinh tong cac phan tu cuc dai trong mang                                   |");
        System.out.println("| 4. Tinh tong cac phan tu cuc tieu trong mang                                  |");
        System.out.println("| 5. Tinh tong cac phan tu la boi cua 3 hoac 5 trong mang                       |");
        System.out.println("| 6. Tinh tong cac phan tu la so hoan thien trong mang                          |");
        System.out.println("| 7. Tinh gia tri trung binh cac so hoan thien trong mang                       |");
        System.out.println("| 8. Tinh gia tri trung binh cac phan tu co gia tri le trong mang               |");
        System.out.println("| 9. Tinh gia tri trung binh cac phan tu co gia tri la uoc so cua X trong mang  |");
        System.out.println("| 0. Thoat                                                                      |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
    }
// Thanh chọn các chức năng

    public static void main(String[] args) {
        int chon = 0;
        do {
            Menu();
            System.out.println("Moi ban chon : ");
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
                    System.out.println("TINH TONG CAC PHAN TU CUC DAI TRONG MANG");
                    tongCD();
                    break;
                case 4:
                    System.out.println("TINH TONG CAC PHAN TU CUC TIEU TRONG MANG");
                    tongCT();
                    break;
                case 5:
                    System.out.println("TINH TONG CAC PHAN TU LA BOI CUA 3 HOAC 5 TRONG MANG");
                    tongBoi3Hoac5();
                    break;
                case 6:
                    System.out.println("TINH TONG CAC PHAN TU LA SO HOAN THIEN TRONG MANG");
                    tongSHT();
                    break;
                case 7:
                    System.out.println("TINH GIA TRI TRUNG BINH CAC PHAN TU LA SO HOAN THIEN TRONG MANG");
                    gttbSHT();
                    break;
                case 8:
                    System.out.println("TINH GIA TRI TRUNG BINH CAC PHAN TU CO GIA TRI LE TRONG MANG");
                    gtriLe();
                    break;
                case 9:
                    System.out.println("TINH GIA TRI TRUNG BINH CAC PHAN TU CO GIA TRI LA UOC SO CUA X TRONG MANG");
                    gttbUocSoX();
                    break;
            }
        } while (chon != 0);
    }
}
