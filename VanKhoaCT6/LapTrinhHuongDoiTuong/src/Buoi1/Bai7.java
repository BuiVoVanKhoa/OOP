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
public class Bai7 {

    static Scanner so = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vui long nhap so luong phan tu cua mang : ");
        int n = nhapN();
        String[] mang = new String[n];
        Menu();
        int chon = 0;
        do {
            System.out.println("Vui long nhap yeu cau : ");
            chon = so.nextInt();
            switch (chon) {
                case 1:
                    nhapMang(mang);
                    break;
                case 2:
                    System.out.println("Cac gia tri cua mang la : ");
                    xuatMang(mang);
                    break;
                case 3:
                    phanTuNgan(mang);
                    break;
                case 4:
                    if (kyTuX(mang) == true) {
                        System.out.println("Ton tai..!");
                    } else {
                        System.out.println("Khong ton tai..!");
                    }
                    break;
            }
        } while (chon != 0);
    }

    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|                                                     |");
        System.out.println("| 1. Nhap gia tri phan tu cua mang                    |");
        System.out.println("| 2. Xuat gia tri phan tu cua mang                    |");
        System.out.println("| 3. Tim phan tu co do dai ngan nhat trong mang       |");
        System.out.println("| 4. Kiem tra mang co ton tai chuoi ky tu X hay khong |");
        System.out.println("| 0. Thoat                                            |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
    }

    public static int nhapN() {
        int x = 0;
        boolean flag = true;
        do {
            try {
                x = so.nextInt();
                if (x <= 0) {
                    System.out.println("Ban phai nhap so lon hon 0..!");
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

    public static void nhapMang(String[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (i + 1) + " : ");
            mang[i] = so.next();
        }
    }

    public static void xuatMang(String[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }
        System.out.println(" ");
    }

    public static void phanTuNgan(String[] mang) {
        int min = mang[0].length();
        for (String x : mang) {
            if (min > x.length()) {
                min = x.length();
            }
        }
        for (String x : mang) {
            if (min == x.length()) {
                System.out.println("Phan tu ngan nhat trong mang la : " + x);
            }
        }
    }

    public static boolean kyTuX(String[] mang) {
        System.out.println("Nhap ky tu X : ");
        String kytu = so.next();
        for (int i = 0; i < mang.length; i++) {
            if (mang[i].compareTo(kytu) == 0) {
                return true;
            }
        }
        return false;
    }
}
