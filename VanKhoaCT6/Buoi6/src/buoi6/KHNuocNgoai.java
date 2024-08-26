/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

/**
 *
 * @author FPTSHOP
 */
public class KHNuocNgoai extends KhachHang{
    private String Quoctich;

    public String getQuoctich() {
        return Quoctich;
    }

    public void setQuoctich(String Quoctich) {
        this.Quoctich = Quoctich;
    }
    
    protected double Thanhtien(){
        return Soluong * Dongia;
    }
    protected void Nhap(){
        super.Nhap();
        System.out.println("Nhap quoc tich : ");
        setQuoctich(kb.nextLine());
    }
    protected void Xuat(){
        super.Xuat();
        System.out.println(getQuoctich()+" - "+Thanhtien());
    }
}