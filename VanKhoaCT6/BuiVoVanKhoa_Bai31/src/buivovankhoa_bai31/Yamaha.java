/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FPTSHOP
 */
public class Yamaha {

    ArrayList<MyMotor> mang = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void Menu() {
        int chon;

        do {
            System.out.println("1 - Nhap Exiter");
            System.out.println("2 - Nhap Sirius");
            System.out.println("3 - Hien Thi Exiter");
            System.out.println("4 - Hien thi Sirius");
            System.out.println("5 - Tim Kiem Exiter");
            System.out.println("6 - Tim kiem Sirius");
            System.out.println("7 - Thoat chuong trinh");
            System.out.println("Moi ban chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Exciter e = new Exciter();
                    String code_tam;
                    boolean flag;
                    sc.nextLine();
                    do {
                        flag = false; // Chua sai
                        System.out.println("Nhap code: ");
                        code_tam = sc.nextLine();
                        if (code_tam.length() < 4) {
                            flag = true; // Da sai
                            System.out.print("Toi thieu 4 ky tu..!");
                        }
                        if (flag == false) {
                            // Kiem tra khong trung
                            for (int i = 0; i < mang.size(); i++) {
                                if (mang.get(i).code.equalsIgnoreCase(code_tam)) {
                                    System.out.print("Code khong duoc trung..!");
                                    flag = true; // Da trung
                                    break;
                                }
                            }
                        }
                    } while (flag == true);
                    e.code = code_tam;
                    e.InputInfo();
                    mang.add(e);
                    break;
                case 2:
                    Sirius s = new Sirius();
                    String code_sirius_tam;
                    boolean flag_sirius;
                    do {
                        flag_sirius = false; // Chưa sai
                        sc.nextLine();
                        System.out.println("Nhap code: ");
                        code_sirius_tam = sc.nextLine();
                        if (code_sirius_tam.length() < 4) {
                            flag_sirius = true; // Đã sai
                            System.out.println("Sai! Vui long nhap lai.");
                        }
                        // Kiểm tra không trùng
                        for (int i = 0; i < mang.size(); i++) {
                            if (mang.get(i) instanceof Sirius) {
                                if (mang.get(i).code.equalsIgnoreCase(code_sirius_tam)) {
                                    System.out.println("Code không được trùng.");
                                    flag_sirius = true; // Đã trùng
                                }
                            }
                        }
                    } while (flag_sirius);
                    s.code = code_sirius_tam;
                    s.InputInfo();
                    mang.add(s);
                    break;

                case 3:
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Exciter) {
                            mang.get(i).DisplayInfo();
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Sirius) {
                            mang.get(i).DisplayInfo();
                        }
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Nhap code can tim: ");
                    String tam = sc.nextLine();
                    flag = false; // Chưa tìm thấy
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Exciter) {
                            if (mang.get(i).code.equalsIgnoreCase(tam)) {
                                mang.get(i).DisplayInfo();
                                flag = true; // Đã tìm thấy
                                break;
                            }
                        }
                    }
                    if (flag == false) {
                        System.out.println("Khong tim thay.");
                    }
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Nhap code can tim: ");
                    String temp = sc.nextLine();
                    flag = false; // Chưa tìm thấy
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Sirius) {
                            if (mang.get(i).code.equalsIgnoreCase(temp)) {
                                mang.get(i).DisplayInfo();
                                flag = true; // Đã tìm thấy
                                break;
                            }
                        }
                    }
                    if (flag == false) {
                        System.out.println("Khong tim thay.");
                    }
                    break;
                case 7:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    System.exit(0);
                    break;

            }
        } while (chon != 0);
    }
}
