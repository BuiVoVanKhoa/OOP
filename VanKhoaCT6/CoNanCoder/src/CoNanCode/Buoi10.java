
import java.util.*;

public class Buoi10 {

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

    public static void Menu() {
        System.out.println("1. Nhap so luong phan tu cua mang");
        System.out.println("2. Nhap gia tri phan tu cua mang");
        System.out.println("3. Xuat mang");
        System.out.println("4. Mang sap xep thu tu giam dan");
        System.out.println("0. Thoat");
    }

    public static void nhapGTMang() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1) + " : ");
            mang[i] = so.nextInt();
        }
    }

    public static void xuatMang() {
        for (int i = 0; i < n; i++) {
            System.out.println("Cac gia tri phan tu cua mang la : " + mang[i]);
        }
    }

    public static void sapXepGD() {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] < mang[j]) {
                    temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
                System.out.println("Mang theo thu tu giam dan : " + mang[i]);
            }
        }
    }
    public static int [] chenPTTaiVT (int vtchen, int gtchen){
        int newmang[] =new int [n+1];
        for (int i = 0; i < n+1; i++){
            if(i < vtchen){
                newmang[i] = mang[i]; 
            }
            else if (i > vtchen){
                newmang[i] = mang[i-1];
            }
            else {
                newmang[i] = gtchen;
            }
        }
        return newmang;
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
                    System.out.println("XUAT CAC PHAN TU TRONG MANG");
                    xuatMang();
                    break;
                case 4:
                    System.out.println("MANG THEO THU TU GIAM DAN");
                    sapXepGD();
                    break;
                case 5:
                    System.out.println("CHEN PHAN TU TAI VI TRI");
                    chenPTTaiVT(2, 7);
                    break;
            }
        } while (chon != 0);
    }
}
