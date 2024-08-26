/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrade1;

/**
 *
 * @author FPTSHOP
 */
public class Giaodichtiente extends Giaodich{
    private double Tigia;
    private String Loaitiente;
    
    public Giaodichtiente(){
        
    }

    public double getTigia() {
        return Tigia;
    }

    public void setTigia(double Tigia) {
        this.Tigia = Tigia;
    }

    public String getLoaitiente() {
        return Loaitiente;
    }

    public void setLoaitiente(String Loaitiente) {
        this.Loaitiente = Loaitiente;
    }
    protected double ThanhTien(){
        if (Loaitiente.toUpperCase().contains("TIEN VIET NAM")){
            return Soluong * Dongia;
        } else {
            return Soluong * Dongia * Tigia;
        }
    }
    protected void Nhap(){
        super.Nhap();
        System.out.println("Cac loai tien te : ");
        System.out.println("1. Tien Viet Nam");
        System.out.println("2. Tien USD");
        System.out.println("3. Tien EURO");
        kb.nextLine();
        System.out.println("Nhap loai tien te : ");
        setLoaitiente(kb.nextLine());
        System.out.println("Nhap ti gia : ");
        setTigia(kb.nextDouble());
    }
    protected void Xuat(){
        super.Xuat();
        System.out.println(ThanhTien());
    }
}
