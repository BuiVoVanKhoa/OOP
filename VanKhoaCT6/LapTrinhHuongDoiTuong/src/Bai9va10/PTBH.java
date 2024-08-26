package Bai9va10;
import java.util.*;
public class PTBH{    
    // Thuộc tính
    // Tiền tố   KDL Tên_thuộc_tính
    private double a,b,c;
    // Constructor
    public PTBH (double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
    }
    // Phương thức
    public void giaiPTBH(){
        if(a != 0){
            double detal = b*b-4*a*c;
            if(detal > 0){
                double x1 = (-b+Math.sqrt(detal))/(2*a);
                double x2 = (-b-Math.sqrt(detal))/(2*a);
                System.out.println("Phuong trinh co nghiem la X1 : "+x1+"\t X2 : "+x2);
            }
            else if(detal < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else{
                double x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem la : "+x);
            }
        }
        else {
            System.out.println("Khong la phuong trinh bac hai");
        }
    }
}