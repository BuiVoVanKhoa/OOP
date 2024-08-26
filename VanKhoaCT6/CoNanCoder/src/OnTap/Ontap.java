package OnTap;

import java.util.*;

public class Ontap {

    static Scanner so = new Scanner(System.in);
    static int n;
    static final int MAX = 100;
    static int mang[] = new int[MAX];
// Bảng chọn Menu

    public static void Menu() {
        System.out.println("1. Nhap so luong phan tu cua mang");
        System.out.println("2. Nhap gia tri cho tung phan tu cua mang");
        System.out.println("3. Liet ke cac phan tu la so nguyen to");
        System.out.println("4. Tinh tong cac phan tu khong phai la so nguyen to");
        System.out.println("5. Sap xep giam dan cac phan tu khong phai la so nguyen to o vi tri le");
        System.out.println("6. Xoa cac phan tu khong la so nguyen to");
        System.out.println("0. Thoat");
    }
    // Các lựa chọn 

    public static void main(String[] args) {
        int chon = 0;
        Menu();
        do {
            System.out.println("Moi ban chon : ");
            chon = so.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhap so luong phan tu cua mang : ");
                    n = nhapN();
                    break;
                case 2:
                    nhapGT();
                    break;
                case 3:
                    nguyenTo();
                    break;
                case 4:
                    tongNT();
                    break;
                case 5:
// Mấy ông hỏi bạn chứ câu này 
                    break;
                case 6:
// Mấy ông hỏi bạn chứ câu này 
                    break;
            }
        } while (chon != 0);
    }
// Nhập số lượng phần tử của mảng

    public static int nhapN() {
        int x = 0;
        boolean flag = true;
        do {
            try {
                x = so.nextInt();
                if (x <= 0 || x > MAX) {
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
// Nhập giá trị cho từng phần tử

    public static void nhapGT() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = so.nextInt();
        }
    }
// Liệt kê các phần từ là số nguyên tố trong mảng

    public static void nguyenTo() {
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
                    System.out.println("Cac phan tu la so nguyen to trong mang la : " + x);
                }
            }
        }
    }
// Tính tổng các phần tử không phải là số nguyên tố

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
}
