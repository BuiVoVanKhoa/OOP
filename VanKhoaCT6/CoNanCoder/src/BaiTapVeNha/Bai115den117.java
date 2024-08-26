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
public class Bai115den117 {
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
// Xuất các phần tử của mảng

    public static void xuatPTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println(mang[i]);
        }
    }
// Khai báo mảng mới 

    public static int[] chenPTTaiVT(int vtchen, int gtchen) {
        int newmang[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < vtchen) {
                newmang[i] = mang[i];
            } else if (i > vtchen) {
                newmang[i] = mang[i - 1];
            } else {
                newmang[i] = gtchen;
            }
        }
        return newmang;
    }
// Chèn phần tử có giá trị X vào phía sau phần tử có giá trị lớn nhất trong mảng

    public static int chenGTLN() {
        int max = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }
// Nhập giá trị chèn và xuất phần tử có giá trị X vào phía sau phần tử có giá trị lớn nhất trong mảng

    public static void vtMax() {
        System.out.println("Nhap gia tri can chen : ");
        int x = so.nextInt();
        int gtln = chenGTLN();
        for (int i = 0; i < n; i++) {
            if (mang[i] == gtln) {
                mang = chenPTTaiVT(i + 1, x);
                n++;
            }
        }
        System.out.println("Mang sau khi chen : ");
        xuatPTMang();
    }
// Chèn phần tử có giá trị X vào trước phần tử có giá trị là số nguyên tố đầu tiên trong mảng

    public static void chenSNT() {
        System.out.println("Nhap gia tri can chen : ");
        int x = so.nextInt();
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (mang[j] % 2 == 0) {
                        mang = chenPTTaiVT(i + 1, x);
                    }
                }
            }
        }
        System.out.println("Chen phan tu co gia tri "+x+ " vao truoc phan tu co gia tri la so nguyen to dau tien trong mang la :");
        xuatPTMang();
    }
// Chèn phần tử có giá trị X vào phía sau tất cả các phần tử có giá trị chẵn trong mảng

    public static void chenPTChan() {
        System.out.println("Nhap gia tri can chen : ");
        int x = so.nextInt();
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                chenPTTaiVT(i + 1, x);
            }
        }
        System.out.println("Mang sau khi chen : ");
        xuatPTMang();
    }

    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|                                                                                                 |");
        System.out.println("| 1. Nhap so luong phan tu cua mang                                                               |");
        System.out.println("| 2. Nhap gia tri phan tu cua mang                                                                |");
        System.out.println("| 3. Chen phan tu co gia tri X vao phia sau phan tu co gia tri lon nhat trong mang                |");
        System.out.println("| 4. Chen phan tu co gia tri X vao truoc phan tu co gia tri la so nguyen to dau tien trong mang   |");
        System.out.println("| 5. Chen phan tu co gia tri X vao phia sau tat ca cac phan tu co gia tri chan trong mang         |");
        System.out.println("| 0. Thoat                                                                                        |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
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
                    System.out.println("CHEN PHAN TU CO GIA TRI X VAO PHIA SAU PHAN TU CO GIA TRI LON NHAT TRONG MANG");
                    int mang1[] = chenPTTaiVT(2, 7);
                    chenGTLN();
                    vtMax();
                    break;
                case 4:
                    System.out.println("CHEN PHAN TU CO GIA TRI X VAO TRUOC PHAN TU CO GIA TRI LA SO NGUYEN TO DAU TIEN TRONG MANG");
                    chenSNT();
                    break;
                case 5:
                    System.out.println("CHEN PHAN TU CO GIA TRI X VAO PHIA SAU TAT CA CAC PHAN TU CO GIA TRI CHAN TRONG MANG");
                    chenPTChan();
                    break;
            }
        } while (chon != 0);
    }
}
