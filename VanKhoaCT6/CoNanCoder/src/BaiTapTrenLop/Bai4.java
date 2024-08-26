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
public class Bai4 {

    static int n;
    static Scanner so = new Scanner(System.in);

    public static int nhapN() {
        System.out.println("Nhap so nguyen duong : ");
        boolean flag = true;
        do {
            try {
                n = so.nextInt();
                if (n <= 0 || n >= 1000) {
                    System.out.println("Ban phai nhap so lon hon 0 va nho hon 1000..!");
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

    public static void cachDoc() {
        int tram = n / 100;
        int chuc = (n % 100) / 10;
        int donvi = (n % 100) % 10;
        switch (tram) {
            case 1:
                System.out.print("Mot tram ");
                break;
            case 2:
                System.out.print("Hai tram ");
                break;
            case 3:
                System.out.print("Ba tram ");
                break;
            case 4:
                System.out.print("Bon tram ");
                break;
            case 5:
                System.out.print("Nam tram ");
                break;
            case 6:
                System.out.print("Sau tram ");
                break;
            case 7:
                System.out.print("Bay tram ");
                break;
            case 8:
                System.out.print("Tan tram ");
                break;
            case 9:
                System.out.print("Chin tram ");
                break;
        }
        switch (chuc) {
            case 0:
                if (tram > 0 && chuc == 0 && donvi > 0) {
                    System.out.print("linh ");
                }
                break;
            case 1:
                if (chuc >= 1) {
                    System.out.print("muoi ");
                }
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon muoi ");
                break;
            case 5:
                System.out.print("nam muoi ");
                break;
            case 6:
                System.out.print("sau muoi ");
                break;
            case 7:
                System.out.print("bay muoi ");
                break;
            case 8:
                System.out.print("tam muoi ");
                break;
            case 9:
                System.out.print("chin muoi ");
                break;
        }
        switch (donvi) {
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bon");
                break;
            case 5:
                if (chuc >= 1 && donvi == 5) {
                    System.out.println("lam");
                } else {
                    System.out.println("nam");
                }
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            case 9:
                System.out.println("chin");
                break;
        }
    }

    public static void main(String[] args) {
        nhapN();
        cachDoc();
    }
}
