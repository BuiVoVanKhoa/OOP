/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai20;

import java.text.ParseException;
import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class QuanlySach {

    ArrayList<Sach> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() throws ParseException {
        int chon;
        do {
            System.out.println("1. Nhap danh sach cac loai sach");
            System.out.println("2. Xuat danh sach cac loai sach");
            System.out.println("3. Xuat danh sach sach giao khoa");
            System.out.println("4. Xuat danh sach sach giao khoa co tinh trang la moi");
            System.out.println("5. Tinh tong thanh tien cho tung loai");
            System.out.println("6. Tinh trung binh cong don gia cua cac sach tham khao");
            System.out.println("7. Xuat ra cac sach giao khoa cua nha xuat ban");
            System.out.println("8. Xoa sach giao khoa co ngay nhap 9/2013");
            System.out.println("9. Thoat khoi chuong trinh");
            System.out.println("Moi ban chon: ");
            chon = kb.nextInt();
            switch (chon) {
                case 1:
                    int luachonsach;
                    System.out.println("1. Sach Giao Khoa");
                    System.out.println("2. Sach Tham Khao");
                    System.out.println("Vui long chon sach: ");
                    luachonsach = kb.nextInt();
                    switch (luachonsach) {
                        case 1:
                            SachGiaoKhoa gk = new SachGiaoKhoa();
                            gk.Nhap();
                            mang.add(gk);
                            break;
                        case 2:
                            SachThamKhao tk = new SachThamKhao();
                            tk.Nhap();
                            mang.add(tk);
                        default:
                            System.out.println("Nhap sai. Vui long nhap lai..!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < mang.size(); i++) {
                        mang.get(i).Xuat();
                    }
                    break;
                case 3:
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof SachGiaoKhoa) {
                            mang.get(i).Xuat();
                        }
                    }
                    break;
                case 4:
                    boolean flag = false;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof SachGiaoKhoa) {
                            SachGiaoKhoa tam = (SachGiaoKhoa) mang.get(i);
                            if (tam.getTinhtrang().equalsIgnoreCase("moi")) {
                                mang.get(i).Xuat();
                                flag = true;
                            }
                        }
                    }
                    if (flag == false) {
                        System.out.println("Khong co sach giao khoa moi");
                    }
                    break;
                case 5:
                    double TongSGK = 0,
                     TongSTK = 0;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof SachGiaoKhoa) {
                            TongSGK += mang.get(i).ThanhTien();
                        } else {
                            TongSTK += mang.get(i).ThanhTien();
                        }
                    }
                    System.out.println("Tong thanh tien Sach Giao Khoa: " + TongSGK);
                    System.out.println("Tong thanh tien Sach Tham Khao: " + TongSTK);
                    break;
                case 6:
                    double TBDGSTK = 0,
                     count = 0;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof SachThamKhao) {
                            count++;
                            TBDGSTK = mang.get(i).Dongia / count;
                        }
                    }
                    System.out.println("Trung binh cong don gia cua cac Sach Tham Khao: " + TBDGSTK);
                    break;
                case 7:
                    flag = false;
                    String nhaxuatban;
                    kb.nextLine();
                    System.out.println("Nhap nha xuat ban: ");
                    nhaxuatban = kb.nextLine();
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof SachGiaoKhoa && mang.get(i).NXB.equalsIgnoreCase(nhaxuatban)) {
                            mang.get(i).Xuat();
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println("Khong co Sach Giao Khoa cua nha xuat ban " + nhaxuatban);
                    }
                    break;
                case 8:
                    do{
                        flag = false;
                        for(int i = 0; i < mang.size(); i++){
                            if(mang.get(i) instanceof SachGiaoKhoa){
                                if(mang.get(i).ThangNam.equals("09/2013")){
                                    mang.get(i).remove();
                                }
                            }
                        }
                    }while(flag == true);
                    for(int i = 0; i < mang.size(); i++){
                        if(mang.get(i) instanceof SachGiaoKhoa){
                            mang.get(i).Xuat();
                        }
                    }
                    break;
                case 9:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai..!");
            }

        } while (chon != 8);
    }

//    void NhapMaSach(Sach s) {
//        boolean flag;
//        // Nhập mã sách
//        String tam_Masach;
//        do {
//            flag = false;
//            kb.nextLine();
//            System.out.println("Nhap ma sach: ");
//            tam_Masach = kb.nextLine();
//            // Kiểm tra trống
//            if (tam_Masach.length() == 0) {
//                System.out.println("Ma sach khong duoc de trong..!");
//                flag = true;
//            }
//            // Kiểm tra trùng
//            for (int i = 0; i < mang.size(); i++) {
//                if (mang.get(i).getMasach().equalsIgnoreCase(tam_Masach)) {
//                    System.out.println("Ma sach khong duoc trung..!");
//                    flag = true;
//                }
//            }
//        } while (flag == true);
//        s.setMasach(tam_Masach);
//    }
}
