import java.util.Scanner;
public class Bai22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a=sc.nextInt();
        System.out.print("Nhap b: ");
        int b=sc.nextInt();
        System.out.print("Nhap c: ");
        int c=sc.nextInt();
        if ((a+b>c) && (a+c>b) && (b+c>a)) {
            System.out.print("Tam giac ton tai\n");
            if ((a==b) && (a==c))
                System.out.print("Day la tam giac deu");
            else
                if ((a==b) || (a==c) || (b==c))
                    if ((a*a+b*b==c*c) || (a*a+c*c==b*b) || (b*b+c*c==a*a))
                        System.out.print("Day la tam giac vuong can");
                    else
                        System.out.print("Day la tam giac can");
                else
                    if ((a*a+b*b==c*c) || (a*a+c*c==b*b) || (b*b+c*c==a*a))
                        System.out.print("Day la tam giac vuong");
        }
        else
            System.out.print("Tam giac khong ton tai");
    }
}
