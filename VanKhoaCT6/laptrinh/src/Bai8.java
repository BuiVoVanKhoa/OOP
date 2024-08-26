import java.util.Scanner;
public class Bai8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so giay: ");
        double giay = in.nextDouble();
        System.out.print("Tuong duong: "+(long)giay/3600+"h "
                +(long)giay%3600/60+"m "
                +giay%3600%60+"s");
       
    }
}