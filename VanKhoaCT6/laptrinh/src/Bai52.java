import java.util.Scanner;
public class Bai52 {
    static double duongcao(double a, double dientich){
        double duongcao=2*dientich/a;
        return duongcao;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Tam giac");
        System.out.print("\nNhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();
        if (a+b>c && a+c>b && b+c>a){
            double p = (a+b+c)/2,
                    dientich=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.print("Dien tich: "+dientich);
            System.out.print("\nDuong cao canh a: "+duongcao(a, dientich));
            System.out.print("\nDuong cao canh b: "+duongcao(b, dientich));
            System.out.print("\nDuong cao canh c: "+duongcao(c, dientich));
        }
        else
        System.out.print("Tam giac khong ton tai");
    }
}