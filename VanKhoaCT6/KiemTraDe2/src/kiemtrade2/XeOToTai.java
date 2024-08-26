/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade2;

/**
 *
 * @author FPTSHOP
 */
public class XeOToTai extends Xe {

    public XeOToTai() {

    }
    
    protected double TinhThue(){
        return (VAT + 2/100) * Dongia;
    }
    protected void Nhap(){
        super.Nhap();
    }
    protected void Xuat(){
        super.Xuat();
        System.out.println(TinhThue());
    }
}
