import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = in.nextInt();
        System.out.print("Nhap b: ");
        int b = in.nextInt();
        System.out.print("Tong: "+(a+b));
        System.out.print("\nHieu: "+(a-b));
        System.out.print("\nTich: "+a*b);
        System.out.print("\nnThuong: "+(float)a/b);
    }
}
