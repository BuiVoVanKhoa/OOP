/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplamthem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class QuanLyXe {

    ArrayList<Xe> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("1. Nhap cac loai xe");
            System.out.println("2. Xuat xe may");
            System.out.println("3. Xuat xe may co cong suat lon hon 100");
            System.out.println("4. Sap xep xe o to giam dan theo hang san xuat");
            System.out.println("5. Ket thuc chuong trinh");
            System.out.println("Moi ban chon: ");
            chon = kb.nextInt();
            switch (chon) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    boolean flag = false;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof XeMay) {
                            mang.get(i).Xuat();
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println("Khong tim thay.!");
                    }
                    break;
                case 3:
                    XeMay xm = new XeMay();
                    flag = false;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof XeMay && xm.getCongsuat() > 100) {
                            mang.get(i).Xuat();
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println("Khong tim thay.!");
                    }
                    break;
                case 4:
                    for (int i = 0; i < mang.size() - 1; i++) {
                        for (int j = i + 1; j < mang.size(); j++) {
                            if (mang.get(i).getHangSX().compareToIgnoreCase(mang.get(j).getHangSX()) < 0 && (mang.get(i) instanceof OTo && mang.get(j) instanceof OTo)) {
                                Xe hsx = new Xe();
                                hsx = mang.get(i);
                                mang.set(i, mang.get(j));
                                mang.set(j, hsx);
                            }
                        }
                    }
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof OTo) {
                            mang.get(i).Xuat();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Cam on ban da su dung chuong trinh..!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai.!");
            }
        } while (chon != 5);
    }

    void Nhap() {
        int chon;
        boolean flag;
        do {
            flag = false;
            System.out.println("1. O To");
            System.out.println("2. Xe Tai");
            System.out.println("3. Xe May");
            System.out.println("Moi ban chon: ");
            chon = kb.nextInt();
            kb.nextLine();
            switch (chon) {
                case 1:
                    Xe xe = new OTo(); //Down -casting
                    Nhapthongtinchung(xe);
                    OTo tam = (OTo) xe;
                    // Nhập chỗ ngồi
                    do {
                        flag = false;
                        try {
                            System.out.println("Nhap so cho ngoi: ");
                            tam.setSoChoNgoi(kb.nextInt());
                            kb.nextLine();
                            if (tam.getSoChoNgoi() < 0) {
                                throw new Exception();
                            }
                        } catch (Exception loi) {
                            System.out.println("So cho ngoi phai la so nguyen.!");
                            flag = true;
                            kb.nextLine();
                        }
                    } while (flag == true);
                    // Nhập kiểu động cơ
                    do {
                        flag = false;
                        System.out.println("Nhap kieu dong co: ");
                        tam.setKieudongco(kb.nextLine());
                        if (tam.getKieudongco().length() == 0) {
                            System.out.println("Kieu dong co khong duoc de trong.!");
                            flag = true;
                        }
                    } while (flag == true);
                    mang.add(xe);
                    break;
                case 2:
                    xe = new XeTai();
                    Nhapthongtinchung(xe);
                    XeTai tam1 = (XeTai) xe;
                    // Nhập trọng tải
                    do {
                        flag = false;
                        try {
                            System.out.println("Nhap trong tai: ");
                            tam1.setTrongtai(kb.nextDouble());
                            if (tam1.getTrongtai() < 0) {
                                throw new Exception();
                            }
                        } catch (Exception loi) {
                            System.out.println("Trong tai phai la so thuc.!");
                            flag = true;
                        }
                    } while (flag == true);
                    mang.add(xe);
                    break;
                case 3:
                    xe = new XeMay();
                    Nhapthongtinchung(xe);
                    // Nhập công suất
                    XeMay tam2 = (XeMay) xe;
                    do {
                        flag = false;
                        try {
                            System.out.println("Nhap cong suat: ");
                            tam2.setCongsuat(kb.nextDouble());
                            if (tam2.getCongsuat() < 0) {
                                throw new Exception();
                            }
                        } catch (Exception loi) {
                            System.out.println("Cong suat phai la so thuc.!");
                            flag = true;
                        }
                    } while (flag == true);
                    mang.add(xe);
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai.!");
                    flag = true;
            }
        } while (flag == true);
    }

    void Nhapthongtinchung(Xe xe) {
        boolean flag;
        // Nhập ID
        String tam_ID;
        do {
            flag = false;
            System.out.println("Nhap ID: ");
            tam_ID = kb.nextLine();
            if (tam_ID.length() == 0) {
                System.out.println("ID khong duoc de trong.!");
                flag = true;
            }
            for (int i = 0; i < mang.size(); i++) {
                if (mang.get(i).getID().equalsIgnoreCase(tam_ID)) {
                    System.out.println("ID khong duoc trung.!");
                    flag = true;
                }
            }
        } while (flag == true);
        xe.setID(tam_ID);
        // Nhập hãng sản xuất
        do {
            flag = false;
            System.out.println("Nhap hang san xuat: ");
            xe.setHangSX(kb.nextLine());
            if (xe.getHangSX().length() == 0) {
                System.out.println("Hang san xuat khong duoc de trong.!");
                flag = true;
            }
        } while (flag == true);
        // Nhập năm sản xuất
        do {
            flag = false;
            System.out.println("Nhap nam san xuat: ");
            xe.setNamSX(kb.nextLine());
            SimpleDateFormat DinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");

            DinhDangNgay.setLenient(false);
            Date ngayDate1 = null, ngayDate2 = null;

            try {
                String ngayString1 = "30/2/2024";
                // Chuyển String qua Date 
                ngayDate1 = DinhDangNgay.parse(xe.getNamSX());
            } catch (ParseException ex) {
                System.out.println("Nam khong hop le. Vui long nhap lai.!");
                flag = true;
            }

            try {
                String ngayString2 = "01/03/2024";
                // Chuyển String qua Date
                ngayDate2 = DinhDangNgay.parse(xe.getNamSX());
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
        // Nhập màu xe
        do {
            flag = false;
            System.out.println("Nhap mau xe: ");
            xe.setMauxe(kb.nextLine());
            if (xe.getMauxe().length() == 0) {
                System.out.println("Mau xe khong duoc de trong.!");
                flag = true;
            }
        } while (flag == true);
        // Nhập giá bán
        do {
            flag = false;
            try {
                System.out.println("Nhap gia ban: ");
                xe.setGiaban(kb.nextDouble());
                if (xe.getGiaban() < 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                System.out.println("Gia ban phai la so thuc.!");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
    }
}
