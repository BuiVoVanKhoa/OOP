/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoNanCode;
import java.util.*;
/**
 *
 * @author FPTSHOP
 */
public class Buoi12 {
    static Scanner so = new Scanner (System.in);
    static int n;
    static final int MAX = 100;
    static int mang[] = new int [MAX];
    public static int nhapN(){
        int x = 0;
        boolean flag = true;
        do{
            try {
                x = so.nextInt();
                if (x <= 0 || x > 100){
                    System.out.println("Ban phai nhap so lon hon 0 va nho hon 100..!");
                    continue;
                }
                flag = false;
            }
            catch (Exception e) {
                System.out.println("Ban phai nhap so..!");
            }
        }
        while (flag);
        return x;
    }
    public static void nhapPTMang(){
        for (int i = 0; i < n; i++){
            System.out.println("Nhap gia tri phan tu thu "+(i+1)+ " : ");
            mang[i] = so.nextInt();
        }
    }
    public static void xuatPTMang(){
        for (int i = 0; i < n; i++){
            System.out.println(mang[i]);
        }
    }
    public static void xoaPTMang(int vtxoa){
        for (int i = vtxoa; i < n; i++){
            if ( i == n -1 ){
                continue;
            }
            mang[i] = mang [i+1];
        }
        n--;
        xuatPTMang();
    }
    public static void Menu(){
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|                                                                       |");
        System.out.println("| 1. Nhap so luong phan tu cua mang                                     |");
        System.out.println("| 2. Nhap gia tri phan tu cua mang                                      |");
        System.out.println("| 3. Xuat cac gia tri phan tu cua mang                                  |");
        System.out.println("| 4. Xoa phan tu tai vi tri le trong mang                               |");
        System.out.println("| 0. Thoat                                                              |");
        System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
    }
    public static void main (String[]args){
        int chon = 0;
        do {
            Menu();
            System.out.println("Moi ban chon : ");
            chon = so.nextInt();
            switch (chon){
                case 1:
                    System.out.println("NHAP SO LUONG PHAN TU CUA MANG : ");
                    nhapN();
                    break;
                case 2:
                    System.out.println("NHAP GIA TRI PHAN TU CUA MANG");
                    nhapPTMang();
                    break;
                case 3:
                    System.out.println("XUAT CAC GIA TRI PHAN TU CUA MANG");
                    xuatPTMang();
                    break;
                case 4:
                    System.out.println("XOA PHAN TU TAI VI TRI LE TRONG MANG");
                    int xoa = 0;
                    for (int i = 0; i < n; i++){
                        if (mang[i] % 2 != 0){
                            xoa += i;
                        }
                    }
                    xoaPTMang(xoa);
                    break;
            }
        }
        while (chon != 0);
    }
}
