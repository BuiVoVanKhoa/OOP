package Bai9va10;

import java.util.*;

public class Bai9 {

    static Scanner so = new Scanner(System.in);

    public static void main(String[] args) {
        // Khai báo đối tượng
        // Tên_lớp     Tên_đối_tượng;
        PTBN pt1;
        System.out.println("Nhap gia tri a : ");
        double so1 = so.nextDouble();
        System.out.println("Nhap gia tri b : ");
        double so2 = so.nextDouble();
        // Khởi tạo đối tượng
        // Tên_đối_tượng = new Tên_lớp();
        pt1 = new PTBN(so1, so2);
        // Truy cập phương thức / thuộc tính của lớp
        // Tên_đối_tượng.Tên_phương_thức;
        pt1.giaiPTBN();
    }
}
