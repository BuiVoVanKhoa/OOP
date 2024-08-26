/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade2;
import java.util.*;
/**
 *
 * @author FPTSHOP
 */
public class Xe {
    protected String Bansoxe, Mauxe;
    protected int Dungtichxe;
    protected double Dongia, VAT = 10/100;
    Scanner kb = new Scanner (System.in);
    public Xe(){
        
    }
    public Xe (String Bansoxe, String Mauxe, int Dungtichxe,double Dongia, double VAT){
        this.Bansoxe = Bansoxe;
        this.Mauxe = Mauxe;
        this.Dungtichxe = Dungtichxe;
        this.VAT = VAT;
        this.Dongia = Dongia;
    }

    public String getBansoxe() {
        return Bansoxe;
    }

    public void setBansoxe(String Bansoxe) {
        this.Bansoxe = Bansoxe;
    }

    public String getMauxe() {
        return Mauxe;
    }

    public void setMauxe(String Mauxe) {
        this.Mauxe = Mauxe;
    }

    public int getDungtichxe() {
        return Dungtichxe;
    }

    public void setDungtichxe(int Dungtichxe) {
        this.Dungtichxe = Dungtichxe;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }
    
    protected double TinhThue(){
        return 0;
    }
    protected void Nhap(){
        System.out.println("Nhap bien so xe : ");    
        setBansoxe(kb.nextLine());
        System.out.println("Nhap mau xe : ");
        setMauxe(kb.nextLine());
        System.out.println("Nhap dung tich xe : ");
        setDungtichxe(kb.nextInt());
        System.out.println("Nhap don gia : ");
        setDongia(kb.nextDouble());
    }
    protected void Xuat(){
        System.out.print(getBansoxe()+" - "+getMauxe()+" - "+getDungtichxe()+" - "+getDongia()+" - ");
    }
}
