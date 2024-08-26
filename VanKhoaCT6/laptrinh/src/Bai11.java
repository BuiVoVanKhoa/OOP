import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("1: Tam giac"
                + "\n2: Hinh tron"
                + "\n3: Hinh vuong"
                + "\n4: Hinh chu nhat"
                + "\nChon hinh: ");
        int h = in.nextByte();
        switch (h) {
            case 1:
                System.out.print("1: Tam giac");
                System.out.print("\nNhap canh a: ");
                double a = in.nextDouble();
                System.out.print("Nhap canh b: ");
                double b = in.nextDouble();
                System.out.print("Nhap canh c: ");
                double c = in.nextDouble();
                double p = (a+b+c)/2;
                System.out.print("Chu vi: " + 2*p);
                System.out.print("\nDien tich: "
                        + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
                break;
            case 2:
                System.out.print("2: Hinh tron");
                System.out.print("\nNhap ban kinh: ");
                a = in.nextDouble();
                System.out.print("Chu vi: "+2*3.14*a);
                System.out.print("\nDien tich: "+3.14*a*a);
                break;
            case 3:
                System.out.print("3: Hinh vuong");
                System.out.print("\nNhap canh: ");
                a = in.nextDouble();
                System.out.print("Chu vi: "+a*4);
                System.out.print("\nDien tich: "+a*a);
                break;
            case 4:
                System.out.print("4: Hinh chu nhat");
                System.out.print("\nNhap chieu dai: ");
                a = in.nextDouble();
                System.out.print("Nhap chieu rong: ");
                b = in.nextDouble();
                System.out.print("Chu vi: "+(a+b)*2);
                System.out.print("\nDien tich: "+a*b);
                break;
        }
    }
}
