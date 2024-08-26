/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ddngay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author FPTSHOP
 */
public class DDNgay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat DinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");

        DinhDangNgay.setLenient(false);
        Date ngayDate1 = null, ngayDate2 = null;

        try {
            String ngayString1 = "30/2/2024";
            // Chuyển String qua Date 
            ngayDate1 = DinhDangNgay.parse(ngayString1);
        } catch (ParseException ex) {
            System.out.println("Loi");
        }

        try {
            String ngayString2 = "01/03/2024";
            // Chuyển String qua Date
            ngayDate2 = DinhDangNgay.parse(ngayString2);
        } catch (ParseException ex) {
            ex.getMessage();
        }

        if (ngayDate1.before(ngayDate2)) {
            System.out.println("Ngay 1 < Ngay 2");
        } else {
            if (ngayDate1.equals(ngayDate2)) {
                System.out.println("Ngay 1 = Ngay 2");
            } else {
                System.out.println("Ngay 1 > Ngay 2");
            }
        }
    }
}
