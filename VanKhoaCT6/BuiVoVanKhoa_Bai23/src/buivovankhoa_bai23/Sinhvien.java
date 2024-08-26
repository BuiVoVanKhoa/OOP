/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai23;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class Sinhvien {

    protected int MaSV;
    protected String TenSV;
    Scanner kb = new Scanner(System.in);
    
    public Sinhvien() {
    }
    
    public Sinhvien(int MaSV, String TenSV) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
    }
    
    public int getMaSV() {
        return MaSV;
    }
    
    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }
    
    public String getTenSV() {
        return TenSV;
    }
    
    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    protected void setSV() {
        boolean flag;
        do {
            flag = false;
            try {
                System.out.println("Nhap ma sinh vien : ");
                setMaSV(kb.nextInt());
            } catch (Exception loi) {
                System.out.println("Vui long nhap so..!");
                flag = true;
                kb.nextLine();
            }
//            }catch (InputMismatchException loi1){
//                if (getMaSV() <= 0) {
//                    System.out.println("Vui long khong nhap so nho hon 0..!");
//                }
//            }
        } while (flag == true);
        kb.nextLine();
        System.out.println("Nhap ho ten sinh vien : ");
        setTenSV(kb.nextLine());
    }
    protected void viewSV(){
        System.out.println(getMaSV()+" - "+getTenSV()+" - ");
    }
}
