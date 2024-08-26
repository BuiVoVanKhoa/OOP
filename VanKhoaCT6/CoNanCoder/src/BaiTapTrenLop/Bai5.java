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
public class Bai5 {

    static Scanner so = new Scanner(System.in);
    static int n;
    static int sochan = 0, sole = 0;

    public static int nhapN() {
        System.out.println("Nhap so nguyen duong : ");
        boolean flag = true;
        do {
            try {
                n = so.nextInt();
                if (n <= 0) {
                    System.out.println("Ban phai nhap so lon hon 0..!");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so..!");
                so.nextLine();
            }
        } while (flag);
        return n;
    }

    public static void demChanLe() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sochan++;
            } else {
                sole++;
            }
        }
        System.out.println("So lan xuat hien so chan : " + sochan);
        System.out.println("So lan xuat hien so le : " + sole);
    }

    public static void main(String[] args) {
        nhapN();
        demChanLe();
    }
}
