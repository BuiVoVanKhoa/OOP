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
public class Bai78den86 {
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
// Tìm vị trí phần tử âm đầu tiên trong mảng

    public static void phanTuAm() {
        for (int i = 0; i < n; i++) {
            if (mang[i] < 0) {
                System.out.println("Vi tri phan tu am dau tien trong mang la : " + i);
                break;
            }
        }
    }
// Tìm vị trí phần tử âm lớn nhất trong mảng

    public static void phanTuAmLN() {
        int gtmax = mang[0];
        int vtmax = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] < 0 && mang[i] > gtmax) {
                gtmax = mang[i];
                vtmax = i;
            }
        }
            System.out.println("Vi tri phan tu am lon nhat trong la : " + vtmax);
    }
// Tìm vị trí phần tử dương đầu tiên trong mảng

    public static void phanTuDuong() {
        for (int i = 0; i < n; i++) {
            if (mang[i] > 0) {
                System.out.println("Vi tri phan tu duong dau tien trong mang la : " + i);
                break;
            }
        }
    }
// Tìm vị trí phần tử dương bé nhất trong mảng

    public static void phanTuDuongNN() {
        int gtmin = 0, vtmin = 0;
        for (int i = 0; i < n; i++) {
        if (mang[i] > 0 ){
            gtmin = mang[i];
        break;
        }
        }
        for (int i = 0; i < n; i++){
            if (mang[i] > 0 && mang[i] < gtmin) {
                gtmin = mang[i];
            }
        }
        for (int i = 0; i < n; i++){
            if (mang[i] == gtmin) {              
        System.out.println("Vi tri phan tu duong be nhat trong la : " + i);
            }
        }
    }
// Tìm các phần tử là bội của 3 và 5

    public static void boi3Hoac5() {
        System.out.println("Cac phan tu la boi cua 3 hoac 5 la : ");
        for (int i = 0; i < n; i++){
            if (mang[i] % 3 ==0 || mang[i] % 5 == 0){
                System.out.println(mang[i]);
            }
        }
    }
// Tìm số chẵn cuối cùng có trong mảng

    public static void soChanCC() {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                temp = mang[i];
            }
        }
        System.out.println("So chan cuoi cung trong mang la : " + temp);
    }
// Tìm số lẻ lớn nhất có trong mảng

    public static void soLeLN() {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0 && mang[i] > temp) {
                temp = mang[i];
            }
        }
        System.out.println("So le lon nhat trong mang la : " + temp);
    }
// Đổi chỗ phần tử lớn nhất với phần tử nhỏ nhất trong mảng

    public static void doiChoPT() {
        int tam = 0;
        System.out.println("Doi cho phan tu lon nhat voi phan tu nho nhat trong mang : ");
        int max = mang[0], min = mang[0];
        for (int i = 0; i < n; i++){
            if (mang[i] > max){
                max = mang[i];
            }
            if (mang[i] < min){
                min = mang[i];
            }
        }
        for (int i = 0; i < n;i++){
            if (mang[i] == max){
                for (int j = 0; j < n; j++){
                    if (mang[j] == min){
                       tam = mang[i];
                       mang[i] = mang[j];
                       mang[j] = tam;
                       break;
                    }
                }
                break;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(mang[i]);
        }
    }
// Những phần tử có giá trị từ 1 đến X có trong mảng

    public static void giaTri1DenX() {
        int gtX;
        System.out.println("Nhap gia tri X : ");
        gtX = so.nextInt();
        for (int i = 0; i < n; i++) {
            if (mang[i] == 1 || mang[i] <= gtX) {
                System.out.println("Nhung phan tu co gia tri tu 1 den " + gtX + " co trong mang la : " + mang[i]);
            }
        }
    }
// Thanh Menu

    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|                                                               |");
        System.out.println("| 1. Nhap so luong phan tu cua mang                             |");
        System.out.println("| 2. Nhap gia tri phan tu cua mang                              |");
        System.out.println("| 3. Vi tri phan tu am dau tien trong mang                      |");
        System.out.println("| 4. Vi tri phan tu am lon nhat trong mang                      |");
        System.out.println("| 5. Vi tri phan tu duong dau tien trong mang                   |");
        System.out.println("| 6. Vi tri phan tu duong be nhat trong mang                    |");
        System.out.println("| 7. Cac phan tu boi cua 3 hoac 5                               |");
        System.out.println("| 8. So chan cuoi cung co trong mang                            |");
        System.out.println("| 9. So le lon nhat co trong mang                               |");
        System.out.println("| 10. Doi cho phan tu lon nhat voi phan tu nho nhat trong mang  |");
        System.out.println("| 11. Nhung phan tu co gia tri tu 1 den X co trong mang         |");
        System.out.println("| 0. Thoat                                                      |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
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
                    System.out.println("VI TRI PHAN TU AM DAU TIEN TRONG MANG");
                    phanTuAm();
                    break;
                case 4:
                    System.out.println("VI TRI PHAN TU AM LON NHAT TRONG MANG");
                    phanTuAmLN();
                    break;
                case 5:
                    System.out.println("VI TRI PHAN TU DUONG DAU TIEN TRONG MANG");
                    phanTuDuong();
                    break;
                case 6:
                    System.out.println("VI TRI PHAN TU DUONG BE NHAT TRONG MANG");
                    phanTuDuongNN();
                    break;
                case 7:
                    System.out.println("CAC PHAN TU BOI CUA 3 HOAC 5");
                    boi3Hoac5();
                    break;
                case 8:
                    System.out.println("SO CHAN CUOI CUNG CO TRONG MANG");
                    soChanCC();
                    break;
                case 9:
                    System.out.println("SO LE LON NHAT CO TRONG MANG");
                    soLeLN();
                    break;
                case 10:
                    System.out.println("DOI CHO PHAN TU LON NHAT VOI PHAN TU NHO NHAT TRONG MANG");
                    doiChoPT();
                    break;
                case 11:
                    System.out.println("NHUNG PHAN TU CO GIA TRI TU 1 DEN X CO TRONG MANG");
                    giaTri1DenX();
                    break;
            }
        } while (chon != 0);
    }
}
