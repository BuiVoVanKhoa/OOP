import java.util.Scanner;
public class Bai45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        double r=sc.nextDouble();
        while (r<=0){
            System.out.print("Nhap lai: ");
            r=sc.nextDouble();
        }
        System.out.println("Dien tich hinh tron: "+DienTich(r));
    }
    public static double DienTich(double r){
        return 3.14*r*r;
    }
}
