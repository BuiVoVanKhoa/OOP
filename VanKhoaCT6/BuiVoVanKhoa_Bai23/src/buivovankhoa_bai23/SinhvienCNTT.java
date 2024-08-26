/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai23;

/**
 *
 * @author FPTSHOP
 */
public class SinhvienCNTT extends Sinhvien {

    private double dtoan, dtin;
    
    public double getDtoan() {
        return dtoan;
    }
    
    public void setDtoan(double dtoan) {
        this.dtoan = dtoan;
    }
    
    public double getDtin() {
        return dtin;
    }
    
    public void setDtin(double dtin) {
        this.dtin = dtin;
    }

    protected void setSVCNTT() {
        super.setSV();
        boolean flag;
        do {
            flag = false;
            try{
            System.out.println("Nhap diem toan : ");
            setDtoan(kb.nextDouble());
            if(getDtoan() < 0 || getDtoan() > 10){
                throw new Exception("Vui long nhap diem la so duong tu 0 den 10..!");
            }
            }catch(Exception khoa){
                System.out.println("Diem phai la so thuc..!");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
        do {
            flag = false;
            try{
            System.out.println("Nhap diem tin : ");
            setDtoan(kb.nextDouble());
            if(getDtoan() < 0 || getDtoan() > 10){
                throw new Exception("Vui long nhap diem la so duong tu 0 den 10..!");
            }
            }catch(Exception khoa){
                System.out.println("Diem phai la so thuc..!");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
    }
    protected void viewSVCNTT(){
        super.viewSV();
        System.out.println(getDtoan()+" - "+getDtin());
    }
    protected double Tongdiem(){
        return getDtoan()+getDtin();
    }
}
