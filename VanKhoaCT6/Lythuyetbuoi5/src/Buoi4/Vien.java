package Buoi4;
import java.util.*;
public class Vien{
    protected String Hoten;
    protected int Namsinh;
    Scanner kb = new Scanner (System.in);
    public Vien(String Hoten, int Namsinh){
    this.Hoten = Hoten;
    this.Namsinh = Namsinh;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setNamsinh(int Namsinh) {
        this.Namsinh = Namsinh;
    }

    public String getHoten() {
        return Hoten;
    }

    public int getNamsinh() {
        return Namsinh;
    }
    void Nhap(){
        System.out.println("Nhap ho ten : ");
        this.setHoten(kb.nextLine());
        System.out.println("Nhap nam sinh : ");
        this.setNamsinh(kb.nextInt());
    }
    void Xuat(){
        System.out.println(this.Hoten+"_"+this.Namsinh);
    }
}