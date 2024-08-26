/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade2;

/**
 *
 * @author FPTSHOP
 */
public class XeOToKhach extends Xe {

    private int Socho;

    public XeOToKhach() {

    }
    
    public int getSocho() {
        return Socho;
    }

    public void setSocho(int Socho) {
        this.Socho = Socho;
    }

    protected double TinhThue(){
        if (Socho >= 5){
            return (30/100 + VAT)*Dongia;
        } else {
            return (50/100 + VAT)*Dongia;
        }
    }
    protected void Nhap(){
        super.Nhap();
        System.out.println("Nhap so cho : ");
        setSocho(kb.nextInt());
    }
    protected void Xuat(){
        super.Xuat();
        System.out.println(getSocho()+" - "+TinhThue());
    }
}
