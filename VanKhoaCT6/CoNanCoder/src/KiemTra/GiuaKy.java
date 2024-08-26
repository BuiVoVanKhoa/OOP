
import java.util.*;

public class GiuaKy {

    static int n;
    static Scanner so = new Scanner(System.in);
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

    public static void nhapPTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = so.nextInt();
        }
    }

    public static void xuatPTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println(mang[i]);
        }
    }

    public static void soNT() {
        System.out.println("Cac phan tu la so nguyen to trong mang la : ");
        for (int x : mang) {
            if (x != 1) {
                boolean flag = true;
                for (int i = 2; i < x; i++) {
                    if (x % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(x + " ");
                }
            }
        }
    }

    public static void tongNT() {
        double tong = 0;
        for (int x : mang) {
            if (x != 1) {
                boolean flag = true;
                for (int i = 2; i < x; i++) {
                    if (x % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    tong += x;
                }
            }
        }
        System.out.println("Tong cac phan tu khong phai la so nguyen to la : " + tong);
    }

    public static void giamSNT() {
        for (int x : mang) {
            if (x != 1) {
                boolean flag = true;
                for (int i = 2; i < x; i++) {
                    if (x % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    for (int i = 0; i < n - 1; i++) {
                        if (i % 2 != 0) {
                            for (int j = i + 1; j < n; j++) {
                                int temp = mang[i];
                                mang[i] = mang[j];
                                mang[j] = mang[i];
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Sap xep giam dan cac phan tu khong phai la so nguyen to tai vi tri le la : ");
        xuatPTMang();
    }

    public static void Menu() {
        System.out.println("1. Nhap so luong phan tu cua mang");
        System.out.println("2. Nhap gia tri cho cac phan tu cua mang");
        System.out.println("3. Xuat cac phan tu la so nguyen to");
        System.out.println("4. Tong cac phan tu khong phai la so nguyen to");
        System.out.println("5. Sap xep giam dan cac phan tu khong phai la so nguyen to tai vi tri le");
        System.out.println("0. Thoat");
    }

    public static void main(String[] args) {
        int chon = 0;
        do {
            Menu();
            System.out.println("Moi ban chon : ");
            chon = so.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhap so luong phan tu cua mang : ");
                    n = nhapN();
                    break;
                case 2:
                    nhapPTMang();
                    break;
                case 3:
                    soNT();
                    break;
                case 4:
                    tongNT();
                    break;
                case 5:
                    giamSNT();
                    break;
            }
        } while (chon != 0);
    }
}
