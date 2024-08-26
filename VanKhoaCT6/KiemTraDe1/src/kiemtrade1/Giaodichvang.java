/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade1;

/**
 *
 * @author FPTSHOP
 */
public class Giaodichvang extends Giaodich{
    private String Loaivang;
    public Giaodichvang(){
        
    }

    public String getLoaivang() {
        return Loaivang;
    }

    public void setLoaivang(String Loaivang) {
        this.Loaivang = Loaivang;
    }
    protected double ThanhTien(){
        return Dongia * Soluong;
    }
    protected void Nhap(){
        super.Nhap();
        kb.nextLine();
        System.out.println("Nhap loai vang : ");
        setLoaivang(kb.nextLine());
    }
    protected void Xuat(){
        super.Xuat();
        System.out.println(getLoaivang()+" - "+ThanhTien());
    }
}
