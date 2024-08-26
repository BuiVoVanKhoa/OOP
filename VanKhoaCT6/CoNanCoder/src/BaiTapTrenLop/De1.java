/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapTrenLop;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class De1 {

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

    public static void nhapGTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = so.nextInt();
        }
    }

    public static void chia5Va7() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 5 == 0 && mang[i] % 7 == 0) {
                count++;
            }
        }
        System.out.println("Cac phan tu chia het cho 5 va 7 la : " + count);
    }

    public static void tbLe() {
        int tong = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0) {
                tong += mang[i];
                count++;
            }
        }
        double average = tong / count;
        System.out.println("Trung binh cac phan tu le trong mang la : " + average);
    }

//    public static void soHT(){
//        int tong = 0;
//        for (int i = 0; i < n - 1; i++){
//            for (int j = i - 1; j < n; j++){
//                if (i % j == 0){
//                     tong += i;
//                }
//                if ( tong == n){
//                    System.out.println("So hoan thien cuoi cung trong mang la : "+mang[i]);
//                }
//            }
//        }
//    }
    public static void soChanDT(){
        for (int i = 0; i < n; i++){
            if (mang[i] % 2 == 0){
                System.out.println("Gia tri dau tien trong mang co chu so dau tien la so chan : "+mang[i]);
                break;
            }
        }
    }
    public static void Menu() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|                                                                   |");
        System.out.println("| 1. Nhap so luong phan tu cua mang                                 |");
        System.out.println("| 2. Nhap gia tri phan tu cua mang                                  |");
        System.out.println("| 3. Dem cac phan tu chia het cho 5 va 7                            |");
        System.out.println("| 4. Tinh trung binh cac phan tu le trong mang                      |");
        System.out.println("| 5. Tim so hoan thien cuoi cung trong mang                         |");
        System.out.println("| 6. Tinh tong cac so hoan thien trong mang tai vi tri le           |");
        System.out.println("| 7. Tim gia tri dau tien trong mang co chu so dau tien la so chan  |");
        System.out.println("| 8. Tim so chan nho nhat lon hon moi gia tri co trong mang         |");
        System.out.println("| 0. Thoat                                                          |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
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
                    System.out.println("DEM CAC PHAN TU CHIA HET CHO 5 VA 7");
                    chia5Va7();
                    break;
                case 4:
                    System.out.println("TINH TRUNG BINH CAC PHAN TU LE TRONG MANG");
                    tbLe();
                    break;
                case 5:
                    System.out.println("TIM SO HOAN THIEN CUOI CUNG TRONG MANG");
                    
                    break;
                case 7:
                    System.out.println("TIM GIA TRI DAU TIEN TRONG MANG CO CHU SO DAU TIEN LA SO CHAN");
                    soChanDT();
                    break;
            }
        } while (chon != 0);
    }
}
