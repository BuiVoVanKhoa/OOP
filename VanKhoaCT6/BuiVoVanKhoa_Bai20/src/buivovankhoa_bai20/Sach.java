/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Sach {

    protected String Masach, Ngaynhap, NXB, ThangNam;
    protected int Soluong;
    protected double Dongia;
    Scanner kb = new Scanner(System.in);

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    boolean flag;

    protected void Nhap() throws ParseException {
        // Mã sách 
        System.out.println("Nhap ma sach: ");
        Masach = kb.nextLine();
        // Ngày nhập
            SimpleDateFormat DinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");

            DinhDangNgay.setLenient(false);
        do {
            flag = false;
            System.out.println("Nhap ngay nhap: ");
            Ngaynhap = kb.nextLine();
            Date ngayDate1 = null, ngayDate2 = null;

            try {
                String ngayString1 = "30/2/2024";
                // Chuyển String qua Date 
                ngayDate1 = DinhDangNgay.parse(Ngaynhap);
            } catch (ParseException ex) {
                System.out.println("Ngay khong hop le. Vui long nhap lai..!");
                flag = true;
            }

            try {
                String ngayString2 = "01/03/2024";
                // Chuyển String qua Date
                ngayDate2 = DinhDangNgay.parse(Ngaynhap);
            } catch (ParseException ex) {
                ex.getMessage();
            }

//            if (ngayDate1.before(ngayDate2)) {
//                System.out.println("Ngay 1 < Ngay 2");
//            } else {
//                if (ngayDate1.equals(ngayDate2)) {
//                    System.out.println("Ngay 1 = Ngay 2");
//                } else {
//                    System.out.println("Ngay 1 > Ngay 2");
//                }
//            }
        } while (flag == true);
        
            // Chuyển đổi chuỗi thành đối tượng Date
            Date date = DinhDangNgay.parse(Ngaynhap);

            // Xóa phần ngày bằng cách đặt ngày là 1
            date.setDate(1);

            // Format lại đối tượng Date thành chuỗi chỉ chứa tháng và năm
            SimpleDateFormat monthYearFormat = new SimpleDateFormat("MM/yyyy");
            String monthYearStr = monthYearFormat.format(date);
            ThangNam = monthYearStr;
        
        // Đơn giá
        do {
            flag = false; // Chưa sai
            try {
                System.out.println("Nhap don gia: ");
                Dongia = kb.nextDouble();
                if (Dongia <= 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                kb.nextLine();
                flag = true; // Đã sai
                System.out.println("Don gia phai la so thuc lon hon 0..!");
            }
        } while (flag == true);
        // Số lượng
        do {
            flag = false; // Chưa sai
            try {
                System.out.println("Nhap so luong: ");
                Soluong = kb.nextInt();
                if (Soluong < 0) {
                    throw new Exception();
                }
            } catch (Exception loi1) {
                kb.nextLine();
                flag = true; // Đã sai
                System.out.println("So luong phai la so duong..!");
            }
        } while (flag == true);
        kb.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        NXB = kb.nextLine();
    }

    protected void Xuat() {
        System.out.print(Masach + " - " + Ngaynhap + " - " + Dongia + " - " + Soluong + " - " + NXB + " - ");
    }

    protected double ThanhTien() {
        return 0;
    }

    void remove() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
