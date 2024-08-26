import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("So lon nhat la: ");
        if (a>b) System.out.print(a);
        else System.out.print(b);
    }
}
