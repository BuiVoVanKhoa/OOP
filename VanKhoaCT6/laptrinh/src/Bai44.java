import java.util.Scanner;
public class Bai44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        float dai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        float rong = sc.nextFloat();
        System.out.print("Dien tich: " + dientich(dai, rong));
        System.out.print("\nChu vi: " + chuvi(dai, rong));
    }
    public static double dientich(double dai, double rong){
        return dai*rong;
    }
    public static double chuvi(double dai, double rong){
        return (dai+rong)*2;
    }
}