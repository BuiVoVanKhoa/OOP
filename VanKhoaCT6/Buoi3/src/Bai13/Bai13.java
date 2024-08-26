/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai13;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Bai13 {

    static Scanner kb = new Scanner(System.in);

    /**
     * @param args the command li6ne arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tạo đối tượng
        // Tên_lớp Tên_đối_tượng;
        SinhVien sv1;
        System.out.println("Nhap Ma So : ");
        int a = kb.nextInt();
        System.out.println("Nhap Diem Ly Thuyet : ");
        double b = kb.nextDouble();
        System.out.println("Nhap Diem Thuc Hanh : ");
        double c = kb.nextDouble();
        // Khởi tạo đối tượng
        // Tên_đối_tượng = new Tên_lớp();
        // Tên_đối_tượng = new Tên_lớp (các tham số);
        sv1 = new SinhVien(a, "Bui Vo Van Khoa", b, c);
        // Gọi phương thức
        // Tên_đối_tượng.Tên_phương_thức;
        sv1.Xuat();

        SinhVien sv2;
        System.out.println("Nhap Ma So : ");
        a = kb.nextInt();
        kb.nextLine(); // Giải quyết vấn đề về nút Enter
        System.out.println("Nhap Ho va Ten : ");
        String d = kb.nextLine();
        sv2 = new SinhVien(a, d, 10, 8);
        sv2.Xuat();

        SinhVien sv3;
        sv3 = new SinhVien();
        System.out.println("Nhap Ma So : ");
        sv3.setMaSo(kb.nextInt());
        kb.nextLine(); // Giải quyết vấn đề về nút Enter
        System.out.println("Nhap Ho va Ten : ");
        sv3.setHoTen(kb.nextLine());
        System.out.println("Nhap Diem Ly Thuyet : ");
        sv3.setDiemLT(kb.nextDouble());
        System.out.println("Nhap Diem Thuc Hanh : ");
        sv3.setDiemTH(kb.nextDouble());
        sv3.Xuat();

        System.out.println("MSSV\t\t\t\tHo Ten\t\t\tDiem LT\t\tDiem TH\t\tDiem TB");
        System.out.println(sv1.getMaSo() + "\t\t\t" + sv1.getHoTen() + "\t\t" + sv1.getDiemLT() + "\t\t" + sv1.getDiemTH() + "\t\t" + sv1.TinhDTB());
        System.out.println(sv2.getMaSo() + "\t\t\t" + sv2.getHoTen() + "\t\t" + sv2.getDiemLT() + "\t\t" + sv2.getDiemTH() + "\t\t" + sv2.TinhDTB());
        System.out.println(sv3.getMaSo() + "\t\t\t" + sv3.getHoTen() + "\t\t" + sv3.getDiemLT() + "\t\t" + sv3.getDiemTH() + "\t\t" + sv3.TinhDTB());
    }

}
