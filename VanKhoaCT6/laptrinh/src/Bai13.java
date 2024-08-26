import java.util.Scanner;
public class Bai13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = in.nextFloat();
        System.out.print("Nhap b: ");
        float b = in.nextFloat();
        System.out.print("Nhap c: ");
        float c = in.nextFloat();
        float max = a;
        if (b>max) {max = b;}
        if (c>max) {max = c;}
        System.out.print("So lon nhat la: " + max);
              
    }
}