import java.util.Scanner;
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phuong trinh bac 2: ax^2 + bx + c = 0");
        System.out.print("\nNhap a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap c: ");
        float c = sc.nextFloat();
        if (a==0)
            if (b==0)
                if (c==0)
                    System.out.print("Phuong trinh vo so no");
                else
                    System.out.print("Phuong trinh vo no");
            else
                System.out.print("Phuong trinh co 1 no: x=" +
                        -c/b);

        else {
            float delta = b * b - 4 * a * c;
            if (delta<0) {
                System.out.print("Phuong trinh vo no");
            }
            if (delta==0) {
                System.out.print("Phuong trinh co no kep: x1=x2=" +
                        -b/(2*a));
            }
            if (delta>0) {
                System.out.print("Phuong trinh co 2 no: ");
                System.out.print("\nx1="+(-b-Math.sqrt(delta))/(2*a));
                System.out.print("\nx2="+(-b+Math.sqrt(delta))/(2*a));
            }
        }
    }
}
