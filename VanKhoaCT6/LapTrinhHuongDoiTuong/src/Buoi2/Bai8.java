/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Bai8 {

    static Scanner so = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> mang = new ArrayList<Integer>();
        nhapDSMang(mang);
        xuatDSMang(mang);
        System.out.println("Nho nhat : " + timMin(mang));
        xoaMin(mang);
        chenXMin(mang);
    }

    public static void nhapDSMang(ArrayList<Integer> mang) {
        int n;
        System.out.println("Nhap so luong phan tu cua mang : ");
        n = so.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            mang.add(so.nextInt());
        }
    }

    public static void xuatDSMang(ArrayList<Integer> mang) {
        for (int i = 0; i < mang.size(); i++) {
            System.out.print(mang.get(i) + "\t");
        }
        System.out.println(" ");
    }

    public static int timMin(ArrayList<Integer> mang) {
        int min = mang.get(0);
        for (int i = 0; i < mang.size(); i++) {
            if (min > mang.get(i)) {
                min = mang.get(i);
            }
        }
        return min;
    }

    public static void xoaMin(ArrayList<Integer> mang) {
        int min = timMin(mang);
        for (int i = 0; i < mang.size(); i++) {
            if (min == mang.get(i)) {
                mang.remove(i);
                i--;
            }
        }
        System.out.println("Mang sau khi xoa la : ");
        xuatDSMang(mang);
    }
    public static void chenXMin(ArrayList<Integer> mang){
        System.out.println("Nhap gia tri chen : ");
        int x = so.nextInt();
        int min = timMin(mang);
        for (int i = 0; i < mang.size(); i++){
            if (min == mang.get(i)){
                mang.add(i,x);
                i++;
            }
        }
        System.out.println("Mang sau khi chen : ");
        xuatDSMang(mang);
    }
}
