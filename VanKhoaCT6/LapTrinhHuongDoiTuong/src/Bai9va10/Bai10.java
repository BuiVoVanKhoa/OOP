package Bai9va10;
import java.util.*;
public class Bai10{
    static Scanner so = new Scanner (System.in);
    public static void main(String[] args) {
        // Khai báo đối tượng
        // Tên lớp  Tên_đối_tượng
        PTBH pt2;
        System.out.println("Nhap gia tri cho a : ");
        double so1 = so.nextDouble();
        System.out.println("Nhap gia tri cho b : ");
        double so2 = so.nextDouble();
        System.out.println("Nhap gia tri cho c : ");
        double so3 = so.nextDouble();
        // Khởi tạo đối tượng
        // Tên_đối_tượng = new Tên lớp();
        pt2 = new PTBH(so1,so2,so3);
        // Truy cập phương thức / thuộc tính của lớp
        // Tên_đối_tượng.Tên_phương_thức;
        pt2.giaiPTBH();
    }
}