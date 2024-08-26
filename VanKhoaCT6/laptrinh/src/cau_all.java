/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_all;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class cau_all {

    static Scanner sc = new Scanner(System.in);

    static int n;

    static int[] a;

    static Random rd = new Random();

    public static String color(int color) {
        String cl = String.valueOf(color);
        return "\u001B[" + cl + "m";
    }

    public static int ktnhap() {
        int x = 0;
        boolean flag;
        do {
            flag = false;
            try {

                x = sc.nextInt();
            } catch (Exception e) {
                flag = true;
                System.out.println("vui long nhap so!");
                sc.nextLine();
            }

        } while (flag);
        return x;
    }

    public static void delay(int n) {
        try {
            Thread.sleep(n); // Độ trễ 1 giây (1000 milliseconds)
        } catch (InterruptedException e) {
        }
    }

    public static void nhapN() {
        System.out.print("Nhap so pt: ");
        do {
            n = ktnhap();
            if (n <= 0) {
                System.out.println("so phai lon hon 0!");
            } else {
                break;
            }
        } while (true);
        int ar[] = new int[n];
        a = ar;
    }

    public static void nhapM() {
        nhapN();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu %d: ", (i + 1));
            a[i] = ktnhap();
        }
        System.out.println("Mang cua ban la:");
        out();

    }

    public static void out() {
        for (int i = 0; i < n; i++) {
            System.out.println("A[" + i + "]=" + a[i]);
        }
    }

    public static void mrd() {
        nhapN();
        System.out.print("Nhap gioi han random: ");
        int num = ktnhap();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(num * 2 + 1) - num;
        }
        System.out.println("Mang random cua ban la:");
        out();
    }

    public static void sapxep() {
        int t;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < a[i + 1]) {
                    t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
        System.out.println("Mang da duoc sap xep lai:");
        out();
    }

    public static void chennum(int vt, int gt) {
        n = n + 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < vt) {
                arr[i] = a[i];
            } else {
                if (i > vt) {
                    arr[i] = a[i - 1];
                } else if (i == vt) {
                    arr[i] = gt;
                }

            }
        }
        a = arr;

    }

    public static void chen() {
        System.out.println("Nhap vi tri chen");
        int vt = ktnhap();
        System.out.println("Nhap gia tri chen");
        int gt = ktnhap();
        chennum(vt, gt);
        System.out.println("Mang da duoc chen thanh cong:");
        out();
    }

    public static void ptam() {
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                System.out.println("phan tu am dau tien o vi tri:" + i);
                break;
            }
        }
    }

    private static void ptaml() {
        int max = 0;
        for (int x : a) {
            if (x < 0) {
                max = x;
                break;
            }
        }

        for (int x : a) {
            if (x > max && x < 0) {
                max = x;
            }
        }
        for (int i = 0; i < n; i++) {
            if (max == a[i]) {
                System.out.println("phan tu am lon nhat o vi tri:" + i);
            }
        }
    }

    private static void ptdb() {
        int min = 0;
        for (int x : a) {
            if (x > 0) {
                min = x;
                break;
            }
        }

        for (int x : a) {
            if (x < min && x > 0) {
                min = x;
            }
        }
        for (int i = 0; i < n; i++) {
            if (min == a[i]) {
                System.out.println("phan tu duong be nhat o vi tri:" + i);
            }
        }
    }

    public static void ptd() {
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                System.out.println("phan tu duong dau tien o vi tri:" + i);
                break;
            }
        }
    }

    public static void chia35() {
        System.out.println("phan tu chia het cho 3 hoac 5:");
        for (int x : a) {
            if (x % 3 == 0 || x % 5 == 0) {
                System.out.print(x + ",");
            }
        }
    }

    public static void dchia35() {
        int dem = 0;
        for (int x : a) {
            if (x % 3 == 0 || x % 5 == 0) {
                dem++;
            }
        }
        System.out.printf("Co %d phan tu chia het cho 3 hoac 5: ", dem);
    }

    public static void tchia35() {
        int tong = 0;
        for (int x : a) {
            if (x % 3 == 0 || x % 5 == 0) {
                tong += x;
            }
        }
        System.out.printf("Co %d phan tu chia het cho 3 hoac 5: ", tong);
    }

    public static void scc() {
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                System.out.println("phan tu chan o cuoi la:" + a[i]);
                break;
            }
        }
    }

    public static void sll() {
        int max = 0;
        for (int x : a) {
            if (x % 2 != 0) {
                max = x;
                break;
            }
        }

        for (int x : a) {
            if (x > max && x % 2 != 0) {
                max = x;
            }
        }
        for (int x : a) {
            if (max == x) {
                System.out.println("phan tu le lon nhat:" + x);
            }
        }
    }

    public static void dvt() {
        int max = a[0];
        int min = a[0];
        int t;
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        for (int j = 0; j < n; j++) {
            if (max == a[j]) {
                for (int i = 0; i < n; i++) {
                    if (min == a[i]) {
                        t = a[j];
                        a[j] = a[i];
                        a[i] = t;
                        break;
                    }
                }
                break;
            }
        }
        System.out.println("Da doi vi tri:");
        out();

    }

    public static void ptx() {
        System.out.print("Nhap x: ");
        int num = ktnhap();
        System.out.println("Phan tu co gia tri tu 1 den x:");
        for (int x : a) {
            if (x >= 1 && x <= num) {
                System.out.print(x + ",");
            }
        }
    }

    public static void nhx() {
        int dem = 0;
        System.out.print("Nhap x: ");
        int num = ktnhap();
        System.out.print("So phan tu co gia tri nho hon x: ");
        for (int x : a) {
            if (x <= num) {
                dem++;
            }
        }
        System.out.print(dem);
    }

    public static void demx() {
        System.out.print("Nhap x: ");
        int num = ktnhap();
        int dem = 0;
        for (int x : a) {
            if (x == num) {
                dem++;
            }
        }
        System.out.printf("co %d phan tu x trong mang", dem);
    }

    public static boolean snt(int num) {
        int dem = 0;
        boolean bl = false;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            bl = true;
        }
        return bl;
    }

    public static void dsnt() {
        int dem = 0;
        for (int x : a) {
            if (snt(x)) {
                dem++;
            }
        }
        System.out.printf("Co %d so nguyen to trong mang", dem);
    }

    public static boolean sht(int n) {
        int s = 0;
        boolean b = false;
        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            b = true;
        }
        return b;

    }

    public static void shtm() {
        int dem = 0;
        for (int x : a) {
            if (sht(x) == true) {
                dem++;
            }
        }
        System.out.printf("Co %d so hoan thien trong mang", dem);
    }

    public static void tshtm() {
        int tong = 0;
        for (int x : a) {
            if (sht(x) == true) {
                tong += x;
            }
        }
        System.out.println("Tong so hoan thien trong mang: " + tong);
    }

    public static void tcd() {
        int sum = 0;
        int arr[] = new int[n + 2];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = a[i];
        }
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac so cuc dai: " + sum);
    }

    public static void tct() {
        int sum = 0;
        int arr[] = new int[n + 2];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = a[i];
        }
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac so cuc tieu: " + sum);
    }

    public static void tbl() {
        int tong = 0;
        int dem = 0;
        double avg = 0;
        for (int x : a) {
            if (x % 2 != 0) {
                tong += x;
                dem++;
            }
        }
        if (dem != 0) {
            avg = tong / (dem + 0.0);
        }
        System.out.println("TB cac so le la : " + avg);

    }

    public static void tbx() {
        System.out.print("Nhap x: ");
        int num = ktnhap();
        int tong = 0;
        int dem = 0;
        double avg = 0;
        for (int x : a) {
            if (num % x == 0) {
                tong += x;
                dem++;
            }
        }
        if (dem != 0) {
            avg = tong / (dem + 0.0);
        }
        System.out.println("TB cac so la boi cua x la : " + avg);

    }

    public static void tsnt() {
        int t;

        for (int i = 0; i < n; i++) {
            if (snt(a[i])) {

                for (int j = 0; j < n; j++) {
                    if (snt(a[j]) && a[i] < a[j]) {
                        t = a[i];
                        a[i] = a[j];
                        a[j] = t;

                    }
                }
            }
        }
        System.out.println("Mang da duoc sap xep lai!");
        out();
    }

    public static void gsc() {
        int t;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {

                for (int j = 0; j < n; j++) {
                    if (a[j] % 2 == 0 && a[i] > a[j]) {
                        t = a[i];
                        a[i] = a[j];
                        a[j] = t;

                    }
                }
            }
        }
        System.out.println("Mang da duoc sap xep lai!");
        out();
    }

    public static void cx() {

        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Nhap gia tri chen");
        int gt = ktnhap();
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                chennum(i + 1, gt);
            }
        }
        System.out.println("Mang da duoc chen thanh cong:");
        out();

    }
    public static void csnt(){
        System.out.println("Nhap gia tri chen");
        int gt = ktnhap();
        for (int i = 0; i < n; i++) {
            if (snt(a[i])) {
                chennum(i + 1, gt);
                break;
            }
        }
        System.out.println("Mang da duoc chen thanh cong:");
        out();

    }
    public static void csc(){
        System.out.println("Nhap gia tri chen");
        int gt = ktnhap();
        for (int i = 0; i < n; i++) {
            if (a[i]%2==0) {
                chennum(i + 1, gt);
            }
        }
        System.out.println("Mang da duoc chen thanh cong:");
        out();

    }

    public static void Menu() {
        int input;

        do {
            delay(1000);
            System.out.println(color(31) + "___________MENU___________" + color(34));
            delay(500);
            System.out.println("1 - Nhap mang");
            System.out.println("2 - Tao mang random");
            System.out.println("3 - Xuat mang");
            System.out.println("4 - Sap xep mang giam dan");
            System.out.println("5 - Chen mang");
            System.out.println("6 - Phan tu am dau tien");
            System.out.println("7 - Vi tri phan tu am lon nhat");
            System.out.println("8 - Vi tri phan tu duong dau tien");
            System.out.println("9 - Vi tri phan tu duong be nhat");
            System.out.println("10- Phan tu chia het cho 3 hoặc 5");
            System.out.println("11- Phan tu chan o cuoi");
            System.out.println("12- Phan tu le lon nhat ");
            System.out.println("13- Doi vi tri so be nhat voi lon nhat");
            System.out.println("14- Phan tu co gia tri tu 1 den x");
            System.out.println("15- Dem so phan tu x");
            System.out.println("16- Dem so nho hon x");
            System.out.println("17- Dem so nguyen to");
            System.out.println("18- Dem so hoan thien");
            System.out.println("19- Dem so chia het cho 3 hoặc 5");
            System.out.println("20- Tong cac so cuc dai");
            System.out.println("21- Tong cac so cuc tieu");
            System.out.println("22- Tong cac so chia het cho 3 hoặc 5");
            System.out.println("23- Tong cac so hoan thien");
            System.out.println("24- Tinh TB cac so le");
            System.out.println("25- Tinh TB cac so la uoc cua x");
            System.out.println("26- Sap xep tang dan cac so nguyen to");
            System.out.println("27- Sap xep giam dan cac so chan");
            System.out.println("28- Chen phia sau so lon nhat");
            System.out.println("29- Chen phia sau so nguyen to dau tien");
            System.out.println("30- Chen phia sau so chan");
            System.out.println("0 - Thoat");
            System.out.println("");
            delay(200);
            System.out.print("Lua chon: ");
            do {
                input = ktnhap();
                if (input < 0) {
                    System.out.println("Khong ton tai lua chon tren!");
                } else {
                    break;
                }
            } while (true);

            System.out.println("");
            switch (input) {
                case 1:
                    nhapM();
                    break;
                case 2:
                    mrd();
                    break;
                case 3:
                    out();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    chen();
                    break;
                case 6:
                    ptam();
                    break;
                case 7:
                    ptaml();
                    break;
                case 8:
                    ptd();
                    break;
                case 9:
                    ptdb();
                    break;
                case 10:
                    chia35();
                    break;
                case 11:
                    scc();
                    break;
                case 12:
                    sll();
                    break;
                case 13:
                    dvt();
                    break;
                case 14:
                    ptx();
                    break;
                case 15:
                    demx();
                    break;
                case 16:
                    nhx();
                    break;
                case 17:
                    dsnt();
                    break;
                case 18:
                    shtm();
                    break;
                case 19:
                    dchia35();
                    break;
                case 20:
                    tcd();
                    break;
                case 21:
                    tct();
                    break;
                case 22:
                    tchia35();
                    break;
                case 23:
                    tshtm();
                    break;
                case 24:
                    tbl();
                    break;
                case 25:
                    tbx();
                    break;
                case 26:
                    tsnt();
                    break;
                case 27:
                    gsc();
                    break;
                case 28:
                    cx();
                    break;
                case 29:
                    csnt();
                    break;
                case 30:
                    csc();
                    break;
                

            }
            System.out.println("");
        } while (input != 0);

    }

    public static void main(String[] args) {

        Menu();
//        BÀI TẬP CSLT : 78 đến 86 ; 89 đến 93 ;
//        99 đến 105 ; 107 và 109 ; 115 đến 117 ..!

    }
}
