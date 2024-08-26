package KiemTra;

import java.util.*;

public class De2 {

    static Scanner so = new Scanner(System.in);
    static int n;
    static final int MAX = 100;
    static int mang[] = new int[MAX];
// Bảng chọn Menu

    public static void Menu() {
        System.out.println("1. Nhap so luong phan tu cua mang");
        System.out.println("2. Nhap gia tri phan tu cua mang");
        System.out.println("3. Dem cac so le chia het cho 5");
        System.out.println("4. Trung binh cac phan tu chan trong mang");
        System.out.println("5. Vi tri so hoan thien cuoi cung");
        System.out.println("6. Phan tu dau tien la so nguyen to trong mang");
        System.out.println("7. Tong cac so chinh phuong tai vi tri chan");
        System.out.println("8. So chan nho nhat lon hon moi gia tri trong mang");
        System.out.println("0. Thoat");
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
// Xuất các phần tử trong mảng 
    public static void xuatPT(){
        for (int i = 0; i < n; i++){
            System.out.println(mang[i]);
    }
    }
// Đếm các số lẻ chia hết cho 5

    public static void chiaHet5() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0 && mang[i] % 5 == 0) {
                count++;
            }
        }
        System.out.println("So le chia het cho 5 : " + count);
    }

    public static void tbChan() {
        int dem = 0, total = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                total += mang[i];
                dem++;
            }
        }
        int average = total / dem;
        System.out.println("Trung binh cac phan tu chan trong mang la : " + average);
    }
// Vị trí số hoàn thiện cuối cùng
    public static void vtSoHoanThien() {
        int tong = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (n % i == 0) {
                tong += i;
            }
            if (tong == n) {
                System.out.println("Vi tri so hoan thien cuoi cung la : " + i);
            }
        }
    }
// Phần tử đầu tiên là số nguyên tố trong mảng
        public static void nguyenTo() {
        for (int x : mang){
            if (x != 1){
                boolean flag = true;
                for (int i = 2; i < x; i++){
                    if (x % i == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.println("Phan tu dau tien la so nguyen to trong mang la : "+x);
                    break;
                }
            }
        }
    }
// Tổng các số chính phương tại vị trí chẵn 
        public static int chinhPhuongChan(){
            
            return 0;
        }
// Các lựa chọn 

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
                    nhapGT();
                    break;
                case 3:
                    System.out.println("DEM CAC SO LE CHIA HET CHO 5");
                    chiaHet5();
                    break;
                case 4:
                    System.out.println("TRUNG BINH CAC PHAN TU CHAN TRONG MANG");
                    tbChan();
                    break;
                case 5:
                    System.out.println("VI TRI SO HOAN THIEN CUOI CUNG");
                    vtSoHoanThien();
                    break;
                case 6:
                    System.out.println("PHAN TU DAU TIEN LA SO NGUYEN TO TRONG MANG");
                    nguyenTo();
                    break;
                case 7:
                    System.out.println("TONG CAC SO CHINH PHUONG TAI VI TRI CHAN");
                    chinhPhuongChan();
                    break;
                case 8:
                    System.out.println("SO CHAN NHO NHAT LON HON MOI GIA TRI TRONG MANG");
                    break;
            }
        } while (chon != 0);
    }
}
