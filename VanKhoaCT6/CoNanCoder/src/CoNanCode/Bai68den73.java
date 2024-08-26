
import java.util.*;

public class Bai68den73 {

    static Scanner so = new Scanner(System.in);

    public static int nhapN() {
        int x = 0;
        do {
            try {
                x = so.nextInt();
                if (x <= 0) {
                    System.out.println("Ban phai nhap so lon hon 0 ..!");
                }
            } catch (Exception e) {
                System.out.println("Ban phai nhap so ..!");
                so.nextLine();
            }
        } while (x < 0);
        return x;
    }
// Tìm phần tử âm
    public static void nhapPTMang(int mang[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + ": ");
            mang[i] = so.nextInt();
        }
    }

    public static void xuatGTAm(int mang[], int n) {
        for (int x : mang) {
            if (x < 0) {
                System.out.println("Cac phan tu am cua mang la : " + x);
            }
        }
    }
// Tìm số lẻ
    public static void xuatPTLe(int mang[], int n) {
        for (int x : mang) {
            if (x % 2 != 0 && x > 0) {
                System.out.println("Cac phan tu le cua mang la : " + x);
            }
        }
    }
// Tìm số chẵn nhỏ hơn 20
    public static void xuatPTChan(int mang[], int n) {
        for (int x : mang) {
            if (x % 2 == 0 && x < 20) {
                System.out.println("Cac phan tu chan cua mang nho hon 20 la : " + x);
            }
        }
    }
// Số nguyên tố
    public static boolean isNT(int number) {
        int dem = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNT(int mang[], int n) {
        for (int i = 0; i < n; i++) {
            if (isNT(mang[i]) == true) {
                System.out.println("Cac so nguyen to la : " + mang[i]);
            }
        }
    }
// Số chính phương
    public static boolean isCP(int so) {
        int z = (int) Math.sqrt(so);
        int kq = z * z;
        if (kq == so) {
            return true;
        } else {
            return false;
        }
    }

    public static void printCP(int mang[], int n) {
        for (int i = 0; i < n; i++) {
            if (isCP(mang[i]) == true && i % 2 != 0) {
                System.out.println("Cac so chinh phuong la : " + mang[i]);
            }
        }
    }
// phần tử cần tìm
    public static void phantuCC(int mang[], int n) {
        int vtcc = 0;
        System.out.println("Nhap gia tri can tim : ");
        int gt = so.nextInt();
        for (int i = n - 1; i > 0; i--) {
            if (mang[i] == gt) {
                vtcc = i;
                System.out.println("Gia tri phan tu can tim la : " + vtcc);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so luong phan tu cua mang : ");
        n = nhapN();
        int mang[] = new int[n];
        nhapPTMang(mang, n);
        xuatGTAm(mang, n);
        xuatPTLe(mang, n);
        xuatPTChan(mang, n);
        printNT(mang, n);
        printCP(mang, n);
        phantuCC(mang, n);
    }
}
