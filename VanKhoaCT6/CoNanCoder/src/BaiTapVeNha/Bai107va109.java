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
public class Bai107va109 {

    static Scanner so = new Scanner(System.in);
    static int n;
    static final int MAX = 100;
    static int mang[] = new int[MAX];

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

    public static void nhapGTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = so.nextInt();
        }
    }

    public static void xuatPTMang(){
        for (int  i = 0; i < n; i++){
            System.out.println(mang[i]);
        }
    }
    public static boolean snt(int so) {
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
            }
    }
        return false;
    }
    public static void tangDanSNT() {
        int temp;
        for (int i = 0; i < n; i++){
        if (snt(mang[i])){
            for (int j = 0; j < n; j++){
               if (snt(mang[j]) && mang[i] < mang[j]){
                   temp = mang[i];
                   mang[i] = mang[j];
                   mang[j] = temp;
               }
            }
        }
        }
        System.out.println("Mang theo thu tu tang dan cua cac phan tu la so nguyen to la : ");
        xuatPTMang();
    }

    public static void chanGD() {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] % 2 == 0 && mang[j] % 2 == 0 && mang[i] < mang[j]) {
                    temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
            System.out.println("Sap xep cac phan tu chan giam dan la : " );
            xuatPTMang();
    }

    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|                                                                       |");
        System.out.println("| 1. Nhap so luong phan tu cua mang                                     |");
        System.out.println("| 2. Nhap gia tri phan tu cua mang                                      |");
        System.out.println("| 3. Sap xep mang theo thu tu tang dan cua cac phan tu la so nguyen to  |");
        System.out.println("| 4. Sap xep cac phan tu chan giam dan                                  |");
        System.out.println("| 0. Thoat                                                              |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
    }

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
                    System.out.println("SAP XEP MANG THEO THU TU TANG DAN CUA CAC PHAN TU LA SO NGUYEN TO");
                    tangDanSNT();
                    break;
                case 4:
                    System.out.println("SAP XEP CAC PHAN TU CHAN GIAM DAN");
                    chanGD();
                    break;
            }
        } while (chon != 0);
    }
}
