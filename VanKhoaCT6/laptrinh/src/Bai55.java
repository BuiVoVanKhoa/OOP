import java.util.Scanner;
public class Bai55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Nhap a: ");
        int a=sc.nextInt();
        System.out.print("Nhap b: ");
        int b=sc.nextInt();
        int tam=a;
        a=b;
        b=tam;
        System.out.print("Hoan vi: "+a+" "+b);
    }
}
